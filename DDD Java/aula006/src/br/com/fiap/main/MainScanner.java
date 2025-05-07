package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        // instancia do objeto
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
        // declaracao
        double salarioBruto, descontoINSS, valorPlanoDeSaude;
        int numeroDeDependentes;
        Scanner scan;

        try {
            // instancia scanner
            scan = new Scanner(System.in);
            // inputs
            System.out.println("Digite o seu salário bruto: ");
            salarioBruto = scan.nextDouble();

            System.out.println("Digite a porcentagem de desconto do INSS: ");
            descontoINSS = scan.nextDouble();

            System.out.println("Digite o número de dependentes: ");
            numeroDeDependentes = scan.nextInt();

            System.out.println("Digite o valor do plano de saude(individual): ");
            valorPlanoDeSaude = scan.nextDouble();

            // Atribui o valor das variaveis ao objeto.
            folhaDePagamento.valorPlanoDeSaude = valorPlanoDeSaude;
            folhaDePagamento.descontoINSS = descontoINSS;
            folhaDePagamento.salarioBruto = salarioBruto;
            folhaDePagamento.numeroDeDependentes = numeroDeDependentes;

            // Metodo com retorno de salário liquido já calculado
            System.out.printf("O seu salário liquido com os descontos fica %.2f", folhaDePagamento.calcularSalarioLiquido());

        } catch (Exception e) {
            System.out.println("Insira o formato de número correto");
        }


    }
}
