import java.util.Scanner;

public class exercicio354 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[15];

        for(int L = 0; L < 15; L++) {
            System.out.print("\nDigite " + (L+1) + "° número: ");
            num[L] = input.nextInt();
        }

        System.out.println("\nRELACAO DOS NUMEROS");
        for(int L = 0; L < 15; L++) {
            System.out.print("\n" + (L+1) + " - " + num[L]);
            if(num[L] % 2 == 0) {
                System.out.print(" é PAR");
            } else {
                System.out.print(" é IMPAR");
            }
        }
        System.out.println();
    }
}