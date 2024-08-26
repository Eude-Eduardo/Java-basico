package ServiçosMensagens.apps;

public class MSNMensenger extends ServicoMensagensInstantanea{
    public void enviarMensagen() {
        validarAcessoInternet();
        System.out.println("Enviando mensagem pelo MSN");
        System.out.println("=================");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");
        System.out.println("=================");
    }
}
