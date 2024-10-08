package br.com.fiap.beams;

public class Endereco {
    private String loogradouro;
    private int numero;
    private String complemento;
    private String cep;

    public Endereco(){
        super();
    }

    public Endereco(String loogradouro, int numero, String complemento, String cep) {
        this.loogradouro = loogradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    public String getLoogradouro() {
        return loogradouro;
    }

    public void setLoogradouro(String loogradouro) {
        this.loogradouro = loogradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "loogradouro='" + loogradouro + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
