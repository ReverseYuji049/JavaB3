public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirInformaçoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + salario);
    }
}