public class AlunoTeste {
    static void main(String[] args) {
        //criando um objeto incompleto de aluno
        Aluno aluno = new Aluno();
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matricula: " + aluno.getMatricula());

        //criando um objeto completo de aluno
        Aluno outroAluno = new Aluno("Felipe", "123");
        System.out.println("Nome: " + outroAluno.getNome());
        System.out.println("Matricula: " + outroAluno.getMatricula());

    }
}