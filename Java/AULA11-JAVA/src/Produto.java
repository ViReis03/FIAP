public class Produto {

    private String nome;
    private float preco;

    //
    public Produto(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    //sobrecarga de metodos
    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0;
    }
    //getters e setters
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public float getPreco(){
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
