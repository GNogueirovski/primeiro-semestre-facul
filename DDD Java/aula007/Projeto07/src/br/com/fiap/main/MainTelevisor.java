package br.com.fiap.main;

import br.com.fiap.bean.Radio;
import br.com.fiap.bean.Televisor;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainTelevisor {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        Scanner scan;
        int escolha;

        try {
           scan = new Scanner(System.in);
            System.out.println("Escolha um canal e defina o volume: ");
            televisor.setCanal(scan.nextInt());
            televisor.setVolume(scan.nextInt());

            System.out.println("Escolha :\n(1)Definir Canal\n(2)Definir volume\n(3)Aumentar volume\n(4)Diminuir volume");
            escolha = scan.nextInt();

            if (escolha == 1) {
                System.out.println("Escolha um novo canal: ");
                televisor.setCanal(scan.nextInt());
            }
            else if (escolha == 2) {
                System.out.println("Escolha um novo volume: ");
                televisor.setVolume(scan.nextInt());
            }
            else if (escolha == 3) {
                System.out.println("Aumentando volume...");
                televisor.aumentarVolume();
            }
            else{
                System.out.println("Diminuindo volume...");
                televisor.diminuirVolume();
            }

                System.out.printf("Canal atual: %s\nVolume atual: %d ", televisor.getCanal(), televisor.getVolume());




        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
