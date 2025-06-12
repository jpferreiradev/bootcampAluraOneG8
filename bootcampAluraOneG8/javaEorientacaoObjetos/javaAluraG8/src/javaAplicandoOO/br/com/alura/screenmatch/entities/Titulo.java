package javaAplicandoOO.br.com.alura.screenmatch.entities;

import com.google.gson.annotations.SerializedName;
import javaAplicandoOO.br.com.alura.screenmatch.TituloOmdb;
import javaAplicandoOO.br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;

public class Titulo implements Comparable<Titulo> {

    //@SerializedName("Title")// Anotação, aqui é o nome que está vindo nesse json
    private String nome;
    //@SerializedName("Year")
    private int anoLancanmento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoLancanmento) {
        this.nome = nome;
        this.anoLancanmento = anoLancanmento;
    }

    public Titulo(TituloOmdb titulo) {
        this.nome = titulo.title();

        if (titulo.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano, porque tem mais de 4 caracteres."); // Aqui você lançou a sua propria Exception
        }

        this.anoLancanmento = Integer.valueOf(titulo.year());
        this.duracaoEmMinutos = Integer.valueOf(titulo.runtime().substring(0, 2));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancanmento() {
        return anoLancanmento;
    }

    public void setAnoLancanmento(int anoLancanmento) {
        this.anoLancanmento = anoLancanmento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }


    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // Método acessor
    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    // Métodos

    public void exibeFixaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancanmento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++; // incrementação
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }


    // Isso aqui eu não entendi
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", anoLancanmento=" + anoLancanmento + ","
                + "Duração: " + duracaoEmMinutos;
    }
}
