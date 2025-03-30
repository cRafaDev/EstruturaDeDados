package Atividade;
import java.util.Scanner;

public class exercicio26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nDigite data no formato ddmmaa:");
        int data = input.nextInt();
        
        // Validação: Verifica se tem 6 dígitos
        if (data < 100000 || data > 999999) {
            System.out.println("Formato inválido! Use 6 dígitos (ddmmaa).");
            input.close();
            return;
        }
        
        int dia = data / 10000;
        int mes = (data % 10000) / 100;
        int ano = data % 100;
        
        // Validação opcional: dia (1-31) e mês (1-12)
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
            System.out.println("Data inválida! Verifique dia e mês.");
            input.close();
            return;
        }
        
        System.out.println("\nDIA: " + dia);
        System.out.println("MES: " + mes);
        System.out.println("ANO: " + ano);
        System.out.println();
        
        input.close(); // Fecha o Scanner manualmente
    }
}