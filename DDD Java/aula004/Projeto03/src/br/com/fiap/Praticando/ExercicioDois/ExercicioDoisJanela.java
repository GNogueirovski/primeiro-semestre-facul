package br.com.fiap.Praticando.ExercicioDois;

import javax.swing.*;
import java.util.Scanner;

public class ExercicioDoisJanela {
    public static void main(String[] args) {
        int anoAtual = 0, anoNascimento = 0 , idade = 0;
        String auxiliar;
        Scanner scan;

        try{
            scan = new Scanner(System.in);
            auxiliar = JOptionPane.showInputDialog("Digite o ano atual: ");
            anoAtual = Integer.parseInt(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite o ano do seu nascimento: ");
            anoNascimento = Integer.parseInt(auxiliar);

            idade = anoAtual - anoNascimento;

            JOptionPane.showMessageDialog(null,"A sua idade é ou será : " + idade + " anos");


        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null,"DEU BIGODE PAI, ACERTA O NÚMERO AI");
        }
    }
}
