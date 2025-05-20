package desafioAppCompras.application;

import desafioAppCompras.entities.Cartao;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        ArrayList<Cartao> compras = new ArrayList<>();


        System.out.println("Digite 0 para sair ou 1 para continuar:  ");
        int opcao = scan.nextInt();

        do {
            System.out.print("Digite o limite do cartão: ");
            double limite = scan.nextDouble();
            System.out.print("Digite a descrição da compra: ");
            String descricao = scan.nextLine();
            scan.nextLine();
            System.out.print("Digite o valor da compra: ");
            double valor = scan.nextDouble();
            compras.add(new Cartao(descricao, valor));
            opcao = scan.nextInt();
        } while (opcao != 0);

        for (Cartao c : compras) {
            System.out.println(c);
        }


    }
}
