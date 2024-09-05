package Educação.Eude.Aula08;

public class Doc {
    // https://docs.oracle.com/en/java/javase/17/
    /**
* <h1>Calculadora</h1>
* A Calculadora realiza operações matemáticas entre números inteiros
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Eude
* @version 1.0
* @since   01/01/2024
*/
public class Calculadora {
    /**
   * Este método é utilizado para somar dois números inteiros
   * @param numeroUm este é o primeiro parâmetro do método
   * @param numeroDois este é o segundo parâmetro do método
   * @return int o resultado deste método é a soma dos dois números.
   */
    public int somar(int numeroUm, int numeroDois) {
        return  numeroUm + numeroDois;
    }


}   
 /**  Tag      | Descrição
    * @author  | Autor / Criador
    * @version | Versão dos recursos disponibilizados
    * @since   | Versão/Data de início da disponibilação do recurso
    * @param   | Descrição dos parâmetros e dos métodos criados
    * @return  | Definição do tipo de retorno de um método
    * @throws  | Se o método lança alguma exceção  
    */

    //JAVADOC
    //https://pt.wikipedia.org/wiki/
    
    // No terminal execute o comando abaixo

    //javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
}
