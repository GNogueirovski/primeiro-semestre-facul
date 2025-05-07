package br.com.fiap.main;

import br.com.fiap.bean.Adicao;

import javax.swing.*;

public class MainAdicao {
    public static void main(String[] args) {
        Adicao adicao = new Adicao();
        String auxiliar, escolha = "sim";
        int opcao, numInteiro1, numInteiro2;
        double numReal1, numReal2;

        while(escolha.equals("sim")) {
            try{
                auxiliar = JOptionPane.showInputDialog("Você deseja somar um número:\n(1) Inteiro \n(2) Real");
                opcao = Integer.parseInt(auxiliar);
                switch (opcao) {
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite o primeiro número inteiro:");
                        numInteiro1 = Integer.parseInt(auxiliar);

                        auxiliar = JOptionPane.showInputDialog("Digite o segundo número inteiro:");
                        numInteiro2 = Integer.parseInt(auxiliar);

                        JOptionPane.showMessageDialog(null, String.format("A soma dos dois números inteiros é: %d", adicao.somar(numInteiro1, numInteiro2)));
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite o primeiro número real:");
                        numReal1 = Double.parseDouble(auxiliar);

                        auxiliar = JOptionPane.showInputDialog("Digite o segundo número real:");
                        numReal2 = Double.parseDouble(auxiliar);

                        JOptionPane.showMessageDialog(null, String.format("A soma dos dois números reais é: %.2f", adicao.somar(numReal1, numReal2)));

                        break;
                    default:
                        throw new Exception("Escolha invalida");

                }
                escolha = JOptionPane.showInputDialog("Deseja continuar o programa?");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null,"Programa finalizado com sucesso");
    }
}
