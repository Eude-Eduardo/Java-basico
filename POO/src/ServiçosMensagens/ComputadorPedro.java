package ServiçosMensagens;

import ServiçosMensagens.apps.FacebookMensenger;
import ServiçosMensagens.apps.MSNMensenger;
import ServiçosMensagens.apps.ServicoMensagensInstantanea;
import ServiçosMensagens.apps.Telegram;

public class ComputadorPedro {
    public static void main(String[] args) {
        ServicoMensagensInstantanea app = null;

        String appEscolhido = "Facebook";

        if (appEscolhido.equals("MSN"))
            app = new MSNMensenger();
        else if (appEscolhido.equals("Facebook"))
            app = new FacebookMensenger();
        else if (appEscolhido.equals("Telegram"))
            app = new Telegram();

        app.enviarMensagen();
        app.receberMensagem();
    }
}
