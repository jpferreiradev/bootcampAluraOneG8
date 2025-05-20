package javaAplicandoOO.br.com.alura.screenmatch.application;

import javaAplicandoOO.br.com.alura.screenmatch.entities.Filme;
import javaAplicandoOO.br.com.alura.screenmatch.entities.Serie;
import javaAplicandoOO.br.com.alura.screenmatch.entities.Titulo;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

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

        //ArrayList<Titulo> lista = new ArrayList<>(); // Aqui é mostrado o Generics
        //List<Titulo> lista = new ArrayList<>();
        List<Titulo> lista = new LinkedList<>();
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

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: ");
        System.out.println(buscaPorArtista);


        System.out.println("Aqui implementou o Comparable, ele ordena a lista ");
        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados: ");
        System.out.println(lista);

        //System.out.println("Ordenando por ano, USANDO O COMPARATOR: ");

        lista.sort(Comparator.comparing(Titulo::getAnoLancanmento)); // Estude essa linha
        System.out.println("Ordenando por ano, USANDO O COMPARATOR: ");
        System.out.println(lista);







    }
}

//lista.forEach(item -> System.out.printf(" " + lista));
// Exemplo do recurso Method Refenrece
//lista.forEach(System.out::println);

//Filme filmee = (Filme) item; //TypeCast ( conversão de tipos)