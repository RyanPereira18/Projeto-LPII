package Loja_De_Departamentos;

public class Produto {
    private Integer codProduto;
    private String descricao;
    private double precoCusto;
    private double precoVenda;

    public Produto(Integer codProduto, String descricao, double precoCusto, double precoVenda) {
        this.codProduto = codProduto;
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    @Override
    public String toString() {
        return "Produto [codProduto=" + codProduto + ", descricao=" + descricao + ", precoCusto=" + precoCusto + ", precoVenda=" + precoVenda + "]";
    }
}

