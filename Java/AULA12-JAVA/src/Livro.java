public class Livro {

    //atributos
    private String titulo;
    private String autor;
    private int ano;
    private String editora;

    //construtores
    public Livro(String titulo, String autor, int ano,String editora){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
    }

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    //getters e setters
    public String getTitulo(){return this.titulo;}
    public void setTitulo(String titulo){this.titulo = titulo;}

    public String getAutor(){return this.autor;}
    public void setAutor(String autor){this.autor = autor;}

    public int getAno(){return this.ano;}
    public void setAno(int ano){this.ano = ano;}

    public String getEditora(){return this.editora;}
    public void setEditora(String editora){this.editora = editora;}
}
