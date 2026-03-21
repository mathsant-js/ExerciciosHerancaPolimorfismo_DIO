package org.example.exerc2;

public sealed abstract class Funcionario permits Gerente, Vendedor, Atendente {
    protected String nome;
    protected String email;
    protected String senha;
    protected boolean isLoged;
    protected static int quantidadeVendas = 0;
    protected static float valorAcumuladoVendas;
    protected static int quantidadeFuncionarios = 0;

    public Funcionario(String nome, String email, String senha, boolean isLoged) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.isLoged = isLoged;
        quantidadeFuncionarios++;
    }

    public abstract boolean isAdministrator();

    public void login() {
        if (!isLoged) {
            System.out.println("Login realizado!");
            isLoged = true;
        } else {
            System.out.println("Funcionário já logado!");
        }
    }

    public void logout() {
        if (isLoged) {
            System.out.println("Logout realizado!");
            isLoged = false;
        } else {
            System.out.println("Funcionário já deslogado!");
        }
    }

    public void alterarDados(String nome) {
        this.nome = nome;
        System.out.println("Dados atualizados!");
        System.out.println("Nome atualizado: " + this.nome);
    }

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

    public void alterarSenha(String senha) {
        this.senha = senha;
        System.out.println("Senha atualizada!");
        System.out.println("Senha nova: " + this.senha);
    }
}
