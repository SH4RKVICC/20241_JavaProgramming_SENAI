package Aula_06;

import java.util.Scanner;

public class UsandoLoop_07 {

    public static void main(String[] args) {
        int cont = 0, n, s = 0;
        Scanner ler = new Scanner(System.in);
        
        do {
            System.out.println("Digite um número: ");
            n = ler.nextInt();
            if (n % 2 == 0) {
                s = s + n;
            }
            cont++;
            
        } while (cont <10);
        System.out.println("Total de números pares: "+s);
       }
}
