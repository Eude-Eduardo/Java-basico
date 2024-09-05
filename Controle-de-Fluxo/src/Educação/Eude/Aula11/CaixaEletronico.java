public class CaixaEletronico {
    
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 22.0;

        if(valorSolicitado <= saldo){
            saldo = saldo - valorSolicitado;System.out.printf("Novo saldo " + "R$" + "%.2f", saldo);
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        
    }
}
