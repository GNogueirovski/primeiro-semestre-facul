package br.com.fiap;

public class UsaArCondicionado {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();

        ar.temperatura = 33;
        ar.modo = "Resfriar";

        System.out.printf("Bom dia Magnata, seu ar condicionado está em %d graus e no modo %s.",ar.temperatura, ar.modo);

        ar.trocarModo("Ventilar");
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();

        System.out.printf("Bom dia Magnata, seu ar condicionado está em %d graus e no modo %s.",ar.temperatura, ar.modo);


    }
}
