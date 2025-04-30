package javaAplicandoOO.br.com.alura.screenmatch.application;

import javaAplicandoOO.br.com.alura.screenmatch.calculo.calculadoraDeTempo;
import javaAplicandoOO.br.com.alura.screenmatch.entities.Filme;
import javaAplicandoOO.br.com.alura.screenmatch.entities.Serie;

public class Program {
    public static void main(String[] args) {

        Filme filme = new Filme();
        filme.setNome("O poderoso chefão");
        filme.setAnoLancanmento(1970);
        filme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + filme.getDuracaoEmMinutos());


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
        lost.setMinutoPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoLancanmento(2023);
        outroFilme.setDuracaoEmMinutos(200);



        calculadoraDeTempo calculadora = new calculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(outroFilme);
        //calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());


    }
}



