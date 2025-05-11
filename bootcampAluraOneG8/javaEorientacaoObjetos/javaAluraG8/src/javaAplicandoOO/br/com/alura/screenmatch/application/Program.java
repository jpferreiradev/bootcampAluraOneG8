package javaAplicandoOO.br.com.alura.screenmatch.application;

import javaAplicandoOO.br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import javaAplicandoOO.br.com.alura.screenmatch.calculo.calculadoraDeTempo;
import javaAplicandoOO.br.com.alura.screenmatch.entities.Episodio;
import javaAplicandoOO.br.com.alura.screenmatch.entities.Filme;
import javaAplicandoOO.br.com.alura.screenmatch.entities.Serie;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        Filme filme = new Filme("O poderoso chefão", 1970);
        //filme.setNome();
        //filme.setAnoLancanmento(1970);
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

        Serie lost = new Serie("Lost", 2000);
        //lost.setNome("Lost");
        //lost.setAnoLancanmento(2000);
        lost.exibeFixaTecnica();
        lost.setTemporada(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutoPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("Avatar", 2023);
        //outroFilme.setNome();
        //outroFilme.setAnoLancanmento(2023);
        outroFilme.setDuracaoEmMinutos(200);


        calculadoraDeTempo calculadora = new calculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtro(filme);
        filtro.filtro(outroFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(7);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtro(episodio);

        // Variavel referencia esquerda, na direita é criação do objeto;
        // Filme filmeDoPaulo = new Filme(); --> Nova forma aprendida na utilização de variavel
        var filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        //filmeDoPaulo.setNome();
        //filmeDoPaulo.setAnoLancanmento(2003);
        filmeDoPaulo.avalia(10);

        // ---> Arraylist


        // Criação do ArrayList e adicionando os filmes na lista
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(filme);
        listaDeFilmes.add(outroFilme);

        System.out.println();
        System.out.println();
        System.out.println("Tamanho da lista de filmes:" + listaDeFilmes.size()); // Tamanho da lista
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome()); // Primeiro elemento da lista
        System.out.println(listaDeFilmes);
        System.out.println("toString do primeiro filme:" + listaDeFilmes.get(0).toString());


    }
}



