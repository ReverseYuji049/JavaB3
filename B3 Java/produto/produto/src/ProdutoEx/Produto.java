package ProdutoEx;

public class Produto {
    String nome;
    double preco;
    int qtd;

    public double totalValorEstoque(){
        return preco * qtd;
    }

    public void addProduto(int qtd){
        this.qtd += qtd;
    }

    public void removerProduto(int qtd){
        this.qtd -= qtd;
    }

    @Override
    public String toString() {
        return String.format("Nome do Produto: %s " +
                              "\nPreço: R$ %.2f" +
                              "\nQuantidade: %d" +
                              "\nValor total em estoque: R$ %.2f",
                              nome, preco, qtd, totalValorEstoque());
    }
}
//return "Produto.Produto: " + nome + "\nPreço: " + preco + "\nQuantidade: " + qtd;

/*"\nPreço: R$ %.2f" +
        "\nQuantidade: %d" +
        "\nValor total em estoque: R$ %.2F",
nome, preco, qtd, totalValorEstoque());
*/