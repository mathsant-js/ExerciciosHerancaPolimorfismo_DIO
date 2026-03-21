package org.example.exerc2;

public sealed abstract class Funcionario permits Gerente, Vendedor, Atendente {
    protected String nome;
    protected String email;
    protected String senha;
    protected static int quantidadeVendas = 0;
    protected static float valorAcumuladoVendas;
    protected static int quantidadeFuncionarios = 0;

    public Funcionario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        quantidadeFuncionarios++;
    }

    protected abstract void login();

    protected abstract void logout();

    protected abstract void alterarDados(String nome);

    protected abstract void alterarDados(String nome, String email);

    protected abstract void alterarSenha(String senha);
}
