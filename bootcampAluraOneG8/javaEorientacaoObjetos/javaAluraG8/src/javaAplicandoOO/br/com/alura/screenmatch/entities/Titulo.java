package javaAplicandoOO.br.com.alura.screenmatch.entities;

public class Titulo {

    private String nome;
    private int anoLancanmento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


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
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public double getSomaDasAvaliacoes(){
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

}
