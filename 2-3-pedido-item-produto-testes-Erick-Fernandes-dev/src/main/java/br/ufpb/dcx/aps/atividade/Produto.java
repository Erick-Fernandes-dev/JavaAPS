package br.ufpb.dcx.aps.atividade;

import java.math.BigDecimal;
import java.util.Objects;

public class Produto {

    private String codigo;
    private String nome;
    private BigDecimal preco;


    public Produto(String codigo) {
        this(codigo,"");

        if (codigo == null || codigo == "") throw new IllegalArgumentException("O código do produto não pode ser null");

    }

    public Produto(String codigo, String nome) {
        this(codigo,nome,BigDecimal.valueOf(0.0));
    }

    public Produto(String codigo, String nome, BigDecimal preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if (isStringNull(nome)) throw new IllegalArgumentException("O nome do produto não pode ser null");
        else if (isStringApenasNumeros(nome)) throw new IllegalArgumentException("O nome do produto não pode ser apenas números");
        else if (isStringApenasEspacosVazios(nome)) throw new IllegalArgumentException("O nome do produto não pode ser apenas espaços vazios");

        this.nome = nome;
    }

    public boolean isStringNull(String nome){
        return nome == null;
    }

    public boolean isStringApenasNumeros(String string) {

        try {
            Integer.parseInt(string);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean isStringApenasEspacosVazios(String string) {

        if (string.equals("")) return false;
        string.trim();
        if (string.isBlank()) return true;

        return false;

    }



    public BigDecimal getPreco() {
        System.out.println(preco);
        return preco;
    }


    public void setPreco(String preco){
        this.setPreco(new BigDecimal(preco));
    }

    public void setPreco(BigDecimal preco) {


        if (isNaoPodeSerNegativo(preco)) throw new IllegalArgumentException("O valor do produto não pode ser negativo");
        else if (isNaoPodeSerNull(preco)) throw new IllegalArgumentException("O valor do produto não pode se null");




        this.preco = preco;
    }

    public boolean isNaoPodeSerNegativo(BigDecimal preco) {
        if (preco.compareTo(BigDecimal.ZERO ) < 0)  return true;

        return false;
    }



    public boolean isNaoPodeSerNull(BigDecimal preco) {
        String valorSTR = String.valueOf(preco);

        if ( valorSTR == null) return true;
        else if (preco == null) return true;


        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return Objects.equals(getCodigo(), produto.getCodigo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }
}
