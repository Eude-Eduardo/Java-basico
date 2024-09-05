package Enums;

public class EstadosBrasileiro {
    // Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
	SAO_PAULO ("SP","São Paulo", 11),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 21),
	PIAUI ("PI", "Piauí", 22),
	MARANHAO ("MA","Maranhão", 98),
	CEARA ("CE", "Ceará", 85) ;
	
	private String nome;
	private String sigla;
	private int ibge;

	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}
	public int getIbge() {
		return ibge;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}
/*
    Boas práticas para criar objetos Enum
* As opções (objetos) devem ser descritos em caixa alta separados por underline (_), ex.: OPCAO_UM, OPCAO_DOIS
* Após as opções deve-se encerrar com ponto e vírgula (;)
* Um enum é como uma classe, logo poderá ter atributos e métodos tranquilamente
* Os valores dos atributos devem já ser definidos após cada opção dentro de parênteses como se fosse um new
* O construtor deve ser privado
* Não é comum um enum possuir o recurso setter (alteração de propriedade), somente os métodos getters correspondentes.
 */
}
