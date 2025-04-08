import java.util.Scanner;

public class exercicio398 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] cod = new int[50];
        int[] quant = new int[50];
        double[] preco = new double[50];
        int k = 0;
        double geral = 0.0;

        System.out.print("\nDigite o codigo do produto ou -1 para acabar: ");
        int codi = input.nextInt();

        while(k < 50 && codi != -1) {
            cod[k] = codi;
            System.out.print("\nDigite a quantidade do produto: ");
            quant[k] = input.nextInt();
            System.out.print("\nDigite o preco do produto: ");
            preco[k] = input.nextDouble();
            k++;
            System.out.print("\nDigite o codigo do produto ou -1 para acabar: ");
            codi = input.nextInt();
        }

        System.out.print("\nDigite o codigo do produto para venda ou 0 para acabar: ");
        int codigo = input.nextInt();

        while(codigo != 0) {
            int i = 0;
            while(i < k && codigo != cod[i]) {
                i++;
            }

            if(i < k) {
                System.out.print("\nDigite a quantidade requerida: ");
                int quantidade = input.nextInt();

                if(quant[i] >= quantidade) {
                    quant[i] -= quantidade;
                    double venda = quantidade * preco[i];
                    geral += venda;
                    System.out.println("\nVenda realizada: R$" + venda);
                } else {
                    System.out.println("\nEstoque Insuficiente");
                }
            } else {
                System.out.println("\nProduto Nao-Cadastrado");
            }

            System.out.print("\nDigite o codigo do produto para venda ou 0 para acabar: ");
            codigo = input.nextInt();
        }

        for(int i = 0; i < k-1; i++) {
            for(int j = i+1; j < k; j++) {
                if(quant[i] < quant[j]) {
                    int aux = quant[i];
                    quant[i] = quant[j];
                    quant[j] = aux;

                    int auxCod = cod[i];
                    cod[i] = cod[j];
                    cod[j] = auxCod;

                    double auxPreco = preco[i];
                    preco[i] = preco[j];
                    preco[j] = auxPreco;
                }
            }
        }

        System.out.println("\nTotal vendido no dia: R$" + geral);
        System.out.println("\nRelacao de produtos em estoque (ordem decrescente):");
        System.out.println("Codigo\tQuantidade\tPreco");
        for(int i = 0; i < k; i++) {
            System.out.println(cod[i] + "\t" + quant[i] + "\t\t" + preco[i]);
        }
    }
}