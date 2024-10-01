package br.com.fiap.beams;

public class Colaborador {
    public String nome;
    public int codigo;
    private double salario;
    public Endereco endereco;
    public String cargo;

    public Colaborador(int insiraSeuCodigo, String s, String insiraSeuCargo, double insriaSeuSalario){
        super();
    }

    public Colaborador(String nome, int codigo, double salario, String cargo, Endereco endereco){
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", salario=" + salario +
                ", endereco=" + endereco +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
