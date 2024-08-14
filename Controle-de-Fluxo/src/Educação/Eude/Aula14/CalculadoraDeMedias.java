package Educação.Eude.Aula14;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String alunos [] = {"Camila","Lucas","Bruna","Pedro"};

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.1f ", media);
    }

    static double calculaMediaDaTurma(String[] alunos, Scanner Scanner) {

        double soma = 0;
        for (String aluno : alunos){
            System.out.printf("Nota do aluno foi %s ", aluno);
            double nota = Scanner.nextInt();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
