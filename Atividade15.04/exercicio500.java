Segue abaixo o código `exercicio500.java` completo, funcional, em Java padrão, exatamente como você descreveu, com as proteções para uso correto das opções do menu:

        ```java
import java.util.Scanner;

public class exercicio500 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int op;
        boolean flagA = false, flagB = false;

        for (int i = 0; i < 5; i++) {
            vetorA[i] = 0;
            vetorB[i] = 0;
        }

        do {
            System.out.println("\n\n\nVETORES");
            System.out.println("1 Dados do VETOR A");
            System.out.println("2 Dados do VETOR B");
            System.out.println("3 Imprime VETORES");
            System.out.println("4 Soma VETORES");
            System.out.println("5 Subtrai VETORES");
            System.out.println("6 Sai do programa");
            System.out.print("OPCAO: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    entrada(vetorA, 5, "A", sc);
                    flagA = true;
                    break;
                case 2:
                    entrada(vetorB, 5, "B", sc);
                    flagB = true;
                    break;
                case 3:
                    if (flagA && flagB) {
                        imprime(vetorA, 5, "A");
                        imprime(vetorB, 5, "B");
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;
                case 4:
                    if (flagA && flagB) {
                        soma(vetorA, vetorB, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;
                case 5:
                    if (flagA && flagB) {
                        subtrai(vetorA, vetorB, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;
                case 6:
                    System.out.println("\nSaindo do Algoritmo");
                    break;
                default:
                    System.out.println("\nOpcao invalida");
            }

        } while (op != 6);

        sc.close();
    }

    public static void entrada(int[] vet, int t, String nome, Scanner sc) {
        System.out.println("\nEntrada do VETOR " + nome);
        for (int i = 0; i < t; i++) {
            System.out.print("Digite numero " + (i + 1) + ": ");
            vet[i] = sc.nextInt();
        }
    }

    public static void imprime(int[] vet, int t, String nome) {
        System.out.println("\nVETOR " + nome);
        for (int i = 0; i < t; i++) {
            System.out.println(vet[i]);
        }
    }

    public static void soma(int[] vetA, int[] vetB, int t) {
        System.out.println("\nSOMA");
        for (int i = 0; i < t; i++) {
            System.out.println(vetA[i] + vetB[i]);
        }
    }

    public static void subtrai(int[] vetA, int[] vetB, int t) {
        System.out.println("\nDIFERENCA");
        for (int i = 0; i < t; i++) {
            System.out.println(vetA[i] - vetB[i]);
        }
    }
}

