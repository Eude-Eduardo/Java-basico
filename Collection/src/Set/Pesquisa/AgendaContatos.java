package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	
	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatosPorNome = new HashSet<>();
		for (Contato c: contatoSet) {
			if (c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	
	public Contato atualizarNumeroContato(String nome, int novoNumero){
		Contato  contatoatulalizado = null;
		for(Contato c: contatoSet) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoatulalizado = c;
				break;
			}
		}
		return contatoatulalizado;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.exibirContatos();
		
		agendaContatos.adicionarContato("Camila", 123456);
		agendaContatos.adicionarContato("Camila", 0);
		agendaContatos.adicionarContato("Camila Cavalcante", 111111);
		agendaContatos.adicionarContato("Camila DIO", 64987);
		agendaContatos.adicionarContato("Maria Silvia", 11111111);
		
		agendaContatos.exibirContatos();
		
		System.out.println(agendaContatos.pesquisarPorNome("Camila"));
		
		System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silvia", 8899));
		
		agendaContatos.exibirContatos();
	}
	
}