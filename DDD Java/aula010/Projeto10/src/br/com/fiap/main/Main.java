package br.com.fiap.main;

import br.com.fiap.bean.Geometria;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Geometria geo = new Geometria();
        String auxiliar, escolha = "sim";
        int opcao;
        float lado, altura;
        double raio;

        while (escolha.equals("sim")) {
            try{
                auxiliar = JOptionPane.showInputDialog("Qual área deseja calcular? \n(1) Quadrado \n(2) Retângulo \n(3) Circulo");
                opcao = Integer.parseInt(auxiliar);
                switch (opcao) {
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do lado:");
                        lado = Float.parseFloat(auxiliar);
                        geo.calcularArea(lado);
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do lado:");
                        lado = Float.parseFloat(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do altura:");
                        altura = Float.parseFloat(auxiliar);
                        geo.calcularArea(lado, altura);
                        break;
                    case 3:
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do raio:");
                        raio = Float.parseFloat(auxiliar);
                        geo.calcularArea(raio);
                        break;
                    default:
                        throw new Exception("Escolha invalida");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar o programa?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());   }

        }
        JOptionPane.showMessageDialog(null, "Programa finalizado com sucesso!");
    }
}
