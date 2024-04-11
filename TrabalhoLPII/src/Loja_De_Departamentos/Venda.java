package Loja_De_Departamentos;

import java.beans.Transient;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public class Venda {
    private Integer codVenda;
    private Cliente cliente;
    private Funcionario funcionario;
    private double valorVenda;
    private Calendar dataVenda;

    public Venda(Integer codVenda, Cliente cliente, Funcionario funcionario, double valorVenda, Calendar dataVenda) {
        this.codVenda = codVenda;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.valorVenda = valorVenda;
        this.dataVenda = dataVenda;
    }

    public Integer getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(Integer codVenda) {
        this.codVenda = codVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Calendar getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Calendar dataVenda) {
        this.dataVenda = dataVenda;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Venda [codVenda=" + codVenda + ", cliente=" + cliente.getNome() + ", funcionario=" + funcionario.getNome() + ", valorVenda=" + valorVenda + ", dataVenda=" + sdf.format(dataVenda.getTime()) + "]";
    }
}