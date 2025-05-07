package br.com.fiap.main;

import br.com.fiap.bean.Carro;

public class usaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.cor = "Vermelho";
        carro.stage = 1;
        carro.velocidadeMax = 200;
        carro.velocidadeAtual = 100;

        System.out.printf("Seu carro é %s, está no stage %d e tem velocidade máxima de %d KM/h.\n", carro.cor, carro.stage, carro.velocidadeMax);
        System.out.printf("A velocidade atual é %d KM/h. ", carro.velocidadeAtual);
        System.out.println();

        carro.tunarCarro(2,300);
        carro.trocarCor("Prata");
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();

        System.out.println();
        System.out.printf("Seu carro é %s, está no stage %d e tem velocidade máxima de %d KM/h.\n", carro.cor, carro.stage, carro.velocidadeMax);
        System.out.printf("A velocidade atual é %d KM/h. ", carro.velocidadeAtual);

    }
}
