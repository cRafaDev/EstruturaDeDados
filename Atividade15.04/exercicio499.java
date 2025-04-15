import java.util.Scanner;

public class exercicio499 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];
        int flag = 0;
        int op;

        for(int L = 0; L < 5; L++) {
            num[L] = 0;
        }

        do {
            System.out.println("\n\n\n");
            System.out.println(" MENU VETOR - FUNCAO \n");
            System.out.println("1. Dados do VETOR");
            System.out.println("2. Ordena VETOR");
            System.out.println("3. Imprime VETOR");
            System.out.println("4. Sai do programa");
            System.out.print("OPCAO: ");
            op = input.nextInt();

            switch(op) {
                case 1:
                    entrada(num, 5);
                    flag = 1;
                    break;
                case 2:
                    if(flag == 1) {
                        ordena(num, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcao 1");
                    }
                    break;
                case 3:
                    if(flag == 1) {
                        imprime(num, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcao 1");
                    }
                    break;
                case 4:
                    System.out.println("\nSaindo do Algoritmo");
                    break;
                default:
                    System.out.println("\nOpcao invalida");
            }
        } while(op != 4);
        System.out.println();
    }

    static void entrada(int[] vet, int t) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEntrada do VETOR");
        for(int L = 0; L < t; L++) {
            System.out.print("Digite numero " + (L+1) + ": ");
            vet[L] = input.nextInt();
        }
    }

    static void imprime(int[] vet, int t) {
        System.out.println("\nVETOR");
        for(int L = 0; L < t; L++) {
            System.out.println(vet[L]);
        }
    }

    static void ordena(int[] vet, int tam) {
        for(int L1 = 0; L1 < tam-1; L1++) {
            for(int cl = L1+1; cl < tam; cl++) {
                if(vet[L1] > vet[cl]) {
                    int aux = vet[L1];
                    vet[L1] = vet[cl];
                    vet[cl] = aux;
                }
            }
        }
    }
}