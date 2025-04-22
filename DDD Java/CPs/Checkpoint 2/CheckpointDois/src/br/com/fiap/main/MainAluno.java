// RM: 563925 - Gabriel Nogueira Peixoto ; RM:565834 - Mariana Inoue ; RM: 566154 - Giovanna Neri dos Santos
package br.com.fiap.main;

import br.com.fiap.bean.Aluno;

import javax.swing.*;
import java.time.LocalDate;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3, aluno4;
        String auxiliar;
        LocalDate dataAtual = LocalDate.now();

        try{
            // Utilizando JOptionPane para preencher o primeiro aluno
            auxiliar = JOptionPane.showInputDialog("Digite o RM do Aluno 1: ");
            aluno1.setRegistroMatricula(Integer.parseInt(auxiliar));

            auxiliar = JOptionPane.showInputDialog("Digite o ano de nascimento do Aluno 1: ");
            aluno1.setAnoDeNascimento(Integer.parseInt(auxiliar));

            auxiliar = JOptionPane.showInputDialog("Digite o nome completo do Aluno 1: ");
            aluno1.setNomeCompleto(auxiliar);

            // Utilizando JOptionPane para preencher o segundo aluno
            auxiliar = JOptionPane.showInputDialog("Digite o RM do Aluno 2: ");
            aluno2.setRegistroMatricula(Integer.parseInt(auxiliar));

            auxiliar = JOptionPane.showInputDialog("Digite o ano de nascimento do Aluno 2: ");
            aluno2.setAnoDeNascimento(Integer.parseInt(auxiliar));

            auxiliar = JOptionPane.showInputDialog("Digite o nome completo do Aluno 2: ");
            aluno2.setNomeCompleto(auxiliar);

            // Utilizando construtor com parâmetros para criação dos dois últimos alunos
            aluno3 = new Aluno(566154, 2006,"Giovanna Neri dos Santos");
            aluno4 = new Aluno(563925, 2002,"Gabriel Nogueira Peixoto");

            String mensagem = String.format("Nome do Aluno 1: %s\nRM do Aluno 1: %d\nIdade do Aluno 1 é: %d anos\n\nNome do Aluno 2: %s\nRM do Aluno 2: %d\nIdade do Aluno 2 é: %d anos\n\nNome do Aluno 3: %s\nRM do Aluno3: %d\nIdade do Aluno 3 é: %d anos\n\nNome do Aluno 4: %s\nRM do Aluno 4: %d\nIdade do Aluno 4 é: %d anos", aluno1.getNomeCompleto(), aluno1.getRegistroMatricula(), aluno1.calcularIdade(dataAtual), aluno2.getNomeCompleto(), aluno2.getRegistroMatricula(), aluno2.calcularIdade(dataAtual),  aluno3.getNomeCompleto(), aluno3.getRegistroMatricula(), aluno3.calcularIdade(dataAtual), aluno4.getNomeCompleto(), aluno4.getRegistroMatricula(), aluno4.calcularIdade(dataAtual));

            JOptionPane.showMessageDialog(null, mensagem);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
