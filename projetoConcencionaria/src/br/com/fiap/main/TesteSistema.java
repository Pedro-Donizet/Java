package br.com.fiap.main;

import br.com.fiap.beams.Carro;
import br.com.fiap.beams.Concessionaria;

import javax.swing.*;

public class TesteSistema {
    static String text(String j){
        return JOptionPane.showInputDialog(j);
    }
    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }
    static double real(String j){
       return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        Carro objCarro = new Carro(
                inteiro("insira o codigo do carro: "),
                text("marca do carro: "),
                text("modelo do carro: "),
                inteiro("ano do carro: "),
                real("ano do carro: ")
        );
        Concessionaria objConcessionaria = new Concessionaria(
                text("nome da sua concessionaria:"),
                text("seu email empresarial: "),
                text("O cnpj da sua empresa: "),
                text("carro distribuido pela sua concessionaria|:")
        );

        objConcessionaria.setCarro(objCarro);

        System.out.println(objConcessionaria);


    }
}
