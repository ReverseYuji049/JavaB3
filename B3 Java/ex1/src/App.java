import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        System.out.println("Escolha a figura geométrica na qual você queria calcular:");
        System.out.println("1 - Retângulo");
        System.out.println("2 - Círculo");
        System.out.println("3 - Triângulo");
        op = scanner.nextInt();
        scanner.nextLine();
        
        switch (op){
            case 1: System.out.println("Você escolheu o retângulo.");
                    retangulo();
                    break;
            case 2: System.out.println("Você escolheu o círculo.");
                    circulo();
                    break;
            case 3: System.out.println("Você escolheu o triângulo.");
                    triangulo();
                    break;
        }
        scanner.close();
    }  
    static void retangulo(){
        Scanner scanner = new Scanner(System.in);
        int opc = 0;

        while (opc < 2){
            System.out.println("Digite 1 para continuar a operação e digite 0 para sair:");
            opc = scanner.nextInt();
            scanner.nextLine();
            if (opc == 1){
                System.out.println("Digite a base do retângulo:");
                double base = scanner.nextDouble();
                System.out.println("Digite a altura do retângulo:");
                double altura = scanner.nextDouble();
                double area = base * altura;
                System.out.println("A área do retângulo é: " + area);
            } else if (opc == 0){
                System.out.println("Você escolheu sair.");
                break;
            } else {
                System.out.println("Opção inválida.");
                break;
            }
        }
        scanner.close();
        
    }

    static void circulo(){
        Scanner scanner = new Scanner(System.in);
        int opc = 0;
        while (opc < 2){
            System.out.println("Digite 1 para continuar a operação e digite 0 para sair:");
            opc = scanner.nextInt();
            scanner.nextLine();
            if (opc == 1){
                System.out.println("Digite o raio do círculo:");
                double raio = scanner.nextDouble();
                double area = raio * raio * 3.14;
                System.out.println("A área do círculo é: " + area);
            } else if (opc == 0){
                System.out.println("Você escolheu sair.");
                break;
            } else {
                System.out.println("Opção inválida.");
                break;
            }
        }
        scanner.close();
    }
    static void triangulo(){
        Scanner scanner = new Scanner(System.in);
        int opc = 0;

        while (opc < 2){
            System.out.println("Digite 1 para continuar a operação e digite 0 para sair:");
            opc = scanner.nextInt();
            scanner.nextLine();
            if (opc == 1){
                System.out.println("Digite a base do triângulo:");
                double base = scanner.nextDouble();
                System.out.println("Digite a altura do triângulo:");
                double altura = scanner.nextDouble();
                double area = (base * altura) / 2;
                System.out.println("A área do triângulo é: " + area);
        scanner.close();
            } else if (opc == 0){
                System.out.println("Você escolheu sair.");
                break;
            } else {
                System.out.println("Opção inválida.");
                break;
            }
        }
        scanner.close();
  }
}