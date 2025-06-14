package javaAplicandoOO.br.com.alura.screenmatch.application;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javaAplicandoOO.br.com.alura.screenmatch.TituloOmdb;
import javaAplicandoOO.br.com.alura.screenmatch.entities.Titulo;
import javaAplicandoOO.br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        // Essa classe HttpCliente é abstrata;
        //Aqui é o trecho de código que vai no site e pega o body

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um filme para busca: ");
        var busca = scan.nextLine();

        

        System.out.println(" Link do endereço: " + endereco);

        System.out.println();

        try {


            HttpClient client = HttpClient.newHttpClient(); // Fazer o pedido

            HttpRequest request = HttpRequest.newBuilder() // Para aonde ele vai, fazendo a requisição, ainda precisa da resposta;
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client // Aqui é obtendo uma resposta;
                    .send(request, HttpResponse.BodyHandlers.ofString());
            //System.out.println(response.body());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

            TituloOmdb titulo = gson.fromJson(json, TituloOmdb.class);
            System.out.println(titulo);
            // try {
            Titulo meuTitulo = new Titulo(titulo); // Erro foi aqui
            System.out.println("Título já convertido: ");
            System.out.println(meuTitulo);

            FileWriter escrita = new FileWriter("filmes.txt");// Escrever o arquivo
            escrita.write(meuTitulo.toString()); // escreva no titulo
            escrita.close(); // finalizou a escrita do arquivo;


        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro:");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento na busca, verifique o endereço...");
        } catch (ErroDeConversaoDeAnoException e) { // Exception personalizada;
            System.out.println(e.getMessage());
        }


        System.out.println("O programa finalizou corretamente");

    }
}

//System.out.println("Título: " + titulo.getNome());
//System.out.println("Ano: " + titulo.getAnoLancanmento());
//System.out.println(meuTitulo.getDuracaoEmMinutos());