package Vetores;

import java.util.Scanner;

public class MediaVetor {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            // Declarando e inicializando vetor;
            int[] notas = new int[5];

            // Armazenando notas no vetor;
            for (int i = 0; i < notas.length; i++) {
                System.out.print("Digite a nota do Aluno "+(i+1)+": ");
                notas[i] = entrada.nextInt();
            }

            // Cálculo da Média;
            int soma = 0;
            for (int nota : notas) {
                soma += nota;
            }
            double media = (double) soma / notas.length;

            // Impressão da média;
            System.out.println("A média das notas é: "+media);
        }
    }
    
}
