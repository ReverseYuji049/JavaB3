import java.util.Scanner;
public class testeTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        tr x, y;
        x = new tr();
        y = new tr();
        System.out.print("Lado a: ");
        x.A = scanner.nextDouble();
        System.out.print("Lado b: ");
        x.B = scanner.nextDouble();
        System.out.print("Lado c: ");
        x.C = scanner.nextDouble();
        System.out.print("Area X = " + x.calcularArea());
        //the method calcularArea will use the values A, B and C
        System.out.println (" ");
        System.out.print("Lado a: ");
        y.A = scanner.nextDouble();
        System.out.print("Lado b: ");
        y.B = scanner.nextDouble();
        System.out.print("Lado c: ");
        y.C = scanner.nextDouble();
        System.out.print("Area X = " + y.calcularArea());

        if (x.calcularArea() > y.calcularArea()){
            System.out.print("A área do triângulo X é maior!");
        }else if (x.calcularArea() < y.calcularArea()) {
            System.out.print("A área do triângulo Y é maior!");
        }else{
            System.out.print("As áreas dos triângulos são iguais!");
        }
        System.out.println(" ");
        System.out.print("O triângulo X é um triângulo: ");
        x.verifyType();
        System.out.println(" ");
        System.out.print("O triângulo Y é um triângulo:");
        y.verifyType();
        scanner.close();
    }
}
