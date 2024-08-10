package Educação.Eude.Aula05;

public class Métodos {
    // Usar o camelCase para nomear e está no infinitivo
        /*Ex:
        somar(int n1, int n2){}

        abrirConexao(){}

        concluirProcessamento() {}

        findById(int id){}  As veses o método precisa ser em inglês

        calcularImprimir(){}  O método deveria ter uma única finalidade*/

    // Critério de definição de métodos
    //Qual a proposta principal do método? 
    //Você deve se perguntar constantemente até compreender a real finalidade do mesmo.

    //Qual o tipo de retorno esperado após executar o método?
    //Você deve analisar se o método será responsável por retornar algum valor ou não.

    /*
     * Se não retornar nenhum valor, ele será representado pela palavra-chave "void"
     * 
     */
    /*
     *Quais os parâmetros serão necessários para execução do método? 
    *Os métodos às vezes precisarão de argumentos como critérios para a execução. 
    */

    /*
     * O método possui o risco de apresentar alguma exceção?
     *  Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a possível existência de uma exceção.
     */

    /*
     * Qual a visibilidade do método? 
     * Avaliar se será necessário que o método seja visível a toda aplicação, somente em pacotes, através de herança ou somente a nível a própria classe.
     */

    //NÃO EXISTE EM JAVA O CONCEITO DE MÉTODOS GLOBAIS. TODOS OS MÉTODOS DEVEM SEMPRE SER DEFINIDOS DENTRO DE UMA CLASSE.

    //Ex:
    // VOID não retorna nada
    public double somar(int num1, int num2){
        // lógica
        return 1.0;// precisa do return pois não tem um void 
    }
    public void imprimir(String texto){
		//LOGICA - FINALIDADE DO MÉTODO
		//AQUI NÃO PRECISA DO RETURN
		//POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
    }
    public double dividir(int dividendo, int divisor) throws Exception{//throws Exception(Exeção)
        return 1.0;
    }
    private void metodoPrivado(){}

}
