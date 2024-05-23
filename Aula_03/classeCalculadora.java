package Aula_03;
import java.util.Scanner;

public class classeCalculadora {

    public static void main(String[] args) {
        double valor01, valor02;
        Scanner ler = new Scanner(System.in);
        Calculo calculadora = new Calculo();
        
        try {
            System.out.println("Digite um valor: ");
            valor01 = ler.nextInt();
            System.out.println("Digite o segundo valor: ");
            valor02 = ler.nextInt();
            
            calculadora.calculo(valor01, valor02);
        } finally {
            ler.close();
        }
    }
}
