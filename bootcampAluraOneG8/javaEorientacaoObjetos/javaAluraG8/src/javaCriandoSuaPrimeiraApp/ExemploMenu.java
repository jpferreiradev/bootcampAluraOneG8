package javaCriandoSuaPrimeiraApp;

import java.util.Scanner;

public class ExemploMenu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um valor, ele vai parar somente no número 1:  ");
        int valor = scan.nextInt();

        while(valor != 1){
            System.out.println("Você vai aprender a fazer a porra de uma menu");
            scan.nextLine();
        }
    }
}
