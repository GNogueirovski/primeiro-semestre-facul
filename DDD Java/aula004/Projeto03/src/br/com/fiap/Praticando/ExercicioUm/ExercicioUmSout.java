package br.com.fiap.Praticando.ExercicioUm;

import java.util.Scanner;

public class ExercicioUmSout {
    public static void main(String[] args) {
        double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, media = 0;
        Scanner scan;

        try {
            scan = new Scanner(System.in);

            System.out.println("Digite a nota da primeira prova: ");
            nota1 = scan.nextDouble();

            System.out.println("Digite a nota da segunda prova: ");
            nota2 = scan.nextDouble();

            System.out.println("Digite a nota da terceira prova: ");
            nota3 = scan.nextDouble();

            System.out.println("Digite a nota da quarta prova: ");
            nota4 = scan.nextDouble();

            media = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.println("A sua média aritmética é: " + media);
        } catch (Exception e) {
            System.out.println("Formato do número incorreto");
        }

    }
}
