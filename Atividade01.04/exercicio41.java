package Atividade;
import java.util.Scanner;

public class exercicio41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEntre com 1 numero: ");
        double a = input.nextDouble();
        
        System.out.print("\nEntre com 2 numero: ");
        double b = input.nextDouble();
        
        System.out.print("\nEntre com 3 numero: ");
        double c = input.nextDouble();
        
        System.out.print("\nEntre com 4 numero: ");
        double d = input.nextDouble();
        
        double mp = (a*1 + b*2 + c*3 + d*4)/10;
        
        System.out.println("\nMedia ponderada: " + mp);
        System.out.println();
    }
}