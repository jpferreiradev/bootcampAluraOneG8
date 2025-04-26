package javaAplicandoOO.application;

import javaAplicandoOO.entities.Filme;

public class Program {
    public static void main(String[] args) {

        Filme filme = new Filme();
        filme.nome = "O poderoso chefão";
        filme.anoLancanmento = 1970;
        filme.duracaoEmMinutos = 180;


        filme.exibeFixaTecnica();
        filme.avalia(8.0);
        filme.avalia(5.0);
        filme.avalia(10);
        System.out.println("Total de avaliações: " + filme.getTotalDeAvaliacoes());
        System.out.println(filme.pegaMedia());
        //filme.somaDasAvaliacoes = 10;
        //filme.totalDeAvaliacoes = 1;

    }
}
