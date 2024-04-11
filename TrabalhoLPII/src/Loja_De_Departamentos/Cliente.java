package Loja_De_Departamentos;

public class Cliente extends Pessoa {
    private Integer codCliente;
    private String endereco;
    private String telefone;

    public Cliente(String nome, String cpf, Integer codCliente, String endereco, String telefone) {
        super(nome, cpf);
        this.codCliente = codCliente;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
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
        return "Cliente: " + getNome() + ", CPF: " + getCpf() + ", Código: " + codCliente + ", Endereço: " + endereco + ", Telefone: " + telefone;
    }
}
