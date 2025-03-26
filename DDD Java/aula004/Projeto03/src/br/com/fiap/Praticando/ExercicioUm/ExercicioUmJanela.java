package br.com.fiap.Praticando.ExercicioUm;

import javax.swing.*;
import java.util.Scanner;

public class ExercicioUmJanela {
    public static void main(String[] args) {
        double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, media = 0;
        String auxiliar;
        Scanner scan;

        try {
            scan = new Scanner(System.in);

            auxiliar = JOptionPane.showInputDialog("Digite a nota da primeira prova: ");
            nota1 = Double.parseDouble(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite a nota da segunda prova: ");
            nota2 = Double.parseDouble(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite a nota da terceira prova: ");
            nota3 = Double.parseDouble(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite a nota da quarta prova: ");
            nota4 = Double.parseDouble(auxiliar);


            media = (nota1 + nota2 + nota3 + nota4) / 4;

            JOptionPane.showMessageDialog(null,"A sua média aritmética é: " + media);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Formato do número incorreto");
        }

    }
}
