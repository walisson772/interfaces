package exercicio.entities;

import exercicio.service.Pagamento;

public class Produtos implements Pagamento {

    private String nome;
    private Integer quantidade;
    private Double valor;

    public Produtos(){
    }

    public Produtos(String name, Integer quantidade, Double valor){
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public double pagar(){
        return getQuantidade() * getValor();
    }
}
