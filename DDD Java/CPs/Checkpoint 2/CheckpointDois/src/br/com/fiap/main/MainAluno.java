// RM: 563925 - Gabriel Nogueira Peixoto ; RM:565834 - Mariana Inoue ; RM: 566154 - Giovanna Neri dos Santos
package br.com.fiap.main;

import br.com.fiap.bean.Aluno;
import javax.swing.*;
import java.time.LocalDate;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno1, aluno2, aluno3, aluno4;
        LocalDate dataAtual = LocalDate.now();

        try{
            // Instanciando construtor vazio e passando valores para o aluno1(objeto) através do setter
            aluno1 = new Aluno();
            aluno1.setRegistroMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do Aluno 1: ")));
            aluno1.setAnoDeNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do Aluno 1: ")));
            aluno1.setNomeCompleto(JOptionPane.showInputDialog("Digite o nome completo do Aluno 1: "));

            // Instanciando construtor vazio e passando valores para o aluno2(objeto) através do setter
            aluno2 = new Aluno();
            aluno2.setRegistroMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do Aluno 2: ")));
            aluno2.setAnoDeNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do Aluno 2: ")));
            aluno2.setNomeCompleto(JOptionPane.showInputDialog("Digite o nome completo do Aluno 2: "));

            // Utilizando construtor com parâmetros para criação dos dois últimos alunos com seus devidos valores
            aluno3 = new Aluno(566154, 2006,"Giovanna Neri dos Santos");
            aluno4 = new Aluno(563925, 2002,"Gabriel Nogueira Peixoto");

            // formatação da mensagem para mostra-lá ao final do programa
            String mensagem = String.format("Nome do Aluno 1: %s\nRM do Aluno 1: %d\nIdade do Aluno 1 é: %d anos\n\nNome do Aluno 2: %s\nRM do Aluno 2: %d\nIdade do Aluno 2 é: %d anos\n\nNome do Aluno 3: %s\nRM do Aluno3: %d\nIdade do Aluno 3 é: %d anos\n\nNome do Aluno 4: %s\nRM do Aluno 4: %d\nIdade do Aluno 4 é: %d anos", aluno1.getNomeCompleto(), aluno1.getRegistroMatricula(), aluno1.calcularIdade(dataAtual), aluno2.getNomeCompleto(), aluno2.getRegistroMatricula(), aluno2.calcularIdade(dataAtual),  aluno3.getNomeCompleto(), aluno3.getRegistroMatricula(), aluno3.calcularIdade(dataAtual), aluno4.getNomeCompleto(), aluno4.getRegistroMatricula(), aluno4.calcularIdade(dataAtual));

            // apresenta os dados finais dos alunos
            JOptionPane.showMessageDialog(null, mensagem);

        }
        // tratamento de exceção
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "RM e/ou Ano de nascimento e/ou nome preenchido de maneira invalida!");
        }

    }
}
