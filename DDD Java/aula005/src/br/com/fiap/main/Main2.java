package br.com.fiap.main;

import br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        int canal, volume;
        Scanner sc;

        try{
            sc = new Scanner(System.in);
            System.out.print("Escolha um canal: ");
            canal = sc.nextInt();

            System.out.print("Escolha o volume: ");
            volume = sc.nextInt();

            tv.canal = canal;
            tv.volume = volume;

            System.out.printf("Canal escolhido: %d\nVolume escolhido: %d\n", tv.canal, tv.volume);
        } catch (Exception e) {
            System.out.println("Formato incorreto de número");
        }


    }
}
