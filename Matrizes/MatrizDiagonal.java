package Matrizes;

public class MatrizDiagonal {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 0, 0},
            {0, 2, 0},
            {0, 0, 3}
        };

        boolean isDiagonal = verificarMatrizDiagonal(matriz);
        System.out.println("A matriz é diagonal? "+isDiagonal);
    }

    public static boolean verificarMatrizDiagonal(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
    
}
