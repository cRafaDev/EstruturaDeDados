import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class TorresDeHanoi {

    public static void main(String[] args) {
        int n = 40; // Número de discos
        boolean habilitarImpressaoDosMovimentos = false; // Padrão para não imprimir

        if (n <= 5) { // Por exemplo, habilitar impressão apenas para N <= 5
            habilitarImpressaoDosMovimentos = true;
        } else {
            System.out.println("Para N=" + n + ", a impressão detalhada dos movimentos foi desabilitada.");
            System.out.println("O programa medirá o tempo da estrutura de tarefas recursivas.");
        }

        long startTime = System.currentTimeMillis();

        long numeroDeMovimentosTeorico = (long) Math.pow(2.0, n) - 1L;

        ForkJoinPool pool = new ForkJoinPool();

        pool.invoke(new HanoiTask(n, 'A', 'C', 'B', habilitarImpressaoDosMovimentos));
        pool.shutdown(); // É uma boa prática desligar o pool quando não for mais usado.

        long endTime = System.currentTimeMillis();
        long tempoTotalMilissegundos = endTime - startTime;
        long tempoTotalSegundos = tempoTotalMilissegundos / 1000L;
        long milissegundosRestantes = tempoTotalMilissegundos % 1000L;
        long minutos = tempoTotalSegundos / 60L;
        long segundos = tempoTotalSegundos % 60L;

        System.out.println("----------------------------------------------------");
        System.out.println("Número de discos: " + n);
        System.out.println("Número de movimentos (teórico): " + numeroDeMovimentosTeorico);
        System.out.format("Tempo Levado: %02d Minutos %02d Segundos %d Milissegundos%n",
                minutos, segundos, milissegundosRestantes);
        System.out.println("----------------------------------------------------");
    }

    static class HanoiTask extends RecursiveAction {

        private static final int SEQUENTIAL_THRESHOLD = 10;

        final int numeroDeDiscosNaTarefa; // n para esta tarefa específica
        final char pinoOrigem;
        final char pinoDestino;
        final char pinoAuxiliar;
        final boolean deveImprimirMovimentos;

        HanoiTask(int n, char origem, char destino, char auxiliar, boolean print) {
            this.numeroDeDiscosNaTarefa = n;
            this.pinoOrigem = origem;
            this.pinoDestino = destino;
            this.pinoAuxiliar = auxiliar;
            this.deveImprimirMovimentos = print;
        }

        @Override
        protected void compute() {
            if (this.numeroDeDiscosNaTarefa <= SEQUENTIAL_THRESHOLD) {

                resolverSequencialmente(this.numeroDeDiscosNaTarefa, this.pinoOrigem, this.pinoDestino, this.pinoAuxiliar);
            } else {

                HanoiTask task1 = new HanoiTask(this.numeroDeDiscosNaTarefa - 1,
                        this.pinoOrigem, this.pinoAuxiliar, this.pinoDestino,
                        this.deveImprimirMovimentos);

                HanoiTask task3 = new HanoiTask(this.numeroDeDiscosNaTarefa - 1,
                        this.pinoAuxiliar, this.pinoDestino, this.pinoOrigem,
                        this.deveImprimirMovimentos);

                task1.invoke(); // Executa e espera a conclusão da task1.

                // Passo 2: Mover o disco maior (numeroDeDiscosNaTarefa) do pinoOrigem para o pinoDestino.
                if (this.deveImprimirMovimentos) {
                    System.out.println("Mover disco " + this.numeroDeDiscosNaTarefa +
                            " de " + this.pinoOrigem + " para " + this.pinoDestino);
                }

                task3.invoke(); // Executa e espera a conclusão da task3.
            }
        }

        private void resolverSequencialmente(int nDiscos, char origem, char destino, char auxiliar) {
            if (nDiscos == 1) {
                // Caso base: mover um único disco.
                if (this.deveImprimirMovimentos) {
                    System.out.println("Mover disco 1 de " + origem + " para " + destino);
                }
            } else {
                // Passo recursivo 1: Mover n-1 discos da origem para o auxiliar.
                resolverSequencialmente(nDiscos - 1, origem, auxiliar, destino);

                // Passo intermediário: Mover o n-ésimo disco (o maior do subproblema atual) da origem para o destino.
                if (this.deveImprimirMovimentos) {
                    System.out.println("Mover disco " + nDiscos + " de " + origem + " para " + destino);
                }

                resolverSequencialmente(nDiscos - 1, auxiliar, destino, origem);
            }
        }
    }
}