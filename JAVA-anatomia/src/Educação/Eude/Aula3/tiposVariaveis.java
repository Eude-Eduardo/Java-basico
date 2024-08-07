package Educação.Eude.Aula3;

public class tiposVariaveis {
    public static void main(String[] args) throws Exception{
        byte idade = 123;
        short ano = 2021;
        int CEP = 21070333;
        long CPF = 98765432109L;
        float pi = 3.14F;
        double salario = 2768.33;
        //-----------Adaptação de short para int(caso tenha números maiores que 30mil que é o maximo do tipo short-------------
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

    }
}
