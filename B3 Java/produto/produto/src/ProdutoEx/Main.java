package ProdutoEx;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Digite os dados do produto:");
        System.out.print("Nome: ");
        produto.nome = scanner.nextLine();
        System.out.print("Preço: ");
        produto.preco = scanner.nextDouble();
        System.out.print("Quantidade: ");
        produto.qtd = scanner.nextInt();
        System.out.println("-------------------");
        System.out.println("Dados do Produto.Produto:");
        System.out.println(produto);
    }
}
