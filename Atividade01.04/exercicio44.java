package Atividade;
import java.util.Scanner;
import static java.lang.Math.*;

public class exercicio44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEntre com o logaritmando: ");
        double num = input.nextDouble();
        
        System.out.print("\nEntre com a base: ");
        double base = input.nextDouble();
        
        double logaritmo = log(num) / log(base);
        
        System.out.println("\nO logaritmo de " + num + " na base " + base + " é: " + logaritmo);
        System.out.println();
    }
}