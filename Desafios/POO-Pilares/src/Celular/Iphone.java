package Celular;

import Telefone.AparelhoTelefonico;
import Internet.NavegadorInternet;
import Musica1.ReprodutorMusical;


public class Iphone {
    private ReprodutorMusical ipod;
    private AparelhoTelefonico celular;
    private NavegadorInternet safari;

    public Iphone() {
        ipod = new ReprodutorMusical();
        celular = new AparelhoTelefonico();
        safari = new NavegadorInternet();
    }
    public void usarCelular(String numero){
        celular.ligar(numero);
        celular.atender();
        celular.iniciarCorreioVoz();
    }
    public void usarNavegador(String URL){
        safari.exibirPagina(URL);
        safari.adicionarNovaAba();
        safari.atualizarPagina();
    }
    public void usarReprodutor(String musica){
        ipod.reproduzirMusica(musica);
        ipod.tocar();
        ipod.pausar();
    }
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.usarCelular("1");

        iphone.usarNavegador("https://web.dio.me");
        
        iphone.usarReprodutor("Paranaue");
    }
}
