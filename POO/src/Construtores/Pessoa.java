package Construtores;

public class Pessoa {
    private String nome;
    private String CPF;
    private String endereco;

    public Pessoa (String CPF, String nome) {
        this.CPF = CPF;
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getCPF() {
        return CPF;
    }
    public String getNome() {
        return nome;
    }
    
}
