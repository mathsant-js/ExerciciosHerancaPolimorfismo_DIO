package org.example;

import org.example.exerc1.IngressoFamilia;
import org.example.exerc1.MeiaEntrada;
import org.example.exerc2.Atendente;
import org.example.exerc2.Gerente;
import org.example.exerc2.Vendedor;

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

        // Exercício 2
        Gerente gerente = new Gerente("Matheus", "matheus@email.com", "12345");
        Vendedor vendedor = new Vendedor("Henrique", "henrique@email.com", "1234");
        Atendente atendente = new Atendente("Lucas", "lucas@email.com", "123456");

        // Gerente
        gerente.login();
        gerente.alterarDados("Matheus Jorge");
        gerente.alterarDados("Matheus Jorge", "matheusj@email.com");
        gerente.alterarSenha("12345678");
        gerente.consultarVendas();
        gerente.gerarRelatorioFinanceiro();
        gerente.logout();

        // Vendedor
        vendedor.login();
        vendedor.alterarDados("Henrique");
        vendedor.alterarDados("Henrique Macedo", "henriqueMacedo@email.com");
        vendedor.alterarSenha("12345678");
        vendedor.realizarVenda("Playstation 5", 1, 5000.00F);
        vendedor.realizarVenda("Xbox Series X", 2, 5000.00F);
        vendedor.logout();

        // Atendente
        atendente.login();
        atendente.alterarDados("Lucas Tino");
        atendente.alterarDados("Lucas Tino", "lucastino@email.com");
        atendente.alterarSenha("12345");
        atendente.receberPagamento(10000.00F);
        atendente.logout();
    }
}