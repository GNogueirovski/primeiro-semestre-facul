package br.com.fiap.bean;

/**
 * Classe para criar objetos de conta bancária
 * @author Gabriel Nogueira
 * @version 1.0
 */
public class ContaPoupanca implements ContaBancaria {
    private int numConta;
    private float saldo;


    public ContaPoupanca() {
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * Metodo sacar que permite sacar um valor informado.
     * Valor informado deve ser inferior ou igual ao saldo.
     * @author Gabriel Nogueira
     * @param valor - indica o valor a ser sacado
     * @return float - valor do saldo atualizado
     */
    public float sacar(float valor) {
        try{
            if (valor<= saldo){
                saldo-=valor;
            } else{
                throw new Exception("Saldo insuficiente");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return saldo;
    }

    /**
     * Método depositar, que permite adicionar um valor informado ao saldo atual
     * @author Gabriel Nogueira
     * @param valor - valor a ser depositado
     * @return float - novo saldo após depósito
     */
    public float depositar(float valor) {
        saldo += valor;
        return saldo;
    }

}
