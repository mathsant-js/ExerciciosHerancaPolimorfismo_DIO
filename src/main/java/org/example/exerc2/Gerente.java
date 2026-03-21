package org.example.exerc2;

public final class Gerente extends Funcionario {
    private static final boolean isAdm = true;
    private boolean isLoged = false;

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    public void login() {
        if (!isLoged) {
            System.out.println("Login realizado!");
            isLoged = true;
        } else {
            System.out.println("Gerente já logado!");
        }
    }

    @Override
    public void logout() {
        if (isLoged) {
            System.out.println("Logout realizado!");
            isLoged = false;
        } else {
            System.out.println("Gerente já deslogado!");
        }
    }

    @Override
    public void alterarDados(String nome) {
        this.nome = nome;
        System.out.println("Dados atualizados!");
        System.out.println("Nome atualizado: " + this.nome);
    }

    @Override
    public void alterarDados(String nome, String email) {
        this.nome = nome;
        this.email = email;
        System.out.println("Dados atualizados!");
        System.out.println
                (
                    "Nome atualizado: " + this.nome + "\n"
                    + "Email atualizado: " + this.email
                );
    }

    @Override
    public void alterarSenha(String senha) {
        this.senha = senha;
        System.out.println("Senha atualizada!");
        System.out.println("Senha nova: " + this.senha);
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
