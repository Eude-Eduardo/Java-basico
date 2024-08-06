package Educação.Eude.primeiraSemana;
public class MinhaClasse {

public static void main (String [] args){
    String primeiroNome = "Eude";
    String segundoNome = "Eduardo";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    System.out.print(nomeCompleto);
}
public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " +primeiroNome.concat(" ").concat(segundoNome);

    }
}
