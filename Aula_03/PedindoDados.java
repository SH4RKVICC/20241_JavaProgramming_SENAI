package Aula_03;
import java.util.Scanner;

public class PedindoDados {
	
	public double dado01() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		double valor01 = ler.nextDouble();
		return valor01;
		
	}
	public double dado02() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite outro valor: ");
		double valor02 = ler.nextDouble();
		return valor02;
		
		calculadora.calculo(valor01, valor02);
	}
}