package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import javax.swing.*;

public class MainJOptionPane {
    public static void main(String[] args) {
        // instancia do objeto
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
        // declaracao
        double salarioBruto, descontoINSS, valorPlanoDeSaude;
        int numeroDeDependentes;
        String aux;

        try {
            // inputs
            aux = JOptionPane.showInputDialog("Digite o seu salário bruto: ");
            salarioBruto = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog("Digite a porcentagem de desconto do INSS: ");
            descontoINSS = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog("Digite o número de dependentes: ");
            numeroDeDependentes = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog("Digite o valor do plano de saude(individual): ");
            valorPlanoDeSaude = Double.parseDouble(aux);

            // Atribui o valor das variaveis ao objeto.
            folhaDePagamento.valorPlanoDeSaude = valorPlanoDeSaude;
            folhaDePagamento.descontoINSS = descontoINSS;
            folhaDePagamento.salarioBruto = salarioBruto;
            folhaDePagamento.numeroDeDependentes = numeroDeDependentes;

            // Metodo com retorno de salário liquido já calculado

            String mensagem = String.format("Salário Bruto: R$ %.2f\nDependentes: %d\nINSS: %.1f%% \nPlano de Saúde: R$ %.2f \nSalário Líquido: R$ %.2f ", folhaDePagamento.salarioBruto, folhaDePagamento.numeroDeDependentes
                    , folhaDePagamento.descontoINSS, folhaDePagamento.valorPlanoDeSaude, folhaDePagamento.calcularSalarioLiquido());
            JOptionPane.showMessageDialog(null, mensagem);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valores inseridos incorretamente");
        }


    }
}
