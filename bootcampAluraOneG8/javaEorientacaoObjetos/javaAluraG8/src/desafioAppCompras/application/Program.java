package desafioAppCompras.application;

import desafioAppCompras.entities.Cartao;
import desafioAppCompras.entities.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o limite do cartão: ");
        double limite = scan.nextDouble();

        Cartao cartao = new Cartao(limite); // (Referencia)  para um cartao de credito Instanciando o objeto e definindo o limite

        // Criando o menu
        int sair = 1;
        while (sair != 0) {

            System.out.println("Digite a descrição da compra: ");
            String descricao = scan.next();

            System.out.println("Digite o valor da compra: ");
            double valor = scan.nextDouble();

            Compra compra = new Compra(descricao, valor); // Objeto compra
            boolean compraRealizada = cartao.lancaCompra(compra); // Utilizando a variavel boolean com o métod para fazer o calculo das compras

            //
            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = scan.nextInt();
            } else {
                System.out.println("Saldo insuficiente");
                sair = 0;
            }
        }

        System.out.println("********************************");
        System.out.println("COMPRAS REALIZADAS: \n");

        Collections.sort(cartao.getCompras()); // Essa linha é importante

        for (Compra c : cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }
        System.out.println("\n****************************");

        System.out.println("\nSaldo do cartão" + cartao.getSaldo());
    }
}
