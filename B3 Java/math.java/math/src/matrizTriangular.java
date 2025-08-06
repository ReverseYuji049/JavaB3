import java.util.Scanner;

public class matrizTriangular {
    
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[][] matriz = new int[3][3];

    System.out.println("Digite os valores da matriz 3x3:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print("Elemento [" + (i+1) + "][" + (j+1) + "]: ");
            matriz[i][j] = scanner.nextInt();
        }
    }

    int determinante = 
        matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1]) -
        matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0]) +
        matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);

    System.out.println("Determinante da matriz: " + determinante);
    scanner.close();
}