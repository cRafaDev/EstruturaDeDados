import java.util.Scanner;

public class exercicio394 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] nota1 = new double[50];
        double[] nota2 = new double[50];
        double[] media = new double[50];
        String[] nomes = new String[50];
        String op;
        int flag = 0, flag1 = 0, flag2 = 0;

        do {
            System.out.println("\n\n\n");
            System.out.println(" MENU\n");
            System.out.println("1 - ENTRAR NOMES");
            System.out.println("2 - ENTRAR 1 NOTA");
            System.out.println("3 - ENTRAR 2 NOTA");
            System.out.println("4 - CALCULAR MEDIA");
            System.out.println("5 - LISTAR NO DISPLAY");
            System.out.println("6 - SAIR");
            System.out.print("OPCAO:");
            op = input.nextLine();

            if(op.equals("1")) {
                flag = 1;
                for(int L = 0; L < 50; L++) {
                    System.out.print("\nDigite " + (L+1) + " nome (com ate 30 caracteres e todas as letras maiusculas): ");
                    nomes[L] = input.nextLine().toUpperCase();
                    while(nomes[L].length() > 30) {
                        System.out.print("\nNome com ate 30 caracteres. Digite " + (L+1) + " nome (todas as letras maiusculas): ");
                        nomes[L] = input.nextLine().toUpperCase();
                    }
                    int tam = nomes[L].length();
                    if(tam < 30) {
                        for(int c = 0; c < 30 - tam; c++) {
                            nomes[L] += " ";
                        }
                    }
                }
            }
            else if(op.equals("2")) {
                if(flag == 0) {
                    System.out.println("\nNAO TEM NOME CADASTRADO");
                }
                else {
                    for(int L = 0; L < 50; L++) {
                        System.out.print("\nDigite 1 nota para " + nomes[L] + ": ");
                        nota1[L] = input.nextDouble();
                        input.nextLine();
                    }
                    flag1 = 1;
                }
            }
            else if(op.equals("3")) {
                if(flag == 0) {
                    System.out.println("\nNAO TEM NOME CADASTRADO");
                }
                else {
                    for(int L = 0; L < 50; L++) {
                        System.out.print("\nDigite 2 nota para " + nomes[L] + ": ");
                        nota2[L] = input.nextDouble();
                        input.nextLine();
                    }
                    flag2 = 1;
                }
            }
            else if(op.equals("4")) {
                if(flag == 0 || flag1 == 0 || flag2 == 0) {
                    System.out.println("\nNEM TODOS OS DADOS ESTAO CADASTRADOS");
                }
                else {
                    for(int L = 0; L < 50; L++) {
                        media[L] = (3*nota1[L] + 7*nota2[L])/10;
                    }
                }
            }
            else if(op.equals("5")) {
                if(flag == 0 || flag1 == 0 || flag2 == 0) {
                    System.out.println("\nNEM TODOS OS DADOS ESTAO CADASTRADOS");
                }
                else {
                    System.out.println("\nNOME\t\t\t\tNOTA1\tNOTA2\tMEDIA\n");
                    for(int L = 0; L < 50; L++) {
                        System.out.println(nomes[L] + "\t" + nota1[L] + "\t" + nota2[L] + "\t" + media[L]);
                    }
                }
            }
            else if(op.equals("6")) {
                break;
            }
            else {
                System.out.println("\nOPCAO NAO DISPONIVEL");
            }
        } while(true);
        System.out.println();
    }
}