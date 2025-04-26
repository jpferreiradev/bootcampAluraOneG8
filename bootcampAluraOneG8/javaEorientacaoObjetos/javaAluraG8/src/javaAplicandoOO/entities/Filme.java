package javaAplicandoOO.entities;

public class Filme {

    public String nome;
    public int anoLancanmento;
    public boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    public int duracaoEmMinutos;


    // Método acessor
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public double getSomaDasAvaliacoes(){
        return somaDasAvaliacoes;
    }
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
