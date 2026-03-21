public class ProdutoTeste {
    static void main(String[] args) {

        Produto produto = new Produto("Produto", 10f);
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preco: " + produto.getPreco());

        System.out.println("========================");

        Produto outroProduto = new Produto("Outro Produto");
        System.out.println("Nome: " + outroProduto.getNome());
        System.out.println("Preco: " + outroProduto.getPreco());
        outroProduto.setPreco(1000);
        System.out.println("Preco: " + outroProduto.getPreco());


    }
}
