import java.util.Scanner;

public class exercicio348 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[5];
        double[] pr1 = new double[5];
        double[] pr2 = new double[5];
        double[] media = new double[5];


        for(int L = 0; L < 5; L++) {
            System.out.print("\nDigite " + (L+1) + "° nome: ");
            nomes[L] = input.nextLine();

            System.out.print("Digite 1a nota: ");
            pr1[L] = input.nextDouble();

            System.out.print("Digite 2a nota: ");
            pr2[L] = input.nextDouble();
            input.nextLine();

            media[L] = (pr1[L] + pr2[L]) / 2;
        }


        System.out.println("\n\n\t\t\t\tRELACAO FINAL");
        for(int L = 0; L < 5; L++) {
            System.out.println("\n" + (L+1) + " - " + nomes[L]);
            System.out.println(pr1[L] + "\t" + pr2[L] + "\t" + media[L]);
        }
        System.out.println();
    }
}