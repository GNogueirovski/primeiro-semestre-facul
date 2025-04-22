package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Jurisclayson", 1977);

        p1.setNome("Astrogildo");
        p1.setAnoNascimento(1987);
        int idadeP1 = p1.calculaIdade(2025);

        System.out.printf("Pessoa 1: \nNome: %s\nIdade: %d anos\nPessoa 2: \nNome: %s\nIdade: %d anos\n", p1.getNome(), idadeP1, p2.getNome(), p2.calculaIdade(2025));

    }
}
