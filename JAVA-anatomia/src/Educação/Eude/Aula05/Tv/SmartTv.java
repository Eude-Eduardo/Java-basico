package Educação.Eude.Aula05.Tv;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;
    
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarCanal(){
        canal ++;
    }
    public void diminuirCanal(){
        canal --;
    }
    public void inserirCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo o volume para: " + volume --);
    }

}

