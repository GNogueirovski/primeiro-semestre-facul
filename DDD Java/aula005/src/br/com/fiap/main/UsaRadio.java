package br.com.fiap.main;

import br.com.fiap.bean.Radio;

public class UsaRadio {
    public static void main(String[] args) {
        Radio radio = new Radio();

        radio.estacao = 106.6f;
        radio.volume = 10;

        System.out.printf("A atual estação é %.1f e o volume está em: %d", radio.estacao, radio.volume);
        System.out.println();

        radio.trocarEstacao(89.1f);
        radio.diminuirVolume();
        radio.diminuirVolume();

        System.out.printf("A atual estação é %.1f e o volume está em: %d", radio.estacao, radio.volume);








    }
}
