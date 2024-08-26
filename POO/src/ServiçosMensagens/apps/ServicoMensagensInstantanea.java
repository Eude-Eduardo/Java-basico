package ServiçosMensagens.apps;

public abstract class ServicoMensagensInstantanea {
    public abstract void enviarMensagen();
    public abstract void receberMensagem();

    
    protected void validarAcessoInternet(){
        System.out.println("Validando conexão a internet");
    }
}

