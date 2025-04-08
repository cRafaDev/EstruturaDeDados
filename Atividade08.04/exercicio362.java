import java.util.Scanner;

public class exercicio362 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] vet2 = new int[20];
        int[] vetc = new int[10];
        int L = 0;

        System.out.println("\nentrada de dados do vetor 1 (10 elementos)");
        for(int i = 0; i < 10; i++) {
            System.out.print("\nentre com " + (i + 1) + " elemento: ");
            vet1[i] = input.nextInt();
        }

        System.out.println("\nentrada de dados do vetor 2 (20 elementos)");
        for(int i = 0; i < 20; i++) {
            System.out.print("\nentre com " + (i + 1) + " elemento: ");
            vet2[i] = input.nextInt();
        }

        for(int i = 0; i < 10; i++) {
            vetc[i] = -999999999;
        }

        for(int i = 0; i < 10; i++) {
            boolean found = false;
            for(int c = 0; c < 20; c++) {
                if(vet1[i] == vet2[c]) {
                    found = true;
                    break;
                }
            }
            if(found) {
                boolean alreadyExists = false;
                for(int d = 0; d < L; d++) {
                    if(vet1[i] == vetc[d]) {
                        alreadyExists = true;
                        break;
                    }
                }
                if(!alreadyExists) {
                    vetc[L] = vet1[i];
                    L++;
                }
            }
        }

        if(L != 0) {
            System.out.println("\n\nElementos comuns\n");
            for(int i = 0; i < L; i++) {
                System.out.println("\n" + vetc[i]);
            }
        } else {
            System.out.println("\n\nNao existem elementos comuns");
        }
        System.out.println();
    }
}