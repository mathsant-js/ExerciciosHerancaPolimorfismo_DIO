package org.example.exerc2;

public final class Vendedor extends Funcionario {
    private boolean isLoged = false;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    public void login() {
        if (!isLoged) {
            System.out.println("Login realizado!");
            isLoged = true;
        } else {
            System.out.println("Vendedor já logado!");
        }
    }

    @Override
    public void logout() {
        if (isLoged) {
            System.out.println("Logout realizado!");
            isLoged = false;
        } else {
            System.out.println("Vendedor já deslogado!");
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

    public void realizarVenda(String nomeItem, int quantidade, float valor) {
        float valorTotal = valor * quantidade;
        valorAcumuladoVendas += valorTotal;
        quantidadeVendas++;
        System.out.println("Venda realizada!");
        System.out.println("====Detalhe da Venda====");
        System.out.println
                (
                    "Item: " + nomeItem + "\n"
                    + "Quantidade: " + quantidade + "\n"
                    + "Valor unitário" + valor + "\n"
                    + "Valor da venda: R$" + (valorTotal)
                );
    }
}
