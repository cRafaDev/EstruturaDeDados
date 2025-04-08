import java.util.Scanner;

public class exercicio346 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase = "";
        int op;

        do {
            System.out.println("\nMENU");
            System.out.println("1 - Imprime o comprimento da frase");
            System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.print("OPCAO: ");
            op = input.nextInt();
            input.nextLine();

            switch(op) {
                case 1:
                    System.out.print("\nDigite uma frase: ");
                    frase = input.nextLine();
                    System.out.println("\nNúmero de caracteres da frase: " + frase.length());
                    break;

                case 2:
                    System.out.print("\nDigite uma frase: ");
                    frase = input.nextLine();
                    if(frase.length() >= 2) {
                        System.out.println("\nOs dois primeiros caracteres: " + frase.substring(0, 2));
                        System.out.println("Os dois últimos caracteres: " + frase.substring(frase.length()-2));
                    } else {
                        System.out.println("\nA frase precisa ter pelo menos 2 caracteres!");
                    }
                    break;

                case 3:
                    System.out.print("\nDigite uma frase: ");
                    frase = input.nextLine();
                    System.out.print("\nFrase espelhada: ");
                    for(int x = frase.length()-1; x >= 0; x--) {
                        System.out.print(frase.charAt(x));
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("\nFim do algoritmo");
                    break;

                default:
                    System.out.println("\nOpção não disponível");
            }
            System.out.println("\n");
        } while(op != 4);
    }
}