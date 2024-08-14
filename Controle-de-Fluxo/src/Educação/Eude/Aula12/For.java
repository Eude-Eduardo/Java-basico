package Educação.Eude.Aula12;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {
       try(
        Scanner sc = new Scanner(System.in)){
        int num = sc.nextInt();

        for(int carneirinhos = 1; carneirinhos <=10;carneirinhos ++){
            System.err.println(num + " x " + carneirinhos  + " = " + num * carneirinhos);
            
                        
        }
        }  
    } 
}
