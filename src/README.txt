TODOS OS TAMPLATES PARA CRIAÇÃO DO
ASCCI UI DO ALURAFINACE
|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
|——————————————————————————————————|
|__________________________________|

‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
————————————————————————————————————
____________________________________


 MENU DE TELA INICIAL
|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
|           AluraFinance           |
|                                  |
| Harris Broken Jr                 |
|__________________________________|
|                                  |
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

 ALERTA DE VALOR INVÁLIDO
|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
| Valor inválido                   |
|__________________________________|

 ALERTA DE VALOR INDISPONIVEL
|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
| Saldo indisponível               |
  saldo atual/; R$ %.2f
|__________________________________|

 ALERTA PARA INFORMAR ONME DO
 DESTINATARIO
|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
| Digite o nome do destinatário    |
|__________________________________|

 ALERTA PARA INFORMAR VALOR A SER
 TRANSFERIDO
|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
| Digite o valor a ser transferido |
|__________________________________|

 ALERTA PARA INFORMAR VALOR A SER
 TRANSFERIDO
|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
| Digite o valor a ser recebido    |
|__________________________________|

 ALERTA DE ATUALIZAÇÃO DE SALDO
|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
 Saldo atualizado: R$ %.2f
|__________________________________|

 COMPROVANTE DE RECEBIMENTO
|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
  Comprovante de transferência
  valor: %d
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
  Conta: %d-9
____________________________________
|__________________________________|


TEMPORÀRIO
}
            if (validValue) { //condicional relacionada a validação dos valores inseridos pelo usuário
                switch (choice){ //menu
                    case 0: //opção de saida do app
                        app = false;
                        break;
                    case 1: //opção de transferencia

                            try { //validação dos valores inseridos pelo usuário

                            } catch (InputMismatchException e) { //tratamneto de exeções
                                input.next();
                                validValue = false;
                                alert = """
                                        |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                                        | Valor inválido                   |
                                        |__________________________________|
                                        """;
                                System.out.println(alert);
                            }

                            if (validValue){
                                if (accountBalance - value >= 0){ //validação de saldo disponivel

                                    alert = """
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
                                        """;
                                    System.out.printf(alert, value, name, accountNamber);
                                    accountBalance -= value;
                                    break;
                                } else {
                                    alert = """
                                            |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                                            | Saldo indisponível               |
                                              saldo atual: R$ %.2f
                                            |__________________________________|
                                            """;
                                    System.out.printf(alert, accountBalance);
                                }
                            }


                        }

                        break;
                    case 2: //opção recebimento
                        while (true){
                            try {
                                value = input.nextDouble();
                                alert = """
                                |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                                | Digite o valor a ser recebido    |
                                |__________________________________|
                                """;
                                System.out.println(alert);
                                validValue = true;
                            } catch (InputMismatchException e){
                                validValue = false;
                                alert = """
                                    |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                                    | Valor inválido                   |
                                    |__________________________________|
                                    """;
                                System.out.println(alert);
                            }

                            if (validValue){
                                accountBalance += value;

                                alert = """
                                |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                                  saldo atualizado: R$ %.2f
                                |__________________________________|
                                """;
                                System.out.printf(alert, accountBalance);
                                break;
                            }
                        }
                        break;

                    case 3: //opção consulta de saldo
                        alert = """
                        |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                          Saldo atual: R$ %.2f
                        |__________________________________|
                        """;
                        System.out.printf(alert, accountBalance);
                        break;
                    default:
                        alert = """
                        |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                        | Valor inválido                   |
                        |__________________________________|
                        """;
                        System.out.println(alert);
                        break;
                }
            }
        }