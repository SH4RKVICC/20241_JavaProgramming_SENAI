package Aula03_CalculosMetodos;

import java.util.Scanner;

public class CriandoMetodos02 {
    
    public static void main(String[] args) {
        int a, b;
        Scanner ler = new Scanner(System.in);

        try {
            System.out.println("Digite o valor de A: ");
            a = ler.nextInt();
            
            System.out.println("Digite o valor de B: ");
            b = ler.nextInt();
            
            somar(a, b);
        } finally {
            ler.close(); // Fechar o Scanner no final
        }
    }

    public static void somar(int a, int b) {
        int total;
        
        total = a + b;
        System.out.println("Total: " + total);
    }
}
