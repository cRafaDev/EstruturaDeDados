import java.util.Scanner;

public class exercicio351 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[5];
        int num;

        for(int L = 0; L < 5; L++) {
            System.out.print("\nNome " + (L+1) + ": ");
            nomes[L] = input.nextLine();
        }

        do {
            System.out.print("\nDigite o número da pessoa (1-5): ");
            num = input.nextInt();
            if(num < 1 || num > 5) {
                System.out.println("\nNúmero fora do intervalo!");
            }
        } while(num < 1 || num > 5);

        System.out.println("\n" + nomes[num-1]);
        System.out.println();
    }
}