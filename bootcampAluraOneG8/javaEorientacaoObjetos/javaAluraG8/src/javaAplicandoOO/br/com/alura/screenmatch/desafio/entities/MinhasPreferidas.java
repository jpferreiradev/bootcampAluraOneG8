package javaAplicandoOO.br.com.alura.screenmatch.desafio.entities;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassicacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo está curtindo");
        }
    }
}
