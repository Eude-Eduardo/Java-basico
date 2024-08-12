import java.util.Scanner;
import java.util.Locale;

public class SistemaMedidas {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in).useLocale(Locale.US)){

            System.out.println("Qual a medida da sua camisa [P/M/G]? ");
            String medida = sc.next();

            switch (medida) {
                case "p":
                    System.out.println("Pequeno");
                    break;
                case "m":
                    System.out.println("Médio");
                    break;
                case "g":
                    System.out.println("Grande");
                    break;
                default:
                    System.out.println("INDEFINIDO");
                    break;
            }
        }   
    }
}
