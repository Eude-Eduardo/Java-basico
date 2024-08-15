import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número");
        int primeiroNumero = scan.nextInt();
        
        System.out.println("Digite o segundo número");
        int segundoNumero = scan.nextInt();
    try{
        contar(primeiroNumero, segundoNumero);

    }catch(ParametrosInvalidosException e){
        System.out.println("O segundo número deve ser maior que o primeiro");
    }
    }
    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (primeiroNumero >= segundoNumero) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro");
        }

		int contagem = segundoNumero - primeiroNumero;
		//realizar o for para imprimir os números com base na variável contagem
        for(int i = 1; i <= contagem;i++){
            System.out.println("Imprimindo número: " + i);
        }
	}
}
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String alerta) {
        super(alerta);
    }
}