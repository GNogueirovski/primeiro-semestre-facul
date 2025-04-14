package br.com.fiap.main;

import br.com.fiap.bean.Radio;
import br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class MainTelevisor {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        Scanner scan;
        int canal, volume;

        try {
           scan = new Scanner(System.in);
            System.out.println("Canais disponíveis: 2, 4, 5, 7, 13? ");
            canal = scan.nextInt();
            televisor.setCanal(canal);

            System.out.println("Volume ");
            volume = scan.nextInt();
            televisor.setVolume(volume);

            System.out.println("Opção aumentar volume");

            televisor.aumentarVolume();

            televisor.diminuirVolume();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
