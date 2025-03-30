package Atividade;
import java.util.Scanner;

public class exercicio46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nDigite saldo: ");
        double saldo = input.nextDouble();
        
        double nsaldo = saldo * 1.01;
        
        System.out.println("\nNovo saldo: " + nsaldo);
        System.out.println();
    }
}