package véiculo;

public class Carro extends Veiculo{
    
    public void ligar(){
        confereCambio();
        confereCombustível();
        System.out.println("CARRO LIGADO");
    }
    private void confereCombustível(){
        System.out.println("conferindocombustível");
    }
    private void confereCambio(){
        System.out.println("CONFERINDO CAMBIO EM P");
    }
}
