
public class Main {
	public static void main(String[] args) {
		Banco banco = new Banco("Banco XYZ");

        Conta cliente1 = new ContaPoupança();
        Conta cliente2 = new ContaCorrente();
        Conta cliente3 = new ContaCorrente();
        
        cliente1.depositar(100);
        cliente2.depositar(50);
        cliente1.transferir(48.5, cliente3);
        
        banco.addCliente(cliente1);
        banco.addCliente(cliente2);
        banco.addCliente(cliente3);

        banco.MostarTodosClientes();
	}
}
