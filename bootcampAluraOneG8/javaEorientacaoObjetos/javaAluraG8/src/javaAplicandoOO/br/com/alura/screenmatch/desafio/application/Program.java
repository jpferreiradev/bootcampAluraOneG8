package javaAplicandoOO.br.com.alura.screenmatch.desafio.application;


import javaAplicandoOO.br.com.alura.screenmatch.desafio.entities.MinhasPreferidas;
import javaAplicandoOO.br.com.alura.screenmatch.desafio.entities.Musica;
import javaAplicandoOO.br.com.alura.screenmatch.desafio.entities.Podcast;

public class Program {
    public static void main(String[] args) {


        Musica musica = new Musica();
        musica.setTitulo("Rubão");
        musica.setArtista("Charlie Brown Jr");

        for(int i = 0; i < 1000;i++){
            musica.reproduzir();
        }
        for (int i = 0; i < 50; i++) {
            musica.curtir();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("99vidas");
        podcast.setHost("Bruno Carvalho");

        for(int i =0 ; i < 5000; i++){
            podcast.reproduzir();
        }
        for(int i = 0; i < 1000; i++){
            podcast.curtir();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(musica);
        minhasPreferidas.inclui(podcast);

    }
}



