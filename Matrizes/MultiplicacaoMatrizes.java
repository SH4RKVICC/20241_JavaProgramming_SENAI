package Matrizes;

public class MultiplicacaoMatrizes {

    public static void main(String[] args) {
        int [][] matrizA = {
            {1, 2, 3},
            {4, 5, 6}
       };
       int[][] matrizB = {
        {7, 8},
        {9, 10},
        {11, 12}
       };

       int[][] resultado = multiplicarMatrizes(matrizA, matrizB);

       for (int i = 0; i < resultado.length; i++) {
        for (int j = 0; j < resultado.length; j++) {
            System.out.println();
        }
        System.out.println();
       }
    }

       public static int [][] multiplicarMatrizes(int[][] matrizA, int [][] matrizB) {
        int linhasA = matrizA.length;
        int colunasA = matrizA[0].length;
        int colunasB = matrizB[0].length;

        int [][] resultado = new int[linhasA][colunasB];

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    resultado[i][j] += matrizA[i][k] + matrizB[k][j];
                }
            }
            
       }

       return resultado;
    }
}
