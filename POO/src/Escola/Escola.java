public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(16);
        felipe.setSexo("masculino");
        
        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos e é do sexo " + felipe.getSexo());
    }
}
