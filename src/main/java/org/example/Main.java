package org.example;

import org.example.exerc1.IngressoFamilia;
import org.example.exerc1.MeiaEntrada;

public class Main {
    public static void main(String[] args) {
        // Exercício 1
        MeiaEntrada meiaEntrada = new MeiaEntrada("Vingadores", 80, "Dublado");
        IngressoFamilia ingressoFamilia = new IngressoFamilia("Vingadores", 80, "Dublado", 2);
        IngressoFamilia ingressoFamilia1 = new IngressoFamilia("Vingadores", 80, "Dublado", 5);

        meiaEntrada.exibirIngresso();
        System.out.println();
        ingressoFamilia.exibirIngresso();
        System.out.println();
        ingressoFamilia1.exibirIngresso();
    }
}