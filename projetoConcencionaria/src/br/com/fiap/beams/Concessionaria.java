package br.com.fiap.beams;

public class Concessionaria {

    private String nome;
    private String email;
    private String cnpj;
    private String carro;

    public Concessionaria(String nome, String email, String cnpj, String text) {
        this.nome = nome;
        this.email = email;
        this.cnpj = cnpj;
    }

    public Concessionaria(){
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "Concessionaria{" +
                "\nnome='" + nome + '\'' +
                "\nemail='" + email + '\'' +
                "\ncnpj='" + cnpj + '\'' +
                "\ncarro='" + carro + '\'' +
                '}';
    }

    public void setCarro(Carro objCarro) {

    }
}
