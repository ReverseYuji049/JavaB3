public class somaMatrizes {

    public static int[][] main (int[][] A, int[][] B) {
        int linhas = A.length;
        int colunas = A[0].length;
        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = A[i][j] + B[i][j];
            }
        }

        return resultado;
    }

    // Método principal
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] B = {
            {7, 8, 9},
            {10, 11, 12}
        };

        int[][] resultado = main(A, B);

        System.out.println("Soma:");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }   
}