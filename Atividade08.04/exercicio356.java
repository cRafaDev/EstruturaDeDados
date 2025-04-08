import java.util.Scanner;

public class exercicio356 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[15];
        String[] sit = new String[15];
        double[] pr1 = new double[15];
        double[] pr2 = new double[15];
        int[] media = new int[15];

        for(int L = 0; L < 15; L++) {
            System.out.print("\n\nDigite " + (L+1) + " nome: ");
            nomes[L] = input.nextLine();
            while(nomes[L].length() > 30) {
                System.out.println("\nNomes com até 30 caracteres");
                System.out.print("\n\nDigite " + (L+1) + " nome: ");
                nomes[L] = input.nextLine();
            }

            int t = 30 - nomes[L].length();
            for(int c = 0; c < t; c++) {
                nomes[L] += " ";
            }

            System.out.print("\ndigite 1 nota: ");
            pr1[L] = input.nextDouble();
            System.out.print("\ndigite 2 nota: ");
            pr2[L] = input.nextDouble();
            input.nextLine();

            media[L] = (int)Math.round((pr1[L] + pr2[L])/2);
            if(media[L] >= 5) {
                sit[L] = "AP";
            } else {
                sit[L] = "RP";
            }
        }

        System.out.println("\n\n\n\t\t\t\tRELACAO FINAL\n");
        for(int L = 0; L < 15; L++) {
            System.out.println("\n" + (L+1) + "- " + nomes[L] + "\t" + pr1[L] + "\t" + pr2[L] + "\t" + media[L] + "\t" + sit[L]);
        }
        System.out.println();
    }
}