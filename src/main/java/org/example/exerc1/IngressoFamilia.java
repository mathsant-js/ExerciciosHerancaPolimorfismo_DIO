package org.example.exerc1;

public final class IngressoFamilia extends Ingresso {
    private final int quantidadePessoas;

    public IngressoFamilia(String nome, float valor, String linguagem, int quantidadePessoas) {
        super(nome, valor, linguagem);
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    protected float calcularIngresso() {
        if (quantidadePessoas > 3) {
            return (valor * quantidadePessoas) * 0.95F;
        } else {
            return (valor * quantidadePessoas);
        }
    }

    @Override
    public void exibirIngresso() {
        System.out.println("====Ingresso Família====");
        System.out.println
                (
                        "Nome do Filme: " + nome + "\n"
                        + "Valor do Ingresso: " + valor + "\n"
                        + "Linguagem: " + linguagem
                );
        System.out.println("Valor Total: " + calcularIngresso());
    }
}
