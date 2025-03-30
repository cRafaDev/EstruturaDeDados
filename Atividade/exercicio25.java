package Atividade;
import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) { // Fecha automaticamente
            System.out.println("\nDigite data no formato ddmmaa:");
            int data = input.nextInt();
            
            // Validação básica (6 dígitos)
            if (data < 100000 || data > 999999) {
                System.out.println("Formato inválido! Use 6 dígitos (ddmmaa).");
                return;
            }
            
            int dia = data / 10000;
            int mes = (data % 10000) / 100;
            int ano = data % 100;
            
            System.out.println("\nDIA: " + dia);
            System.out.println("MES: " + mes);
            System.out.println("ANO: " + ano);
            System.out.println();
        }
    }
}