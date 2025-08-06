import java.util.Scanner;
public class testeFuncionario {
    public static void main(String[] args) {
        int porcentagemAumento;
        Funcionario funcionario = new Funcionario();
        System.out.println("Digite os dados do funcionário: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        funcionario.nome = scanner.nextLine();
        System.out.print("Salário: ");
        funcionario.salario = scanner.nextDouble();
        System.out.println("Digite a porcentagem de aumento do salário: ");
        porcentagemAumento = scanner.nextInt();
        funcionario.aumentarSalario(porcentagemAumento);
        System.out.print("Digite a porcentagem do imposto (1 - 100): ");
        funcionario.imposto = scanner.nextDouble();
        scanner.close();
        System.out.println("Funcionário: "+ funcionario.nome);
        System.out.println("Salário Líquido: R$ " + funcionario.salario);
        System.out.println("O valor do novo salário é: " + funcionario.novoSalario());
    }
}