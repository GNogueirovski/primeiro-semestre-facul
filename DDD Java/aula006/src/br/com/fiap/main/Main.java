package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valorPlanoDeSaude;
        double descontoINSS;
        double salarioBruto;
        int numeroDeDependentes;
        Scanner scan;
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();

        try{
            scan = new Scanner(System.in);
            System.out.println("Digite o seu salário bruto: ");
            salarioBruto = scan.nextDouble();

            System.out.println("Digite a porcentagem de desconto do INSS: ");
            descontoINSS = scan.nextDouble();

            System.out.println("Digite o número de dependentes: ");
            numeroDeDependentes = scan.nextInt();

            System.out.println("Digite o valor do plano de saude(individual): ");
            valorPlanoDeSaude = scan.nextDouble();

            folhaDePagamento.valorPlanoDeSaude = valorPlanoDeSaude;
            folhaDePagamento.descontoINSS = descontoINSS;
            folhaDePagamento.salarioBruto = salarioBruto;
            folhaDePagamento.numeroDeDependentes = numeroDeDependentes;

            System.out.printf("O seu salário liquido com os descontos fica %.3f", folhaDePagamento.calcularSalarioLiquido());

        } catch (Exception e) {
            System.out.println("Insira o formato de número correto");
        }


    }
}
