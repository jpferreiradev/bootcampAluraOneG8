package javaAplicandoOO.br.com.alura.screenmatch.desafio.entities;

public class Audio {

    private String titulo;
    private int totalDeReprodicoes;
    private int totalCurtidas;
    private int classicacao;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReprodicoes() {
        return totalDeReprodicoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassicacao() {
        return classicacao;
    }

    public void curtir(){
        this.totalCurtidas++; // Incrementar, quantas vezes foi curtido e reproduzido;
    }
    public void reproduzir(){
        totalDeReprodicoes++;
    }


    /*
     public Audio() {

    }

    public Audio(String titulo, int totalDeReprodicoes, int totalCurtidas, double classicacao) {
        this.titulo = titulo;
        this.totalDeReprodicoes = totalDeReprodicoes;
        this.totalCurtidas = totalCurtidas;
        this.classicacao = classicacao;
    }
     */

}
