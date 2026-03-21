package org.example.exerc1;

public final class MeiaEntrada extends Ingresso {
    public MeiaEntrada(String nome, float valor, String linguagem) {
        super(nome, valor, linguagem);
    }

    @Override
    protected float calcularIngresso() {
       return valor / 2;
    }

    @Override
    public void exibirIngresso() {
        System.out.println("====Meia Entrada====");
        System.out.println
                (
                    "Nome do Filme: " + nome + "\n"
                    + "Valor do Ingresso: " + valor + "\n"
                    + "Linguagem: " + linguagem
                );
        System.out.println("Valor Total:" + calcularIngresso());
    }
}
