package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FolhaDePagamento folha = new FolhaDePagamento();

        folha.salarioBruto = 10000;
        folha.valorPlanoDeSaude = 150;
        folha.numeroDeDependentes = 4;
        folha.descontoINSS = 15;

        System.out.printf("Salário Bruto: R$ %.2f\nDependentes: %d\nINSS: %.1f%% \nPlano de Saúde: R$ %.2f \nSalário Líquido: R$ %.2f ", folha.salarioBruto, folha.numeroDeDependentes
                , folha.descontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());


    }
}
