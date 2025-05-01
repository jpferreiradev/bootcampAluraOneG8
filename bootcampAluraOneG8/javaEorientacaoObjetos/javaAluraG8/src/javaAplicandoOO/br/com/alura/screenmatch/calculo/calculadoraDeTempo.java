package javaAplicandoOO.br.com.alura.screenmatch.calculo;

import javaAplicandoOO.br.com.alura.screenmatch.entities.Filme;
import javaAplicandoOO.br.com.alura.screenmatch.entities.Serie;
import javaAplicandoOO.br.com.alura.screenmatch.entities.Titulo;

public class calculadoraDeTempo {

    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    // Polimorfismo
    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

   /*
      public void inclui(Filme f){
        this.tempoTotal += f.getDuracaoEmMinutos();
    }
    public void inclui(Serie s){
        this.tempoTotal += s.getDuracaoEmMinutos();
    }
    */


}
