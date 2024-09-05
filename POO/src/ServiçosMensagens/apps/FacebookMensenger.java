package ServiçosMensagens.apps;

public class FacebookMensenger extends ServicoMensagensInstantanea{
    public void enviarMensagen() {
      validarAcessoInternet();
      System.out.println("Enviando mensagem pelo FACEBOOK");
      System.out.println("=================");
    }
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo FACEBOOK");
        System.out.println("=================");
    }
    
}
