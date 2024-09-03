package Set.Ordenação;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
	private String nome;
	private long cod;
	private double preco;
	private int quantidade;
	
	
	public Produto(String nome, long cod, double preco, int quantidade) {
		this.nome = nome;
		this.cod = cod;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	
	@Override
	public int compareTo(Produto o) {
		
		return nome.compareToIgnoreCase(o.getNome());
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCod() {
		return this.cod;
	}

	public void setCod(long cod) {
		this.cod = cod;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return this.cod == other.cod;
	}

	@Override
		public String toString() {
			return " Nome: " + nome + " | " + 
		" Código: " + cod +
		" Preço: " + preco +
		" Quantidade: " + quantidade;
		}

	
	
}
class ComparatorPorPreco implements Comparator<Produto>{

	@Override
	public int compare(Produto p1, Produto p2) {
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
	
}
