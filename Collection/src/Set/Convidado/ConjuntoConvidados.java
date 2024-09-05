package Set.Convidado;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadoSet;
	
	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}		
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemoverConvidado = null;
		for (Convidado c: convidadoSet) {
			if(c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemoverConvidado = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemoverConvidado);
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");
		
		conjuntoConvidados.adicionarConvidado("Convidado 1", 2020);
		conjuntoConvidados.adicionarConvidado("Convidado 2", 5050);
		conjuntoConvidados.adicionarConvidado("Convidado 3", 2030);
		conjuntoConvidados.adicionarConvidado("Convidado 4", 5050);
		
		
		conjuntoConvidados.exibirConvidados();
		
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");

		conjuntoConvidados.removerConvidadoPorCodigoConvite(2020);
		
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");
		
		conjuntoConvidados.exibirConvidados();
	}
}	
