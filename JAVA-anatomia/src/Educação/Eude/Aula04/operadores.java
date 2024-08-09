package Educação.Eude.Aula04;
import java.util.Date;
public class operadores {
    
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
                double res =  (10 * 7) + (20/4);
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
            System.out.println("______________________________");
        //Ternário
        int a, b;

        a = 5;
        b = 6;
        /*/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
            if(a==b)
            resultado = "verdadeiro";
            else
            resultado = "falso";
            */
        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
            String resultado = (a==b) ? "verdadeiro" : "false";
            System.out.println(resultado);
            System.out.println("+_+_+_+_+_+_+_+");
        // == Quando desejamos verificar se uma variável é IGUAL A outra.

        /*!= Quando desejamos verificar se uma variável é DIFERENTE da outra.

        > Quando desejamos verificar se uma variável é MAIOR QUE a outra.

        >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.

        < Quando desejamos verificar se uma variável é MENOR QUE outra.

        <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.*/

            String nome1 = "Eude";
            String nome2 = "eude";
            
            System.out.println(nome1 == nome2);
            System.out.println(nome1 != nome2);
            int n1 = 1;
            int n2 = 2;

            if (n1 == n2)//false
                System.out.println(n1 + " é igual ao " + n2);
            if (n1!=n2)// true
                System.out.println(n1 + " é diferente de " + n2);
            if (n1 < n2)// true
                System.out.println(n1 + " é menor que " + n2);
            if (n1 > n2)// false
                System.out.println(n1 + " é maior que " + n2);
            if (n1 <= n2)// true
                System.out.println(n1 + " é menor ou igual a " + n2);
            if (n1 >= n2)// false
                System.out.println(n1 + " é maior ou igual a " + n2);

            System.out.println("________________________");
        // lógicos
            /*&& Operador Lógico "E"

              || Operador Lógico "OU" */
              boolean condicao1=true;

              boolean condicao2=false;

            if (condicao1 && condicao2){// true e false
                System.out.println("São verdadeiras");
            }
            if (condicao1 && !condicao2){// true e !false(false negado)
                System.out.println("São verdadeiras");
            }
            if (condicao1 && (8 >= 1) ){
                System.out.println("8 é maior que 4 e a condição 1 é verdadeira");
            }
            if (condicao1 || condicao2){// Uma delas é true
                System.out.println("pelo menos uma é true");
            }
            
            System.out.println("FIM!");


                
    }       
    

} 

