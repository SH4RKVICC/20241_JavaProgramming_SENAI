package Matrizes;

public class DeterminanteMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {4, 6},
            {3, 8}
        };

        int determinante = calcularDeterminante(matriz);
        System.out.println("O determinante é: "+determinante);
    }

    public static int calcularDeterminante(int[][]matriz) {
        if (matriz.length != 2 || matriz[0].length != 2) {
            throw new IllegalArgumentException("A matriz deve ser 2x2");
        }
        return matriz[0][0] * matriz[1][1] * matriz[0][1] * matriz[1][0];
    }
    
}
