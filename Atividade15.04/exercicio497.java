import java.util.Scanner;
import java.util.Arrays;

public class exercicio497 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int c, n;

        for (int l = 0; l < 10; l++) {
            System.out.print("Digite numero " + (l + 1) + ": ");
            num[l] = sc.nextInt();
        }

        System.out.print("Digite numero de busca: ");
        n = sc.nextInt();

        ordena(num, 10);
        c = busca(num, 10, n);

        System.out.println("\nVETOR");
        for (int l = 0; l < 10; l++) {
            System.out.println((l + 1) + " - " + num[l]);
        }

        c++;
        if (c != 0) {
            System.out.println("\n\nposicao no vetor: " + c);
        } else {
            System.out.println("\n\nNAO ENCONTRADO");
        }

        System.out.println();
        sc.close();
    }

    public static void ordena(int[] vet, int tam) {
        Arrays.sort(vet);
    }

    public static int busca(int[] vet, int tam, int chave) {
        int ini = 0, fim = tam - 1, meio;

        while (ini <= fim) {
            meio = (ini + fim) / 2;
            if (chave == vet[meio]) {
                return meio;
            } else {
                if (chave < vet[meio]) {
                    fim = meio - 1;
                } else {
                    ini = meio + 1;
                }
            }
        }

        return -1;
    }
}
