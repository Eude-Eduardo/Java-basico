import java.util.Scanner;

public class PlanosCelular {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Qual o plano vai querer? [B/M/T]");
            String plano = sc.next().toUpperCase();

            switch (plano) {
                case "T":
                    System.out.println("5Gb YouTube");
                case "M":
                    System.out.println("Whatsapp e instagram grastis");
                case "B":
                    System.out.println("100 minutos de ligação");
                    break;
                default:
                    System.out.println("Plano indefinido");
                    break;
            }

        }
    }
}
