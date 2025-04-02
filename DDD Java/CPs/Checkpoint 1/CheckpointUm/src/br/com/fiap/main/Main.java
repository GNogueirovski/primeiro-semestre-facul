// RM: 563925 - Gabriel Nogueira Peixoto ; RM:xxxxxx - Mariana Inoue ; RM: xxxxxx - Giovanna Neri dos Santos
package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DespesaFamiliar despesa = new DespesaFamiliar();
        double gastoComLuz, gastoComAgua, gastoComInternet,valorMensalidadeDaAcademia, rendaFamiliar;
        int numeroDeMoradores;
        Scanner scan;

        try {
            scan = new Scanner(System.in);

            System.out.println("Insira sua renda familiar (em reais): ");
            rendaFamiliar = scan.nextDouble();

            System.out.println("Insira qual o número de moradores da sua casa: ");
            numeroDeMoradores = scan.nextInt();

            System.out.println("Insira o gasto com luz da sua casa: ");
            gastoComLuz = scan.nextDouble();

            System.out.println("Insira o gasto com agua: ");
            gastoComAgua = scan.nextDouble();

            System.out.println("Insira o gasto com internet: ");
            gastoComInternet = scan.nextDouble();

            System.out.println("Insira o valor da mensalidade da academia: ");
            valorMensalidadeDaAcademia = scan.nextDouble();

            despesa.rendaFamiliar = rendaFamiliar;
            despesa.numeroDeMoradores = numeroDeMoradores;
            despesa.gastoComLuz = gastoComLuz;
            despesa.gastoComAgua = gastoComAgua;
            despesa.gastoComInternet = gastoComInternet;
            despesa.valorMensalidadeDaAcademia = valorMensalidadeDaAcademia;

            despesa.calcularTotalDeDespesas();
            despesa.calcularRendaFamiliarLiquida();

            System.out.printf("A renda bruta da sua família é: %.3f\n", despesa.rendaFamiliar);
            System.out.printf("O total das suas despesas é: R$ %.3f\nA sua renda familiar liquida é: R$ %.3f\n", despesa.calcularTotalDeDespesas(), despesa.calcularRendaFamiliarLiquida());

        }
        catch (Exception e) {
            System.out.println("Números preenchidos de maneira incorreta!");
        }
    }
}
