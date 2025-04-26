package javaCriandoSuaPrimeiraApp;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;

        for(int i = 0; i < 3;i++){
            System.out.print("Digite sua avaliação para o filme: ");
            nota = scan.nextDouble();
            //mediaAvaliacao = mediaAvaliacao + nota;
            mediaAvaliacao += nota;
        }

        System.out.println("Média de avaliação: " + mediaAvaliacao /3);


    }
}
