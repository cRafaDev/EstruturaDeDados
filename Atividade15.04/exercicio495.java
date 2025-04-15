import java.util.Scanner;

public class exercicio495 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nome = new String[5];

        for(int L = 0; L < 5; L++) {
            System.out.print("Digite nome: ");
            nome[L] = input.nextLine();
        }

        ordena(nome, 5);

        System.out.println("\n\nNOMES ORDENADOS\n");
        for(int L = 0; L < 5; L++) {
            System.out.println("\n" + (L + 1) + " - " + nome[L]);
        }
        System.out.println();
    }

    static void ordena(String[] vet, int tam) {
        for(int Li = 0; Li < tam-1; Li++) {
            for(int ci = Li+1; ci < tam; ci++) {
                if(vet[Li].compareTo(vet[ci]) > 0) {
                    String aux = vet[Li];
                    vet[Li] = vet[ci];
                    vet[ci] = aux;
                }
            }
        }
    }
}