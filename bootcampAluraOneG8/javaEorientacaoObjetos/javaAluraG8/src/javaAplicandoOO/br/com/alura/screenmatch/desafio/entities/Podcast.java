package javaAplicandoOO.br.com.alura.screenmatch.desafio.entities;

public class Podcast extends Audio {

    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    // aqui temos um exemplo claro de polimorfismo
    @Override
    public int getClassicacao() {
        if(this.getTotalCurtidas() > 500){
            return 10;
        } else{
            return 8;
        }
    }
}
