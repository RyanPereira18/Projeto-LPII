package Loja_De_Departamentos;

import java.util.Calendar;

public class Estoque {
    private Integer codEstoque;
    private Produto produto;
    private double quantidade;
    private Calendar dataValidade;
    private String lote;

    public Estoque(Integer codEstoque, Produto produto, double quantidade, Calendar dataValidade, String lote) {
        this.codEstoque = codEstoque;
        this.produto = produto;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
        this.lote = lote;
    }

    public Integer getCodEstoque() {
        return codEstoque;
    }

    public void setCodEstoque(Integer codEstoque) {
        this.codEstoque = codEstoque;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Calendar getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Calendar dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "Estoque [codEstoque=" + codEstoque + ", produto=" + produto + ", quantidade=" + quantidade + ", dataValidade=" + dataValidade + ", lote=" + lote + "]";
    }
}
