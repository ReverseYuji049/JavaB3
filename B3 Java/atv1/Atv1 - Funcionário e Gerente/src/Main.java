public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Yuji", 7000);
        f.exibirInformaçoes();

        System.out.println();

        Gerente g = new Gerente("Julia", 15000, "Pós-Telemarketing");
        g.exibirInformaçoes();
    }
}
