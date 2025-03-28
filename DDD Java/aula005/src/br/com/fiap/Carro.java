package br.com.fiap;

public class Carro {
    public String cor;
    public int velocidadeAtual;
    public int stage;
    public int velocidadeMax;

    public void trocarCor(String novaCor){
        cor = novaCor;
    }

    public void acelerar(){
        if (velocidadeAtual < velocidadeMax){
        velocidadeAtual = velocidadeAtual + 30;
        }

    }
    public void frear(){
        velocidadeAtual = velocidadeAtual - 10;
    }

    public void tunarCarro(int novoStage,int novaVelocidadeMaxima){
        stage = novoStage;
        velocidadeMax = novaVelocidadeMaxima;
    }

}
