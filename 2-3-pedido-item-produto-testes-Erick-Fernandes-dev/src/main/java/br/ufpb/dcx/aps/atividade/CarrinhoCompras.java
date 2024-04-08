package br.ufpb.dcx.aps.atividade;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class CarrinhoCompras {

    private Map<String,ItemCarrinho> itens = new LinkedHashMap<>();
    private int count = 1;


    public void addProduto(Produto produto, int quantidade){
        this.itens.put(produto.getCodigo(), new ItemCarrinho(produto, quantidade));
    }

    public void addProduto(Produto produto){
        this.addProduto(produto, count++);
    }

    public void setQuantidade(String codProduto, int quant){
            this.itens.get(codProduto).setQuantidade(quant);
    }

    public Produto removerProduto(String codProduto){
        Produto produto = new Produto("123");
        this.itens.remove(produto.getCodigo());
        return produto;
    }

    public int getQuantidadeItens(){
        return this.itens.size();
    }

    public BigDecimal getTotal(){
        BigDecimal total = BigDecimal.valueOf(0.0);
        for(ItemCarrinho item: itens.values()){
            total.add(item.getTotal());
        }
        return total;
    }


    public ItemCarrinho getItem(String codProduto) {
        int i = itens.get(codProduto).getQuantidade() ;
        return itens.get(codProduto);
    }

    public boolean existe(String codProduto) {
        return this.itens.containsKey(codProduto);
    }
}
