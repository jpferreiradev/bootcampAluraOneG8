package javaAplicandoOO.br.com.alura.screenmatch.desafio.entities;

public class Audio {

    private String titulo;
    private int duracao;
    private int totalDeReprodicoes;
    private int totalCurtidas;
    private String classicacao;


    public Audio() {

    }
    public Audio(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.duracao = duracao;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReprodicoes() {
        return totalDeReprodicoes;
    }

    public void setTotalDeReprodicoes(int totalDeReprodicoes) {
        this.totalDeReprodicoes = totalDeReprodicoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }

    public String getClassicacao() {
        return classicacao;
    }

    public void setClassicacao(String classicacao) {
        this.classicacao = classicacao;
    }


    public void curtir(){
        this.totalCurtidas++;
    }
    public void reproduzir(){
        totalDeReprodicoes++;
    }


}
