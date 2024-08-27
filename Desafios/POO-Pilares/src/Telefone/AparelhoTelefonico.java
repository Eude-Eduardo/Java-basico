package Telefone;

public class AparelhoTelefonico implements Telefone{
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }
    public void atender() {
        System.out.println("Atendendo chamada");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Caixa postal");
    }
    
}
