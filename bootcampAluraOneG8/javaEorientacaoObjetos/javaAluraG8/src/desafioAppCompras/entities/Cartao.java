package desafioAppCompras.entities;

public class Cartao {

    private String descricao;
    private double valorCompra;

    public Cartao(String descricao, double valorCompra) {
        this.descricao = descricao;
        this.valorCompra = valorCompra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    @Override
    public String toString() {
        return "**********************" +
                "COMPRAS REALIZADAS\n" +
                this.getDescricao() + " - " + " R$"+ this.getValorCompra()+
                 "\n*********************";

    }
}
