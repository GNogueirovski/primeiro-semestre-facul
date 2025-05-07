// RM: 563925 - Gabriel Nogueira Peixoto ; RM:565834 - Mariana Inoue ; RM: 566154 - Giovanna Neri dos Santos
package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;

public class Aluno {
    // atributos
    private int registroMatricula;
    private String nomeCompleto;
    private int anoDeNascimento;

    // construtor vazio
    public Aluno() {}

    // construtor com parametros
    public Aluno(int registroMatricula, int anoDeNascimento, String nomeCompleto) {
        setRegistroMatricula(registroMatricula);
        setAnoDeNascimento(anoDeNascimento);
        this.nomeCompleto = nomeCompleto;
    }
    // getters e os setters com regras de negócio (exceto setNomeCompleto)
    public int getRegistroMatricula() {
        return registroMatricula;
    }
    public void setRegistroMatricula(int registroMatricula) {
        try{
            if(registroMatricula >= 80000 && registroMatricula <= 599999) {
                this.registroMatricula = registroMatricula;
            }else{
                throw new Exception("Número de Registro inválido! (min=80000 até max=599999)");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        LocalDate dataAtual = LocalDate.now();
        try{
            if (anoDeNascimento >= 1945 && anoDeNascimento <= dataAtual.getYear()) {
                this.anoDeNascimento = anoDeNascimento;
            }else{
                throw new Exception("Valor inválido! (min=1945 até max=Ano atual)");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    // metodo para calcular a idade
    public int calcularIdade(LocalDate dataAtual) {
       return dataAtual.getYear() - getAnoDeNascimento();
    }
}
