package Educação.Eude.Aula13;

public class CepInvalidoException extends Exception{
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("1234678901");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
        
            System.out.println("Cep não corresponde com as regras de quantidade de números");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
