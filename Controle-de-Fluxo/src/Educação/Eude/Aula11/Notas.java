import java.util.Scanner;
import java.util.Locale;

public class Notas {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Qual a nota?");
            double nota1 = sc.nextDouble();

            if (nota1 >= 7){
                System.out.println("Aprovado!");
            }
            else if(nota1 >= 5 && nota1 < 7){ // true ou false
                System.out.println("Prova de recuperação");
            }
            else{
                System.out.println("Reprovado!");
            }
        }
    }
}
