// RM: 563925 - Gabriel Nogueira Peixoto ; RM:565834 - Mariana Inoue ; RM: 566154 - Giovanna Neri dos Santos
package br.com.fiap.bean;

public class DespesaFamiliar {
    // declaração de atributos
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;

    // método com retorno para calcular total de despesas
    public double calcularTotalDeDespesas(){
        double totalDespesa;
        double totalAcademia;

        totalAcademia = numeroDeMoradores * valorMensalidadeDaAcademia;
        totalDespesa = gastoComLuz + gastoComAgua + gastoComInternet + totalAcademia;

        return totalDespesa;
    }

    //método com retorno para calcular renda familiar liquida.
    public double calcularRendaFamiliarLiquida(){
        return rendaFamiliar - calcularTotalDeDespesas();
    }

}
