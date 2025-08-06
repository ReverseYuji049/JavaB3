import java.util.Scanner;
public class mêsTrimeste {
    public static void main(String[] args) throws Exception {
        int tri;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do seu mês (1 a 12):");
        tri = scanner.nextInt();
        scanner.nextLine();

        if (tri >= 1 && tri <= 3){
                trimestreUm();
                System.out.println("Você nasceu no primeiro trimestre.");
        } else if (tri >= 4 && tri <= 6){
                trimestreDois();
                System.out.println("Você nasceu no segundo trimestre.");
        } else if (tri >= 7 && tri <= 9){
                trimestreTrês();
                System.out.println("Você nasceu no terceiro trimestre.");
        } else if (tri >= 10 && tri <= 12){
                trimestreQuatro();
                System.out.println("Você nasceu no quarto trimestre.");
        } else {
                System.out.println("Você usa outro tipo de calendário.");
        }
        scanner.close();
    }
    static void trimestreUm(){
        Scanner scanner = new Scanner(System.in);
        int mêsTriUm;
        System.out.println("Digite o número de seu mês entre Janeiro e Março:");
        mêsTriUm = scanner.nextInt();
        scanner.nextLine();
        if (mêsTriUm == 1){
            System.out.println("Você nasceu no mês de Janeiro.");
        } else if (mêsTriUm == 2) {
            System.out.println("Você nasceu no mês de Fevereiro.");
        } else if (mêsTriUm == 3) {
            System.out.println("Você nasceu no mês de Março.");
            
        } else
            System.out.println("Você nasceu em outro trimestre.");

            scanner.close();
    }
    static void trimestreDois(){
        Scanner scanner = new Scanner(System.in);
        int mêsTriDois;
        System.out.println("Digite o número de seu mês entre Abril e Junho:");
        mêsTriDois = scanner.nextInt();
        scanner.nextLine();
        if (mêsTriDois == 4){
            System.out.println("Você nasceu no mês de Abril.");
        } else if (mêsTriDois == 5) {
            System.out.println("Você nasceu no mês de Maio.");
        } else if (mêsTriDois == 6) {
            System.out.println("Você nasceu no mês de Junho.");
            
        } else
            System.out.println("Você nasceu em outro trimestre.");

            scanner.close();
    }
    static void trimestreTrês(){
        Scanner scanner = new Scanner(System.in);
        int mêsTriDois;
        System.out.println("Digite o número de seu mês entre Julho e Setembro:");
        mêsTriDois = scanner.nextInt();
        scanner.nextLine();
        if (mêsTriDois == 7){
            System.out.println("Você nasceu no mês de Julho.");
        } else if (mêsTriDois == 8) {
            System.out.println("Você nasceu no mês de Agosto.");
        } else if (mêsTriDois == 9) {
            System.out.println("Você nasceu no mês de Setembro.");
            
        } else
            System.out.println("Você nasceu em outro trimestre.");

            scanner.close();
    }
    static void trimestreQuatro(){
        Scanner scanner = new Scanner(System.in);
        int mêsTriDois;
        System.out.println("Digite o número de seu mês entre Outubro e Dezembro:");
        mêsTriDois = scanner.nextInt();
        scanner.nextLine();
        if (mêsTriDois == 10){
            System.out.println("Você nasceu no mês de Outubro.");
        } else if (mêsTriDois == 11) {
            System.out.println("Você nasceu no mês de Novembro.");
        } else if (mêsTriDois == 12) {
            System.out.println("Você nasceu no mês de Dezembro.");
            
        } else
            System.out.println("Você nasceu em outro trimestre.");

            scanner.close();
    }
}
