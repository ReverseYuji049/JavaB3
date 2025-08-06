public class Gerente extends Funcionario {
    String departamento; 

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public void exibirInformaçoes(){
        super.exibirInformaçoes();
        System.out.println("Departamento: " + departamento);
    }
}
