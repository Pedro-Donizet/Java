package br.com.fiap.beams;

public class Endereco {
    public String logradouro;
    public String cidade;
    public String bairro;
    public String numero;
    public String complemento;
    public String cep;

    public Endereco(String logradouro, int numero, String complemento, String cep, String bairro, String cidade){
        super();
    }

    public Endereco(String logradouro, String cidade, String bairro, String numero, String complemento, String cep) {
        super();
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
