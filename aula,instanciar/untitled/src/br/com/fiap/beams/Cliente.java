package br.com.fiap.beams;

public class Cliente {
    public String nome;
    public String cpf;
    public double altura;
    public Endereco endereco;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int idade;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", altura=" + altura +
                ", endereco=" + endereco +
                ", idade=" + idade +
                '}';
    }

}
