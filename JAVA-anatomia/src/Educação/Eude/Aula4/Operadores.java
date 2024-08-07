import java.util.Date;

public class Operadores {
    
    public static void main(String[] args) {
        
        // Operadores
        // Atribuição (Representado pelo símbolo de igualdade "=")
        String nome = "Eude";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();
        
        // Aritiméticos (+ (adição), - (subtração), * (multiplicação) e / (divisão).)
                double soma = 10 + 18.0;
                int subtração = 113 - 25;
                int multiplicação = 20 * 7;
                int divisão = 15 / 3;
                int restoDivisão = 18 % 3;
                double resultado =  (10 * 7) + (20/4);
                // () parenteses tem prioridade
                /* 
                 */
                /*O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”*/
                String concatenacao ="?"; 

                concatenacao = 1+1+1+"1";
                
                concatenacao = 1+"1"+1+1;
                
                concatenacao = 1+"1"+1+"1";
                
                concatenacao = "1"+1+1+1;
                
                concatenacao = "1"+(1+1+1);
                    
                    
        // Unários
        /*(+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;

        (-) Operador unário de valor negativo – nega um número ou expressão aritmética;

        (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;

        (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;

        (!) Operador unário lógico de negação – nega o valor de uma expressão booleana. */
        int numero = -5;
            System.out.println("Inverte o sinal: " + -numero);
        numero = 5;
            System.out.println("Sinal invertido: " + -numero);
            System.out.println("Adiciona 1: " + ++ numero);
            System.out.println("Remove 1: " + --numero);

        boolean fez = false;
            System.out.println("Antes: " + fez);
            System.out.println("Depois: inverteu o false (funciona se for true) " + !fez);
                
    }
} 
