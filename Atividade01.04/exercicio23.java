package Atividade;
import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) { // Fecha automaticamente
            System.out.println("Digite um numero de 3 digitos:");
            int numero = input.nextInt();
            
            if (numero < 100 || numero > 999) {
                System.out.println("Por favor, digite um numero de 3 digitos (100-999).");
                return;
            }
            
            int dezena = (numero % 100) / 10;
            System.out.println("O digito da dezena eh: " + dezena);
        }
    }
}
