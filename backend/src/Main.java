import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Scanner leituraDeposito = new Scanner(System.in);

        String nome = "Rayane Silva";
        String tipoConta = "Corrente";
        double saldoBancario = 2500.00;

        int escolhaCliente = 0;
        double valorDeposito = 0;
        double valorTranferencia = 0;


        System.out.printf("""
            ********************************
            
            Dados iniciais do cliente:
            Nome:              %s
            Tipo conta:        %s
            Saldo inicial:     %f
            
            *********************************
        """, nome, tipoConta, saldoBancario);

        exibirMenu();

        while(escolhaCliente != 4) {

            escolhaCliente = leitura.nextInt();

            switch (escolhaCliente) {
                case 1:
                    System.out.printf("\n Seu saldo bancário é: %f", saldoBancario);
                    break;

                case 2:
                    System.out.printf("\n Digite o valor que você deseja depositar: ");
                    valorDeposito = leituraDeposito.nextDouble();
                    saldoBancario += valorDeposito;
                    break;

                case 3:
                    System.out.printf("\n Digite o valor que você deseja transferir da conta: ");
                    valorTranferencia = leituraDeposito.nextDouble();

                    if(valorTranferencia > saldoBancario ) {
                        System.out.printf("\n Valor de transferência maior que o disponível em saldo bancário: " + saldoBancario);
                        break;

                    } else {
                        saldoBancario -= valorTranferencia;
                        System.out.printf("\n Seu saldo bancário é: %f", saldoBancario);

                    }
                    break;

                case 4:
                    System.out.println("\nOperação cancelada.");
                    break;

                default:
                    System.out.println("\n Opção inválida. Por favor, escolha novamente.");
                    break;
            }

            exibirMenu();
        }
    }

    private static void exibirMenu() {

        System.out.println(
                """ 
                      
                \n Operações
                        
                1 - Consultar Saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Cancelar
                                        
                """);
    }
}