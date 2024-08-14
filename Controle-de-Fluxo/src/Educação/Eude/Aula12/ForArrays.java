package Educação.Eude.Aula12;

public class ForArrays {
    public static void main(String[] args) {

        String alunos [] = {"Eu", "de", "args", "L", "de", "Pena"};
        
        for(int x = 0; x <= alunos.length; x++){

            System.out.println("O aluno no indece " + x + " é " + alunos[x]);
        }
    }
}
