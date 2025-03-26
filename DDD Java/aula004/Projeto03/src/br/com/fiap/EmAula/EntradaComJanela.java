package br.com.fiap.EmAula;

import javax.swing.*;
import java.util.Scanner;

public class EntradaComJanela {
    public static void main(String[] args) {
    int num1 = 0, num2 = 0, resultado = 0;
    Scanner scan;
    String auxiliar;
    try{
        scan = new Scanner(System.in);
        auxiliar = JOptionPane.showInputDialog("Digite o primeiro número inteiro");
        num1 = Integer.parseInt(auxiliar);

        auxiliar = JOptionPane.showInputDialog("Digite o segundo número inteiro");
        num2 = Integer.parseInt(auxiliar);

        resultado = num1 + num2;

        JOptionPane.showMessageDialog(null, "Valor 1: " + num1 + "\nValor 2: " + num2 + "\nResultado: " + resultado);
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, "Formato de número incorreto");
    }


    }
}
