import java.util.Scanner;
import java.util.Locale;
public class NotasTernario {
    public static void main(String[] args) {
        try( Scanner sc = new Scanner(System.in).useLocale(Locale.US)){
            System.out.println("Qual a sua nota?"); 
            double nota = sc.nextDouble();

            String resultado = nota >= 7 ? "aprovado": nota >= 5 && nota < 7 ? "para a recuperação" : "reprovado";

            System.out.println("Você foi " + resultado);
        }
    }
}
