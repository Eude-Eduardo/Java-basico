package véiculo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("Olá");
        
        Moto tristeMp4 = new Moto();
        tristeMp4.setChassi("Hello");
        

        Veiculo coringa = jeep;
    
        coringa.ligar();
    }
}
