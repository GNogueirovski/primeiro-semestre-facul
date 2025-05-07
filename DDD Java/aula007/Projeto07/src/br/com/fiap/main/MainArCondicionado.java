package br.com.fiap.main;

import br.com.fiap.bean.ArCondicionado;

import java.util.Scanner;

public class MainArCondicionado {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        Scanner scan;
        int escolha;

        try{
            scan = new Scanner(System.in);

            System.out.println("Digite a temperatura do ar condicionado e seu modo: ");
            ar.setTemperatura(scan.nextInt());
            ar.setModo(scan.next());

            System.out.println("Escolha uma opção do menu:\n(1)Definir modo\n(2)Definir temperatura\n(3)Aumentar temperatura\n(4)Diminuir temperatura");
            escolha = scan.nextInt();

            if (escolha == 1) {
                System.out.println("Escolha o modo do seu ar condicionado: ");
                ar.setModo(scan.next());
            }
            else if (escolha == 2) {
                System.out.println("Escolha uma nova temperatura: ");
                ar.setTemperatura(scan.nextInt());
            }
            else if (escolha == 3) {
                System.out.println("Aumentando temperatura...");
                ar.aumentarTemperatura();
            }
            else{
                System.out.println("Diminuindo temperatura...");
                ar.diminuirTemperatura();
            }

            System.out.printf("Modo atual: %s\nTemperatura Atual: %d ", ar.getModo(), ar.getTemperatura());

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
