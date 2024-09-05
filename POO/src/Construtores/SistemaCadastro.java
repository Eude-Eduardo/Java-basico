package Construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("123", "Marcos");
        marcos.setEndereco("RUA");

        System.out.println("Nome: " + marcos.getNome() + " CPF: " + marcos.getCPF() + " Endereço: " +marcos.getEndereco());
        
    }
}
