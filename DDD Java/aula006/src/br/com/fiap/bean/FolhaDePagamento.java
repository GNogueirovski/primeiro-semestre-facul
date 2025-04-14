package br.com.fiap.bean;

public class FolhaDePagamento {
    public double salarioBruto;
    public int numeroDeDependentes;
    public double descontoINSS;
    public double valorPlanoDeSaude;


    public double calcularSalarioLiquido() {
        double salarioLiquido, desconto1, desconto2;

        desconto1 = salarioBruto * (descontoINSS/100);
        desconto2 = valorPlanoDeSaude * (numeroDeDependentes + 1);
        salarioLiquido = salarioBruto - (desconto1+desconto2);

        return salarioLiquido;
    }
}
