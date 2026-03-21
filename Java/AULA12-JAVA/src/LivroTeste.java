public class LivroTeste {
    public static void main(String[] args) {
        Livro l1 = new Livro("Titulo 1", "Autor 1",2026 ,"Editora 1");
        Livro l2 = new Livro("Titulo 2", "Autor 2");

        //configurando os atributos ano e editora atraves dos metodos setters
        l2.setAno(2025);
        l2.setEditora("Editora2");

        System.out.println(
                "\nTitulo: "  + l1.getTitulo()    +
                "\nAutor: "   + l1.getAutor()     +
                "\nAno: "     + l1.getAno()       +
                "\nEditora: " + l1.getEditora()
        );

        System.out.println(
                "\nTitulo: "  + l2.getTitulo()    +
                "\nAutor: "   + l2.getAutor()     +
                "\nAno: "     + l2.getAno()       +
                "\nEditora: " + l2.getEditora()
        );
    }
}
