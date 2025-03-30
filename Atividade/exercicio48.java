package Atividade;
import java.util.Scanner;

public class exercicio48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEntre com o salário mínimo: ");
        double sm = input.nextDouble();
        
        System.out.print("\nEntre com a quantidade em quilowatt: ");
        double qtdade = input.nextDouble();
        
        double preco = sm / 7 / 100;
        double vp = preco * qtdade;
        double vd = vp * 0.9;
        
        System.out.println("\nPreço do quilowatt: " + preco);
        System.out.println("Valor a ser pago: " + vp);
        System.out.println("Valor com desconto: " + vd);
        System.out.println();
    }
}