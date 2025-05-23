package br.com.fiap.bean;

public class Retangulo extends Quadrado{
    private float altura;

    public Retangulo() {}

    public Retangulo(float lado, float altura) {
        super(lado);
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {}

    public float calcularArea() {
        return super.getLado() * altura;
    }

}
