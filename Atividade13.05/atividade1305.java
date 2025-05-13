import java.util.ArrayDeque;
import java.util.Deque;

public class PilhaInverterPalavras {

    public static void main(String[] args) {
        String exemplo1 = "UM CIENTISTA DA COMPUTAÇAO E UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE";
        String exemplo2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E O OGOLÓNCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OÃS SO SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED .SAIOG";

        System.out.println(inverterPalavras(exemplo1));
        System.out.println(inverterPalavras(exemplo2));
    }

    public static String inverterPalavras(String texto) {
        String[] palavras = texto.trim().split("\\s+");
        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras) {
            resultado.append(inverterPalavra(palavra)).append(" ");
        }

        return resultado.toString().trim();
    }

    private static String inverterPalavra(String palavra) {
        Deque<Character> pilha = new ArrayDeque<>();
        for (char c : palavra.toCharArray()) {
            pilha.push(c);
        }
        StringBuilder palavraInvertida = new StringBuilder();
        while (!pilha.isEmpty()) {
            palavraInvertida.append(pilha.pop());
        }
        return palavraInvertida.toString();
    }
}