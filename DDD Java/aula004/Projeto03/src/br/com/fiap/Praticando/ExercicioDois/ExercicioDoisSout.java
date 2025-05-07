package br.com.fiap.Praticando.ExercicioDois;

import java.util.Scanner;

public class ExercicioDoisSout {
    public static void main(String[] args) {
       int anoNascimento = 0, anoAtual = 0, idade = 0;
       Scanner scan;

       try {
           scan = new Scanner(System.in);
           System.out.println("Digite o ano atual: ");
           anoAtual = scan.nextInt();

           System.out.println("Digite o ano do seu nascimento: ");
           anoNascimento = scan.nextInt();

           idade = anoAtual - anoNascimento;

           System.out.println("A sua idade é ou será : " + idade + " anos");

       } catch (Exception e) {
           System.out.println("Número no formato incorreto");
         }
       }
    }
