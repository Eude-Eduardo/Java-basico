package Set.Ordenação;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
/*
 * adicionarProduto(long cod, String nome, double preco, int quantidade)
 * exibirProdutosPorNome()
 * exibirProdutosPorPreco()*/
	private Set<Produto> produtoSet;
	
	public CadastroProduto() {
		this.produtoSet = new HashSet<>();
	}
	
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(nome, cod, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		return produtosPorNome;
		
	}
	
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtoSet);
		return produtosPorPreco;
	}
	
	public static void main(String[] args) {
		CadastroProduto cadastroProduto = new CadastroProduto();
		
		cadastroProduto.adicionarProduto(1L, "Produto 5", 15d, 5);
		cadastroProduto.adicionarProduto(2L, "Produto 0", 20d, 10);
		cadastroProduto.adicionarProduto(1L, "Produto 3", 10d, 2);
		cadastroProduto.adicionarProduto(9L, "Produto 9", 2d, 2);
		
		System.out.println(cadastroProduto.produtoSet);
		
		System.out.println(cadastroProduto.exibirProdutosPorNome());
		System.out.println(cadastroProduto.exibirProdutosPorPreco());
	}
}	