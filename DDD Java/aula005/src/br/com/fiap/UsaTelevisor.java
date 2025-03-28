package br.com.fiap;

public class UsaTelevisor {
    public static void main(String[] args) {
        Televisor tv = new Televisor();

        tv.canal = 7;
        tv.volume = 10;

        System.out.printf("Estamos no canal %d e o volume está em: %d", tv.canal, tv.volume);
        System.out.println();

        tv.trocarCanal(9);
        tv.aumentarVolume();
        tv.aumentarVolume();

        System.out.printf("Estamos no canal %d e o volume está em: %d", tv.canal, tv.volume);


    }
}
