package javaCriandoSuaPrimeiraApp;

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        while(nota != -1){
            System.out.println("Digite sua avaliação para o filme ou -1 para encerrar");
            nota = scan.nextDouble();

            if(nota != -1){
                mediaAvaliacao += nota;
                totalNotas++;
            }


        }

        System.out.println("Média de avaliaçãoes: " + mediaAvaliacao /totalNotas);
    }
}
