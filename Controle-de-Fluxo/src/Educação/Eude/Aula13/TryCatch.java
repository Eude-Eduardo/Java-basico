package Educação.Eude.Aula13;
import java.util.Locale;
import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);{
                
                System.out.println("Qual seu nome?");
                String nome = sc.nextLine();

                System.out.println("Qual seu sobrenome?");
                String sobrenome = sc.nextLine();

                System.out.println("Qual sua idade?");
                int idade = sc.nextInt();

                System.out.println("Qual sua altura?");
                double altura = sc.nextDouble();

                System.out.println("Olá me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
                System.out.println("Tenho " +  idade + " anos");
                System.out.println("Minha altura é " + altura + "cm");
            }
        } catch (java.util.InputMismatchException e){
                System.out.println("Os campos idade e altura precisam ser numéricos");
        }
}
}
