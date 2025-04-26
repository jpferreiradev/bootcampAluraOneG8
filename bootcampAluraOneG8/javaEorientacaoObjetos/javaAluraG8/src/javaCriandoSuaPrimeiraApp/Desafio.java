package javaCriandoSuaPrimeiraApp;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o seu nome: ");
        String nome = scan.nextLine();
        System.out.print("Informe o tipo de conta (Corrente/Poupança): ");
        String tipoConta = scan.next();
        System.out.print("Informe o seu saldo: ");
        double saldoInicial = scan.nextDouble();

        System.out.println("***********");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.printf("Saldo inicial: R$ " + String.format("%.2f", saldoInicial));
        System.out.println();
        System.out.println("***********");

        System.out.println();

        System.out.println("Operações: ");
        System.out.println("1 - Consultar saldos: ");
        System.out.println("2 - Receber valor: ");
        System.out.println("3 - Transferir valor: ");
        System.out.println("4 - Sair: ");

        int escolha = 0;
        while (escolha != 4) {
            System.out.print("Digite a opção desejada: ");
            escolha = scan.nextInt();

            if (escolha == 1) {
                System.out.println("Seu saldo atual é " + saldoInicial);
            }
            else if (escolha == 2) {
                System.out.print("Quanto você deseja depositar? ");
                double deposito = scan.nextDouble();
                saldoInicial = deposito + saldoInicial;
                System.out.println("Seu saldo atual agora é " + saldoInicial);
            }
            else if (escolha == 3) {
                System.out.print("Quanto você deseja sacar? ");
                double sacar = scan.nextDouble();
                if(sacar > saldoInicial){
                    System.out.println("Saldo insuficiente, repita novamente!");
                } else{
                    saldoInicial = saldoInicial - sacar;
                    System.out.println("Seu saldo atual agora é " + saldoInicial);
                }
            } else if (escolha != 4) {
                System.out.println("Opção inválida, repita novamente!");
            }

        }


    }
}



