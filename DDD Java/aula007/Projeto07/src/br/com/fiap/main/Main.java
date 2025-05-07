package br.com.fiap.main;

import br.com.fiap.bean.Radio;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.setEstacao(89.1f);
        radio.setVolume(55);
        radio.aumentarVolume();
        radio.aumentarVolume();
        radio.setEstacao(102.3f);


        System.out.printf("Estação: %.1f \nVolume: %d", radio.getEstacao(),radio.getVolume());


    }

}
