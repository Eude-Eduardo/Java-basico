import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> clientes;
    private String nome;

    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public void addCliente(Conta cliente) {
        clientes.add(cliente);
    }

    public void MostarTodosClientes() {
        for (Conta cliente : clientes) {
            cliente.mostar();
            System.out.println();
        }
    }
}