package Educação.Desafios.ContaBanco.src;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        try(
            Scanner sc = new Scanner(System.in)){
                System.out.println("Por favor! Digite o número da conta:");
                int numeroConta = sc.nextInt();

                

                System.out.print("Agora o número da sua agência:");
                String agencia = sc.next();

                sc.nextLine();

                System.out.println("Seu nome:");
                String nomeCliente = sc.nextLine();

                System.out.println("E por ultimo, seu saldo:");
                double saldo = sc.nextDouble();
                // Pela falta no useLocale(Locale.US) no saldo necessita de "," para digitar no terminal
                // Achei melhor assim, mas é melhor avisar

                System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta de número " + numeroConta + " e seu sado R$" + "%.2f" , saldo , 0 + " já está disponível para saque"); 
            }
    }
}
