package javaAplicandoOO.br.com.alura.screenmatch.application;

import javaAplicandoOO.br.com.alura.screenmatch.entities.Filme;
import javaAplicandoOO.br.com.alura.screenmatch.entities.Serie;

public class Program {
    public static void main(String[] args) {

        Filme filme = new Filme();
        filme.setNome("O poderoso chefão");
        filme.setAnoLancanmento(1970);
        filme.setDuracaoEmMinutos(180);


        filme.exibeFixaTecnica();
        filme.avalia(8.0);
        filme.avalia(5.0);
        filme.avalia(10);
        System.out.println("Total de avaliações: " + filme.getTotalDeAvaliacoes());
        System.out.println(filme.pegaMedia());
        //filme.somaDasAvaliacoes = 10;
        //filme.totalDeAvaliacoes = 1;

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancanmento(2000);
        lost.exibeFixaTecnica();
        lost.setTemporada(10);
        lost.setEpisodiosPorTemporada(10);




    }
}
