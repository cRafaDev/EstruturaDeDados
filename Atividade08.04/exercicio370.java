import java.util.Scanner;

public class exercicio370 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] voos = new int[1000];
        String[] nome = new String[1000];
        String id, nvd;
        int nv, i;

        System.out.print("\nEntre com o numero de voos: ");
        nv = input.nextInt();
        input.nextLine();

        for(i = 0; i < nv; i++) {
            System.out.print("\nEntre com a identificacao do voo " + (i + 1) + ": ");
            nome[i] = input.nextLine();
            System.out.print("\nEntre com a quantidade de lugares disponiveis no voo " + nome[i] + ": ");
            voos[i] = input.nextInt();
            input.nextLine();
        }

        System.out.print("\nEntre com o numero do voo desejado ou @ para terminar: ");
        nvd = input.nextLine();

        while(!nvd.equals("@")) {
            i = 0;
            while(i < nv && !nvd.equals(nome[i])) {
                i++;
            }

            if(i < nv && nvd.equals(nome[i])) {
                if(voos[i] > 0) {
                    voos[i]--;
                    System.out.print("\nQual o numero da identidade do cliente? ");
                    id = input.nextLine();
                    System.out.println("\nIdentidade: " + id + " Voo: " + nvd + "\n");
                } else {
                    System.out.println("\nNao existem mais lugares neste voo.\n");
                }
            } else {
                System.out.println("\nNao existe este voo\n");
            }

            System.out.print("\nEntre com o numero do voo desejado ou @ para terminar: ");
            nvd = input.nextLine();
        }
        System.out.println();
    }
}