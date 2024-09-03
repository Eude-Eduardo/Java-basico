package List.Ordenar;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas{
    
    private List<Pessoa> pessoaList;


    public OrdenacaoPessoas(List<Pessoa> pessoaList) {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList); 
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new comparatorPorAltura());
        return pessoasPorAltura;


    }
    public static void main(String[] args) {
        OrdenacaoPessoas ordenar = new OrdenacaoPessoas(null);

        ordenar.adicionarPessoa("Nome 1", 20, 1.96); 
        ordenar.adicionarPessoa("Nome 2", 30, 1.80);
        ordenar.adicionarPessoa("Nome 3", 25, 1.70);
        ordenar.adicionarPessoa("Nome 4", 17, 1.56);
        
        System.out.println(ordenar.pessoaList);

        // System.out.println(ordenar.ordenarPorIdade());
        // System.out.println(ordenar.ordenarPorAltura());
    }
}
