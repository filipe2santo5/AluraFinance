import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class AluraFinances {

    public static double validValue(){//função que valida os dados inseridos
        Scanner input = new Scanner(System.in); //método para inserção de valores
        double valid;
        try{//tratamento de exceções
            valid =input.nextDouble();
        } catch (InputMismatchException e){
            valid = -1.0;
        }
        return valid;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //método para inserção de valores
        String menu; //menu de opções
        String alert; //menu de opções
        String name; //nome do destinatário
        boolean app = true;
        double value; //valor da ransferencia
        double accountBalance = new Random().nextDouble(1000,10001); //salvo em conta
        int choice; //opção do menu
        int accountNamber = new Random().nextInt(111111111,999999999); //numero da conta
        while (app){//loop infinito app
            menu = """
                    |__________________________________|
                    |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                    |           AluraFinance           |
                    |                                  |
                    | Harris Broken Jr                 |
                    |__________________________________|
                    |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                      Conta corrente R$ %.2f
                    |__________________________________|
                    |[0]|Sair                          |
                    |[1]|Transferir                    |
                    |[2]|Depositar                     |
                    |[3]|Consultar saldo               |
                    |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                    | Digite o valor correspondente    |
                    | a uma das alternativas           |
                    |__________________________________|
                    |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                    """;
            System.out.printf(menu, accountBalance);

            choice = (int) validValue();
            switch (choice) {
                case 0:
                    app = false;
                    break;
                case 1:
                    //perguna o nome do estinatario
                    alert = """
                            |__________________________________|
                            |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                            | Digite o nome do destinatário    |
                            |__________________________________|
                            |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                            """;
                    System.out.println(alert);

                    name = input.nextLine();

                    alert = """
                            |__________________________________|
                            |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                            | Digite o valor a ser transferido |
                            |__________________________________|
                            |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                            """;
                    System.out.println(alert);

                    while (true){
                        value = validValue();
                        if ( value < 0 ){
                            alert = """
                                    |__________________________________|
                                    |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                                    | Valor inválido                   |
                                    |__________________________________|
                                    |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                                    """;
                            System.out.println(alert);
                        } else break;
                    }
                    alert = """
                            |__________________________________|
                            |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                            ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
                              Comprovante de transferência
                              valor: %.2f
                              Tipo da transferência: PIX
                            |__________________________________|
                            |                                  |
                              Destino
                              Nome: %s
                              Instituição: Alura Finance
                              Agência: 430
                              Conta: %d-9
                            |__________________________________|
                            |                                  |
                              Origem
                              Nome: Harris Broken
                              Instituição: Alura Finance
                              Agência: 430
                              Conta: 146055430-3
                            ____________________________________
                            |__________________________________|
                            |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                            """;
                    System.out.printf(alert, value, name, accountNamber);
                    accountBalance -= value;
                    break;
                case 2:
                    alert = """
                            |__________________________________|
                            |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                            | Digite o valor a ser recebido    |
                            |__________________________________|
                            |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                            """;
                    System.out.println(alert);


                    while (true){
                        value = validValue();
                        if ( value < 0 ){
                            alert = """
                                    |__________________________________|
                                    |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                                    | Valor inválido                   |
                                    |__________________________________|
                                    |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                                    """;
                            System.out.println(alert);
                        } else break;
                    }
                    accountBalance += value;

                    alert = """
                            |__________________________________|
                            |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                              saldo atualizado; R$ %.2f
                            |__________________________________|
                            |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                            """;
                    System.out.printf(alert, accountBalance);
                    break;

                case 3:
                    alert = """
                            |__________________________________|
                            |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                              Saldo atual: R$ %.2f
                            |__________________________________|
                            |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                            """;
                    System.out.printf(alert, accountBalance);
                    break;

                default:
                    alert = """
                            |__________________________________|
                            |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                            | Valor inválido                   |
                            |__________________________________|
                            |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                            """;
                    System.out.println(alert);
                    break;
            }



        }
    }
}

