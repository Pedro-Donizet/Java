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

        //Cliente
        objCliente.setNome(JOptionPane.showInputDialog("Digite o nome do cliente: "));
        objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade")));
        objCliente.setCpf(JOptionPane.showInputDialog("DIgite seu CPF: "));
        objCliente.setAltura(Double.parseDouble(JOptionPane.showInputDialog("digite sua altura: ")));


        //Endereço
        objEndereco.setLogradouro(JOptionPane.showInputDialog("insira o logradouro onde você mora:"));
        objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("insira o numero de sua residencia:")));
        objEndereco.setCep(JOptionPane.showInputDialog("insira o cep:"));
        objEndereco.setBairro(JOptionPane.showInputDialog("insira o bairro:"));
        objEndereco.setCidade(JOptionPane.showInputDialog("insira a cidade onde você mora"));

        objCliente.setEndereco(objEndereco);

        //produto
        objProduto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("insira o codigo do produto: ")));
        objProduto.setTipo(JOptionPane.showInputDialog("insira o tipo do produto: "));
        objProduto.setMarca(JOptionPane.showInputDialog("insira a Marca do produto: "));
        objProduto.setValor(Double.parseDouble(JOptionPane.showInputDialog("insira o valor do produto")));




        //Saidas
        System.out.println(
                "Nome: " + objCliente.getNome() +
                "\nIdade: " + objCliente.getIdade() +
                "\nAltura: " + objCliente.getAltura() +
                "\nCPF: " + objCliente.getCpf() +
                        "\n" +
                "\nLogradouro: " + objCliente.getEndereco().getLogradouro() +
                "\nNumero: " + objCliente.getEndereco().getNumero() +
                "\nCidade: " + objCliente.getEndereco().getCidade() +
                "\nBairro: " + objCliente.getEndereco().getBairro() +
                "\nCEP: " + objCliente.getEndereco().getCep() +
                "\n"
        );

        System.out.println(
                "tipo de produto: " + objProduto.getTipo() +
                "\nvalor do produto: " + objProduto.getValor() +
                "\nmarca do produto: " + objProduto.getMarca() +
                "\ncodigo do produto: " + objProduto.getCodigo()
        );

    }

}
