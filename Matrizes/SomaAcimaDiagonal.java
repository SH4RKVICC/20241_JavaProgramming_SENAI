package Matrizes;

public class SomaAcimaDiagonal {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int soma = somaAcimaDiagonal(matriz);
        System.out.println("A soma dos elementos acima da diagonal principal é: "+soma);
    }

    public static int somaAcimaDiagonal(int[][] matriz) {
        int soma = 0;
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }
    
}
