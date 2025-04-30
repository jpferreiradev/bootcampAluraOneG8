package javaAplicandoOO.br.com.alura.screenmatch.calculo;

import javaAplicandoOO.br.com.alura.screenmatch.entities.Filme;

public class calculadoraDeTempo {

    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Filme f){
        this.tempoTotal += f.getDuracaoEmMinutos();
    }
}
