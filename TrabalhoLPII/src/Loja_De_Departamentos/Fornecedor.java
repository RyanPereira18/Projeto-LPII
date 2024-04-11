package Loja_De_Departamentos;

import java.util.Objects;

public class Fornecedor extends Pessoa {
    private String cnpj;
    private String endereco;
    private String telefone;

    public Fornecedor(String nome, String cpf, String cnpj, String endereco, String telefone) {
        super(nome, cpf);
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getInfo() {
        return "Fornecedor: " + getNome() + ", CPF: " + getCpf() + ", CNPJ: " + cnpj + ", Endereço: " + endereco + ", Telefone: " + telefone;
    }
}
