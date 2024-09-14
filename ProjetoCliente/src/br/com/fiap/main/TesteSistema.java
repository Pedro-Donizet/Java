package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

import javax.swing.*;

public class TesteSistema {

    public static void main(String[] args) {

        // instanciar objetos
        Cliente objCliente = new Cliente();
        Endereco objEndereco = new Endereco();
        Produto objProduto = new Produto();

        //Entradas

        objCliente.setNome(JOptionPane.showInputDialog("Digite o nome do cliente: "));
        objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade")));
        objCliente.setCpf(JOptionPane.showInputDialog("DIgite seu CPF: "));
        objCliente.setAltura(Double.parseDouble(JOptionPane.showInputDialog("digite sua altura: ")));


    }

}
