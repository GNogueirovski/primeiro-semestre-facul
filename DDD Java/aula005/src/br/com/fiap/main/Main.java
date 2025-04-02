package br.com.fiap.main;

import br.com.fiap.bean.ArCondicionado;
import br.com.fiap.bean.Televisor;

public class Main {
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

        ArCondicionado ar = new ArCondicionado();

        ar.temperatura = 33;
        ar.modo = "Resfriar";

        String mensagem = String.format("Bom dia Magnata, seu ar condicionado está em %d graus e no modo %s.",ar.temperatura, ar.modo);

        System.out.println(mensagem);

        ar.trocarModo("Ventilar");
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();

        System.out.println(mensagem);




    }
}
