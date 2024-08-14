package Educação.Eude.Aula12;

public class While {
    public static void main(String[] args) {
        int dinheiro = 50;
        int doce = 2;
        while (doce <= dinheiro) {
            
            dinheiro = dinheiro - doce;
            System.err.println(dinheiro);
        }
    }
}
