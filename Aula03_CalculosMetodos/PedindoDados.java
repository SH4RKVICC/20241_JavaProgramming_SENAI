package Aula03_CalculosMetodos;

import java.util.Scanner;

public class PedindoDados {
    
    public double dado01() {
        double valor01;
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite um valor: ");
            valor01 = ler.nextDouble();
        }
        return valor01;
    }
    
    public double dado02() {
        double valor02;
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite outro valor: ");
            valor02 = ler.nextDouble();
        }
        return valor02;
    }

    public void realizarCalculo() {
        double valor01 = dado01();
        double valor02 = dado02();
        Calculo calculadora = new Calculo();
        calculadora.calculo(valor01, valor02);
    }
}
