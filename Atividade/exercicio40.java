package Atividade;
import java.util.Scanner;

public class exercicio40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEntre com o dividendo: ");
        int val1 = input.nextInt();
        
        System.out.print("\nEntre com o divisor: ");
        int val2 = input.nextInt();
        
        int quoc = val1 / val2;
        int rest = val1 % val2;
        
        System.out.println("\n\n");
        System.out.println("dividendo: " + val1);
        System.out.println("divisor: " + val2);
        System.out.println("quociente: " + quoc);
        System.out.println("resto: " + rest);
        System.out.println();
    }
}