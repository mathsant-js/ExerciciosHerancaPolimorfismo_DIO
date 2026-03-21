package org.example.exerc2;

public final class Atendente extends Funcionario {
    private float valorCaixa;
    private boolean isCaixaFechado;

    public Atendente(String nome, String email, String senha, boolean isLoged) {
        super(nome, email, senha, isLoged);
    }

    @Override
    public boolean isAdministrator() {
        return false;
    }

    public void fecharCaixa() {
        if (!caixaFechado()) {
            System.out.println("Caixa fechado!");
            isCaixaFechado = true;
        } else {
            System.out.println("Caixa já está fechado");
        }
    }

    public boolean caixaFechado() {
        return isCaixaFechado;
    }

    public void receberPagamento(float valor) {
        if (caixaFechado()) {
            System.out.println("O caixa deve estar aberto para receber dinheiro!");
        } else {
            valorCaixa += valor;
            System.out.println("Pagamento recebido!");
            System.out.println("Valor recebido: R$" + valor);
            System.out.println("Valor em caixa: R$" + valorCaixa);
        }
    }

}
