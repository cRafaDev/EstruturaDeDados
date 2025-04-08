import java.util.Scanner;

public class exercicio419 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[5][5];
        int[][] B = new int[5][5];
        int[][] DIF = new int[5][5];

        for(int L = 0; L < 5; L++) {
            for(int c = 0; c < 5; c++) {
                System.out.print("\ndigite elemento de A[" + (L+1) + "][" + (c+1) + "]: ");
                A[L][c] = input.nextInt();
            }
        }

        for(int L = 0; L < 5; L++) {
            for(int c = 0; c < 5; c++) {
                System.out.print("\ndigite elemento de B[" + (L+1) + "][" + (c+1) + "]: ");
                B[L][c] = input.nextInt();
                DIF[L][c] = A[L][c] - B[L][c];
            }
        }

        System.out.println("\n\tMATRIZ DIFERENCA\n");
        for(int L = 0; L < 5; L++) {
            for(int c = 0; c < 5; c++) {
                System.out.print("\t" + DIF[L][c]);
            }
            System.out.println();
        }
        System.out.println();
    }
}