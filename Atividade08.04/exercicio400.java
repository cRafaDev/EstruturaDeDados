import java.util.Scanner;

public class exercicio400 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] leitos = new int[50];
        int[] nd = new int[50];
        String[] sit = new String[50];
        String[] din = new String[50];
        String[] dout = new String[50];
        String[] nome = new String[50];
        String[] tel = new String[50];
        double[] precos = new double[50];
        double[] despesas = new double[50];
        int chave = 0;
        int op;

        do {
            System.out.println("\n\n\nHotel Fazenda Sucesso \n");
            System.out.println("1. Cadastra quartos");
            System.out.println("2. Lista todos os quartos");
            System.out.println("3. Lista quartos ocupados");
            System.out.println("4. Aluguel/reserva quarto");
            System.out.println("5. Entra despesas extras");
            System.out.println("6. Calcula despesa do quarto");
            System.out.println("7. Sai");
            System.out.print("opcao: ");
            op = input.nextInt();
            input.nextLine();

            switch(op) {
                case 1:
                    if(chave == 1) {
                        System.out.println("\nAtencao. Dados ja cadastrados");
                    } else {
                        for(int i = 0; i < 50; i++) {
                            System.out.print("\nquantidade de leitos para o quarto " + (i + 1) + ": ");
                            leitos[i] = input.nextInt();
                            System.out.print("\npreco do quarto: ");
                            precos[i] = input.nextDouble();
                            input.nextLine();
                            sit[i] = "L";
                            nd[i] = 0;
                            despesas[i] = 0.0;
                            din[i] = "XXXX";
                            dout[i] = "XXXX";
                            nome[i] = "";
                            tel[i] = "";
                        }
                        chave = 1;
                    }
                    break;

                case 2:
                    if(chave == 0) {
                        System.out.println("\nEscolha a opcao 1");
                    } else {
                        for(int i = 0; i < 50; i++) {
                            System.out.println("\nnumero do quarto: " + (i + 1));
                            System.out.println("situacao quarto: " + sit[i]);
                            if(sit[i].equals("A") || sit[i].equals("R")) {
                                System.out.println("nome: " + nome[i]);
                                System.out.println("telefone: " + tel[i]);
                            }
                            System.out.println("quantidade de leitos: " + leitos[i]);
                            System.out.println("preco do quarto: " + precos[i]);
                            System.out.println("despesas: " + despesas[i]);
                            System.out.println("data de entrada: " + din[i]);
                            System.out.println("data de saida: " + dout[i]);
                            System.out.println("numero de dias: " + nd[i]);
                            System.out.print("pressione enter para continuar: ");
                            input.nextLine();
                        }
                    }
                    break;

                case 3:
                    if(chave == 0) {
                        System.out.println("\nEscolha a opcao 1");
                    } else {
                        for(int i = 0; i < 50; i++) {
                            if(sit[i].equals("A")) {
                                System.out.println("\nnumero do quarto: " + (i + 1));
                                System.out.println("despesas: " + despesas[i]);
                                System.out.println("data de entrada: " + din[i]);
                                System.out.println("data de saida: " + dout[i]);
                                System.out.println("numero de dias: " + nd[i]);
                                System.out.print("pressione enter para continuar: ");
                                input.nextLine();
                            }
                        }
                    }
                    break;

                case 4:
                    if(chave == 0) {
                        System.out.println("\nEscolha a opcao 1");
                    } else {
                        System.out.print("\nDigite A(aluguel) R(reserva): ");
                        String resp = input.nextLine();
                        while(!resp.equalsIgnoreCase("A") && !resp.equalsIgnoreCase("R")) {
                            System.out.print("\nResposta invalida. Digite A(aluguel) R(reserva): ");
                            resp = input.nextLine();
                        }

                        if(resp.equalsIgnoreCase("A")) {
                            System.out.print("\nTinha reserva (s/n)? ");
                            String resp1 = input.nextLine();
                            if(resp1.equalsIgnoreCase("S")) {
                                System.out.print("\nEntre com nome: ");
                                String nomep = input.nextLine();
                                int i = 0;
                                while(i < 49 && !nomep.equals(nome[i])) {
                                    i++;
                                }
                                if(nomep.equals(nome[i])) {
                                    int quarto = i;
                                    sit[i] = "A";
                                    despesas[i] = 0.0;
                                    System.out.print("\ndata de entrada: ");
                                    din[quarto] = input.nextLine();
                                    System.out.print("\ndata de saida: ");
                                    dout[quarto] = input.nextLine();
                                    System.out.print("\nnumero de dias: ");
                                    nd[quarto] = input.nextInt();
                                    input.nextLine();
                                } else {
                                    System.out.println("\nReserva nao encontrada");
                                }
                            }
                        }

                        if(resp.equalsIgnoreCase("R") || (resp.equalsIgnoreCase("A") && !resp1.equalsIgnoreCase("S"))) {
                            for(int i = 0; i < 50; i++) {
                                if(sit[i].equals("L")) {
                                    System.out.println("\nnumero do quarto: " + (i + 1));
                                    System.out.println("quantidade de leitos: " + leitos[i]);
                                    System.out.println("preco do quarto: " + precos[i]);
                                    System.out.print("pressione enter para continuar: ");
                                    input.nextLine();
                                }
                            }
                            System.out.print("\nDigite o numero do quarto para aluguel ou reserva: ");
                            int quarto = input.nextInt();
                            input.nextLine();
                            while(quarto < 1 || quarto > 50) {
                                System.out.print("\nQuarto Invalido. Entre novamente: ");
                                quarto = input.nextInt();
                                input.nextLine();
                            }
                            while(sit[quarto-1].equals("A")) {
                                System.out.print("\nQuarto ocupado. Digite novamente: ");
                                quarto = input.nextInt();
                                input.nextLine();
                            }
                            if(resp.equalsIgnoreCase("A")) {
                                sit[quarto-1] = "A";
                                despesas[quarto-1] = 0.0;
                            } else {
                                sit[quarto-1] = "R";
                            }
                            System.out.print("\nDigite nome: ");
                            nome[quarto-1] = input.nextLine();
                            System.out.print("\nDigite telefone para contato: ");
                            tel[quarto-1] = input.nextLine();
                            System.out.print("\ndata de entrada: ");
                            din[quarto-1] = input.nextLine();
                            System.out.print("\ndata de saida: ");
                            dout[quarto-1] = input.nextLine();
                            System.out.print("\nnumero de dias: ");
                            nd[quarto-1] = input.nextInt();
                            input.nextLine();
                        }
                    }
                    break;

                case 5:
                    if(chave == 0) {
                        System.out.println("\nEscolha a opcao 1");
                    } else {
                        System.out.print("\nentre com numero do quarto: ");
                        int quarto = input.nextInt();
                        input.nextLine();
                        while(quarto < 1 || quarto > 50) {
                            System.out.print("\nentre com numero do quarto: ");
                            quarto = input.nextInt();
                            input.nextLine();
                        }
                        System.out.print("\ndespesas: ");
                        double valor = input.nextDouble();
                        input.nextLine();
                        despesas[quarto-1] += valor;
                    }
                    break;

                case 6:
                    if(chave == 0) {
                        System.out.println("\nEscolha a opcao 1");
                    } else {
                        System.out.print("\nentre com numero do quarto: ");
                        int quarto = input.nextInt();
                        input.nextLine();
                        while(quarto < 1 || quarto > 50) {
                            System.out.print("\nentre com numero do quarto: ");
                            quarto = input.nextInt();
                            input.nextLine();
                        }
                        double total = despesas[quarto-1] + (precos[quarto-1] * nd[quarto-1]);
                        System.out.println("\ndespesas: R$ " + total);
                        sit[quarto-1] = "L";
                        despesas[quarto-1] = 0.0;
                        din[quarto-1] = "XXXX";
                        dout[quarto-1] = "XXXX";
                        nd[quarto-1] = 0;
                        nome[quarto-1] = "";
                        tel[quarto-1] = "";
                    }
                    break;

                case 7:
                    System.out.println("\nSaindo");
                    break;

                default:
                    System.out.println("\nOpcao nao disponivel");
            }
        } while(op != 7);
    }
}