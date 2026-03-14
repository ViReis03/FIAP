public class ProdutoTeste {
    public static void main(String[] args) {
        Produto roberto = new Produto();

        //int idRoberto = roberto.getId();



        roberto.setId(12);
        int idRoberto = roberto.getId();
        System.out.println("ID: " + idRoberto);

        roberto.setNome("Roberto");
        String nomeRoberto = roberto.getNome();
        System.out.println("Nome: " + nomeRoberto);

        roberto.setPreco(10.1f);
        float precoRoberto = roberto.getPreco();
        System.out.println("Preço: R$" + precoRoberto);
    }
}
