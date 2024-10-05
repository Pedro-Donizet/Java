package br.com.fiap.beams;

public class Carro {
    private int codigo;
    private String marca;
    private String modelo;
    private int ano;
    private double valor;

    public Carro(){
        super();
    }
    public Carro(int codigo, String marca, String modelo, int ano, double valor) {
        super();
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "\ncodigo=" + codigo +
                "\nmarca='" + marca + '\'' +
                "\nmodelo='" + modelo + '\'' +
                "\nano=" + ano +
                "\nvalor=" + valor +
                '}';
    }
}
