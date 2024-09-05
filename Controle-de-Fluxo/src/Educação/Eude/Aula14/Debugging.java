package Educação.Eude.Aula14;

public class Debugging {
    public static void main(String[] args) {
        System.out.println("Iniciou o programa do método Main");
        a();
        System.out.println("Finalizou o programa no método MAin");
        
    }
    public static void a(){
        System.out.println("Entrou no método a");
        b();
        System.out.println("Finalizou no método a");
   }
   static void b(){
        System.out.println("Entrou no método b");
        for(int x = 0; x <=4; x++) System.out.println(x);
        c();
        System.out.println("Finalizou o método b");
   }
   static void c(){
        System.out.println("Entrou no método c");
        //.dumoStack()
        System.out.println("Finalizou o método c");
   }
    
    
}