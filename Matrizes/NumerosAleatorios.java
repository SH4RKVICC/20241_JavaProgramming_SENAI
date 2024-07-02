package Matrizes;

import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {
        // Defiinindo o tamanho da matriz;
        int linhas = 5;
        int colunas = 3;

        // Criando a matriz;
        int[][] matriz = new int [linhas][colunas];

        // Gerando e preenchendo a matriz com núm. aleatórios
        Random gerador = new Random();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = gerador.nextInt(100);
            }
        }

        // Mostrando a matriz;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
}
