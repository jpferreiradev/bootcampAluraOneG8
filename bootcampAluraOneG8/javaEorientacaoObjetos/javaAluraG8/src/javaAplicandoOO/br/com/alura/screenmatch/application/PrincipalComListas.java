package javaAplicandoOO.br.com.alura.screenmatch.application;

import javaAplicandoOO.br.com.alura.screenmatch.entities.Filme;
import javaAplicandoOO.br.com.alura.screenmatch.entities.Serie;
import javaAplicandoOO.br.com.alura.screenmatch.entities.Titulo;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme filme = new Filme("O poderoso chefão", 1970);
        filme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003); // Exemplo de uma var do tipo Filme
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoPaulo; // Aqui você não está copiando o objeto e sim a referencia do Objeto

        ArrayList<Titulo> lista = new ArrayList<>(); // Aqui é mostrado o Generics
        lista.add(filmeDoPaulo);
        lista.add(filme);
        lista.add(outroFilme);
        lista.add(lost);

        //System.out.println("Tamanho da lista: " + lista.size());


        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filmee && filme.getClassificacao() > 2) { // Verificar se o item é um filme
                System.out.println("Classificação" + filmee.getClassificacao());
            }

        }


    }
}

//lista.forEach(item -> System.out.printf(" " + lista));
// Exemplo do recurso Method Refenrece
//lista.forEach(System.out::println);

//Filme filmee = (Filme) item; //TypeCast ( conversão de tipos)