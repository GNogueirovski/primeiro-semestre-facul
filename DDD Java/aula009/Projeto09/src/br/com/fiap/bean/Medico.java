package br.com.fiap.bean;

import java.time.LocalDate;

public class Medico {
    private String nome;
    private String crm;
    private LocalDate dataNascimento;
    private String sexo;
    private String departamento;

    public Medico(){}

    public Medico(String nome, String crm, LocalDate dataNascimento, String sexo, String departamento) {
        this.nome = nome;
        this.crm = crm;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
