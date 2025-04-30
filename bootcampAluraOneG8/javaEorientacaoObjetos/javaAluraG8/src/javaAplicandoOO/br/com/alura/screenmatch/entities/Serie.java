package javaAplicandoOO.br.com.alura.screenmatch.entities;

public class Serie extends Titulo {

    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativo;
    private int minutoPorEpisodio;


    public int getTemporada() {
        return temporadas;
    }

    public void setTemporada(int temporada) {
        this.temporadas = temporada;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getMinutoPorEpisodio() {
        return minutoPorEpisodio;
    }

    public void setMinutoPorEpisodio(int minutoPorEpisodio) {
        this.minutoPorEpisodio = minutoPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutoPorEpisodio;
    }
}
