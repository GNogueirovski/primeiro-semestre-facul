package br.com.fiap.bean;

public class Quadrado {
    private float lado;

    // construtores
    public Quadrado() {}
    public Quadrado(float lado) {
        this.lado = lado;
    }
    // get e set
    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
    // metodo
    public float calcularArea() {
        return lado * lado;
    }
}
