package br.com.fiap.bean;

public class FolhaDePagamento {
    public double salarioBruto;
    public int numeroDeDependentes;
    public double descontoINSS;
    public double valorPlanoDeSaude;


    public double calcularSalarioLiquido() {
        double salarioLiquido;

        valorPlanoDeSaude = valorPlanoDeSaude * (numeroDeDependentes + 1);
        salarioLiquido = salarioBruto - (salarioBruto * descontoINSS/100);
        salarioLiquido = salarioLiquido - valorPlanoDeSaude;

        return salarioLiquido;
    }
}
