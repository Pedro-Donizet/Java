package br.com.fiap.beans;

public class Cliente {
    // Visibilidade, tipo de dados e atributos

    private String nome;
    private String cpf;
    private int idade;
    private double altura;
    private Endereco endereco; // atrubuto de referencia


    // metodos setters (entrada) e metodos Getters (exibir)

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
