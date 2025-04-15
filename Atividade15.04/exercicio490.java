import java.util.Scanner;

public class exercicio490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[10];

        for (int l = 0; l < 10; l++) {
            System.out.print("digite palavra em letras minusculas " + (l + 1) + ": ");
            nome[l] = sc.nextLine();
            restantes(nome, l, nome[l].length(), 'c');
        }

        for (int l = 0; l < 10; l++) {
            System.out.println((l + 1) + " - " + nome[l]);
        }

        System.out.println();
        sc.close();
    }

    public static int restantes(String[] vetor, int indice, int tam, char x) {
        int cont = 0;
        char[] letras = vetor[indice].toCharArray();

        for (int i = 0; i < tam; i++) {
            if (letras[i] == x) {
                letras[i] = '*';
                cont++;
            }
        }

        vetor[indice] = new String(letras);
        return cont;
    }
}
