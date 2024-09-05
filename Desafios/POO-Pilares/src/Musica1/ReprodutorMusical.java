package Musica1;


public class ReprodutorMusical implements Reprodutor{

    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    public void pausar() {
        System.out.println("PAUSADA");
    }

    public void reproduzirMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
    
}
