package br.com.fiap.EmAula;

import java.util.Scanner;

public class EntradaDeDado {
    public static void main(String[] args) {
    int num1 = 0, num2 = 0, resultado = 0;
    Scanner scan;
    try{
        scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro: ");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo numero inteiro: ");
        num2 = scan.nextInt();

        resultado = num1 + num2;

        System.out.println("Valor 1: " + num1 + "\nValor 2: " + num2 + "\nResultado: " + resultado);
    }catch (Exception e){
        System.out.println("Formato de número incorreto");
    }


    }
}
