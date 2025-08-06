public class Funcionario {
    String nome;
    double salario;
    double imposto;
    
    public double novoSalario(){
        return salario -= (salario * (imposto/100));
    }

    public double aumentarSalario(int porcentagemAumento){
        //aumenta o salário com a porcentagem de aumento dita pelo o usuário na subclasse testeFuncionario
        salario += salario * porcentagemAumento / 100;
        return salario;
    } 
    public String toString() {
        return String.format("Nome do Produto: %s " +
                              "\nPreço: R$ %.2f" +
                              "\nQuantidade: %d" +
                              "\nValor total em estoque: R$ %.2f",
                              nome, salario, imposto, novoSalario());

   }
}