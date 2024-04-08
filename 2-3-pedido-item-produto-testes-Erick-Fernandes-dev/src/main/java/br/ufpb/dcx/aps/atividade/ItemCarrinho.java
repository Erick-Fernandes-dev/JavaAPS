package br.ufpb.dcx.aps.atividade;

import java.math.BigDecimal;

public class ItemCarrinho {


    private Produto produto;
    private int quantidade;

    public ItemCarrinho(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ItemCarrinho(Produto produto) {
        this(produto,1);

        if (produto == null) throw new IllegalArgumentException("Produto inválido: null");
        else if (quantidade == 0) throw new IllegalArgumentException("Quantidade inválida: 0");
        else if (quantidade < 0) throw new IllegalArgumentException("Quantidade inválida: -1");


    }

    public boolean isQuantidadeInvalida(int quantidade){
        if (quantidade <= 0) return true;
        return false;
    }

    public Produto getProduto(){
        return this.produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public BigDecimal getTotal(){
        return this.produto.getPreco().multiply(new BigDecimal(this.quantidade));
    }

    public void incrementar(int quantidade) {
        this.quantidade+=quantidade;
    }

    public void setQuantidade(int quant) {
        this.quantidade = quant;
    }
}
