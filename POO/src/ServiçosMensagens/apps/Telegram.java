package ServiçosMensagens.apps;

public class Telegram extends ServicoMensagensInstantanea{
    public void enviarMensagen() {
        validarAcessoInternet();
        System.out.println("Recebendo mensagem pelo TELEGRAM");
        System.out.println("=================");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo TELEGRAM");
        System.out.println("=================");
    }
}
