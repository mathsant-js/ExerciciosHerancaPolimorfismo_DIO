package org.example.exerc2;

public final class Vendedor extends Funcionario {


    public Vendedor(String nome, String email, String senha, boolean isLoged) {
        super(nome, email, senha, isLoged);
    }

    @Override
    public boolean isAdministrator() {
        return false;
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
