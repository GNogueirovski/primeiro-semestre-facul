package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Gestante {
    private String nome;
    private LocalDate dataDaGestacao;

    public Gestante(){}
    public Gestante(String nome, LocalDate dataDaGestacao) {
        this.nome = nome;
        setDataDaGestacao(dataDaGestacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDaGestacao() {
        return dataDaGestacao;
    }

    public void setDataDaGestacao(LocalDate dataDaGestacao) {
        LocalDate fim = LocalDate.now();
        LocalDate inicio = fim.minusMonths(9).minusDays(1);
        try{
            if(dataDaGestacao.isAfter(inicio) && dataDaGestacao.isBefore(fim)){
                this.dataDaGestacao = dataDaGestacao;
            } else {
                throw new Exception("A data da gestação precisa estar entre hoje e 09 meses atrás");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
    }

    public int tempoDeGestacao() {
        LocalDate dataAtual = LocalDate.now();
        Period gestacao = Period.between(dataDaGestacao, dataAtual);
        return gestacao.getMonths();
    }

}
