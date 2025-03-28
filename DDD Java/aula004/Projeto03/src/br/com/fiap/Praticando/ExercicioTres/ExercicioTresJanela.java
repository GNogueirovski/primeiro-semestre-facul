package br.com.fiap.Praticando.ExercicioTres;

import javax.swing.*;
import java.util.Scanner;

public class ExercicioTresJanela {
    public static void main(String[] args) {
        final double PI = 3.1415;
        double raio = 0, area = 0;
        String auxiliar;
        Scanner scan;

        try{
            scan = new Scanner(System.in);
            auxiliar = JOptionPane.showInputDialog("Digite o raio do círculo em centimetros: ");
            raio = Double.parseDouble(auxiliar);

            area = PI * (raio * raio);
            //area = Math.PI * Math.pow(raio,2);

            JOptionPane.showMessageDialog(null,"A área desse círculo é: " + area);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Formato errado de número");
        }
    }
}
