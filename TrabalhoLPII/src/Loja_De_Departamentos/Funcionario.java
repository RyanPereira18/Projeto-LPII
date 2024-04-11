package Loja_De_Departamentos;

public class Funcionario extends Pessoa {
    private Integer codFuncionario;
    private String departamento;
    private double salario;

    public Funcionario(String nome, String cpf, Integer codFuncionario, String departamento, double salario) {
        super(nome, cpf);
        this.codFuncionario = codFuncionario;
        this.departamento = departamento;
        this.salario = salario;
    }

    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void bonifica(double aumento) {
        this.salario += aumento;
    }

    @Override
    public String getInfo() {
        return "Funcionário: " + getNome() + ", CPF: " + getCpf() + ", Código: " + codFuncionario + ", Departamento: " + departamento + ", Salário: " + salario;
    }
}
