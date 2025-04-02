// RM: 563925 - Gabriel Nogueira Peixoto ; RM:xxxxxx - Mariana Inoue ; RM: xxxxxx - Giovanna Neri dos Santos
package br.com.fiap.bean;

public class DespesaFamiliar {
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;

    public double calcularTotalDeDespesas(){
        double totalDespesa;
        double totalAcademia;

        totalAcademia = numeroDeMoradores * valorMensalidadeDaAcademia;
        totalDespesa = gastoComLuz + gastoComAgua + gastoComInternet + totalAcademia;

        return totalDespesa;
    }

    public double calcularRendaFamiliarLiquida(){
        return rendaFamiliar - calcularTotalDeDespesas();
    }

}
