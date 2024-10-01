package br.com.fiap.main;

import br.com.fiap.beams.Cliente;
import br.com.fiap.beams.Colaborador;
import br.com.fiap.beams.Endereco;

import javax.swing.*;

public class TesteMain {

    static String text(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int intero(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }


    public static void main(String[] args) {

        Cliente objCliente = new Cliente();
        Colaborador objColaborador = new Colaborador(
                intero("insira seu codigo"),
                text("insira seu nome:"),
                text("insira seu cargo"),
                real("insria seu salario")
                );
        Endereco objEndereco = new Endereco(
                text("logradouro"),
                intero("numero"),
                text("Complemento"),
                text("CEP"),
                text("bairro"),
                text("cidade")
        );




    }
}

