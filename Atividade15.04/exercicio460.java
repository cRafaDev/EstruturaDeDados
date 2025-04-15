import java.util.Scanner;

public class exercicio460 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int c = 0; c < 3; c++) {
            System.out.print("\n\ndigite numero: ");
            int a = input.nextInt();
            System.out.print("dobro: " + dob(a));
        }
        System.out.println("\n");
    }

    static int dob(int x) {
        return x * 2;
    }
}