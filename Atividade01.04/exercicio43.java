package Atividade;

import java.util.Scanner;
import static java.lang.Math.*;

public class exercicio43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEntre com o logaritmando: ");
        double num = input.nextDouble();
        
        double logaritmo = log10(num);
        
        System.out.println("\nLogaritmo: " + logaritmo);
        System.out.println();
    }
}