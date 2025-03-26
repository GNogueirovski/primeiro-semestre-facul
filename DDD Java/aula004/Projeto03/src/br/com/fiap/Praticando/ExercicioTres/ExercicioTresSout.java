package br.com.fiap.Praticando.ExercicioTres;

import java.util.Scanner;

public class ExercicioTresSout {
    public static void main(String[] args) {
        final double PI = 3.1415;
        double raio = 0, area = 0;
        Scanner scan;

        try{
            scan = new Scanner(System.in);
            System.out.println("Digite o raio do círculo em centimetros: ");
            raio = scan.nextDouble();

            area = PI * (raio * raio);

            System.out.println("A área desse círculo é: " + area);
        }
        catch(Exception e){
            System.out.println("Formato do número errado!");
        }
    }
}
