package Educação.Eude.Aula05.Tv;

public class User {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("_________");

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarCanal();
        smartTv.diminuirVolume();

        System.out.println("___________");
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);
        System.out.println("___________");
        smartTv.desligar();
        System.out.println("NEW -> " + smartTv.ligada);

        smartTv.inserirCanal(10);

        System.out.println("__==__");
        System.out.println("Novo Status -> Canal atual: " + smartTv.canal);
        System.out.println("Novo Status -> Volume atual: " + smartTv.volume);
    }
}