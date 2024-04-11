package Loja_De_Departamentos;

import java.util.Calendar;

public class Projeto_Teste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "123.456.789-00", 1, "Rua A", "123456789");
        Funcionario funcionario = new Funcionario("Maria", "987.654.321-00", 1, "Vendas", 2500.0);
        Produto produto = new Produto(1, "Camisa", 30.0, 50.0);
        Estoque estoque = new Estoque(1, produto, 100, Calendar.getInstance(), "A123");
        Fornecedor fornecedor = new Fornecedor("Fornecedor X", "123.456.789-00", "12345678901234", "Rua B", "987654321");

        System.out.println("Informações do Cliente:");
        System.out.println(cliente.getInfo());

        System.out.println("\nInformações do Funcionário:");
        System.out.println(funcionario.getInfo());

        System.out.println("\nInformações do Produto:");
        System.out.println(produto);

        System.out.println("\nInformações do Estoque:");
        System.out.println(estoque);

        System.out.println("\nInformações do Fornecedor:");
        System.out.println(fornecedor.getInfo());

        // Teste de venda
        Calendar dataVenda = Calendar.getInstance();
        Venda venda = new Venda(1, cliente, funcionario, 150.0, dataVenda);
        System.out.println("\nInformações da Venda:");
        System.out.println(venda);
    }
}
