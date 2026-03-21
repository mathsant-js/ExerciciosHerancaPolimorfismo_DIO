package org.example.exerc2;

public final class Gerente extends Funcionario {

    public Gerente(String nome, String email, String senha, boolean isLoged) {
        super(nome, email, senha, isLoged);
    }

    @Override
    public boolean isAdministrator() {
        return true;
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("====Relatório Financeiro====");
        consultarVendas();
        System.out.println("Quantidade de Funcionários: " + quantidadeFuncionarios);
    }

    public void consultarVendas() {
        System.out.println("====Vendas Totais====");
        System.out.println
                (
                    "Valor acumulado de vendas: R$" + valorAcumuladoVendas + "\n"
                    + "Quantidade de vendas: " + quantidadeVendas
                );
    }
}
