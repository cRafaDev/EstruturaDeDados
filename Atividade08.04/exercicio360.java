import java.util.Scanner;

public class exercicio360 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ultdia = new int[12];
        String[] signo = new String[12];
        int data, dia, mes;

        for(int i = 0; i < 12; i++) {
            System.out.print("\ndigite signo: ");
            signo[i] = input.nextLine();
            System.out.print("\ndigite ultimo dia: ");
            ultdia[i] = input.nextInt();
            input.nextLine();
        }

        System.out.print("\ndigite data no formato ddmm ou 9999 para terminar: ");
        data = input.nextInt();

        while(data != 9999) {
            dia = data / 100;
            mes = data % 100;
            mes--;

            if(dia > ultdia[mes]) {
                mes = (mes + 1) % 12;
            }

            System.out.println("\nsigno: " + signo[mes]);
            System.out.print("\ndigite data no formato ddmm ou 9999 para terminar: ");
            data = input.nextInt();
        }
        System.out.println();
    }
}