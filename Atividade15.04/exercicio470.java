import java.util.Scanner;

public class exercicio470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, numi, n;

        System.out.print("\ndigite dividendo: ");
        num = sc.nextInt();

        System.out.print("\ndigite divisor: ");
        numi = sc.nextInt();

        while (numi > num) {
            System.out.print("\nINVALIDO. digite numero menor do que o dividendo: ");
            numi = sc.nextInt();
        }

        n = divisor(num, numi);

        if (n == 0) {
            System.out.println("\nNenhuma vez");
        } else {
            System.out.println("\nNumero de vezes: " + n);
        }

        System.out.println();
        sc.close();
    }

    public static int divisor(int x, int y) {
        int r = x % y;
        int nl = 0;

        while (r == 0) {
            nl++;
            x = x / y;
            r = x % y;
        }

        return nl;
    }
}
