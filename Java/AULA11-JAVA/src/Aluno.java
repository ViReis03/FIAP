public class Aluno {
    //atributos
    private String nome;
    private String matricula;

    // construtor vazio - criacao de objeto incompleto
    public Aluno() {
        System.out.println("Objeto incompleto criado");
    }

    //construtor parametrizado  - criacao de objetos completos
    public Aluno(String nome, String matricula){
        System.out.println("Objeto completo criado");
        this.nome = nome;
        this.matricula = matricula;
    }

    //getters e setters

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
