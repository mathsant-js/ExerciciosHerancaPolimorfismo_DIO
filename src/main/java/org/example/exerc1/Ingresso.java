package org.example.exerc1;

public sealed abstract class Ingresso permits IngressoFamilia, MeiaEntrada {
    protected String nome;
    protected float valor;
    protected String linguagem;

    public Ingresso(String nome, float valor, String linguagem) {
        this.nome = nome;
        this.valor = valor;
        this.linguagem = linguagem;
    }

    protected abstract float calcularIngresso();

    protected abstract void exibirIngresso();
}
