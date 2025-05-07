package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

import java.util.Scanner;

public class MainVersao2 {
    public static void main(String[] args) {
        Pessoa p1;
        Scanner scan;

    try{
        scan = new Scanner(System.in);

        System.out.println("Digite seu nome e ano de nascimento: ");
        p1 = new Pessoa(scan.nextLine(), scan.nextInt());

        System.out.printf("Pessoa 1: \nNome: %s\nIdade: %d anos\n", p1.getNome(), p1.calculaIdade(2025));

    } catch (Exception e) {
        System.out.println("Nome e/ou ano de nascimento inválidos!");
    }
    }

}
