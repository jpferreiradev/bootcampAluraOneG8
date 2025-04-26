package javaCriandoSuaPrimeiraApp;

import java.util.Locale;
import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do filme favorito: ");
        String filme = scan.nextLine();
        System.out.print("Qual ano de lançamento: ");
        int anoDeLancamento = scan.nextInt();
        System.out.print("Diga a sua avaliação para o filme: ");
        double avaliacao = scan.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);


    }

}
