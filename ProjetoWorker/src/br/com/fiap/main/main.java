package br.com.fiap.main;

import br.com.fiap.beams.Colaborador;
import br.com.fiap.beams.Endereco;

import javax.swing.*;

public class main {

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

        Colaborador objColaborador = new Colaborador(
                text("nome"),
                text("cargo"),
                real("valor da hora"),
                real("quantidade por hora")
        );
        Endereco objEndColaborador = new Endereco(
                text("logradouro"),
                inteiro("numero"),
                text("complemento"),
                text("cep")
        );

        objColaborador.setEndereco(objEndColaborador);


    }
}
