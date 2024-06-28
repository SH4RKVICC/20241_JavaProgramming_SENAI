package Vetores;

import java.util.Scanner;

public class UsandoVetores01_1 {

    public static void main(String[] args) {
        int []vetor = new int[5];

        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor da posição ["+i+"]: ");
            vetor[i] = ler.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {

            System.out.println("Posição: "+i+". Valor: "+vetor[i]);
        }
    }
    
}
