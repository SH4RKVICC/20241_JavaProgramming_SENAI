package Aula_03;
import java.util.Scanner;

public class CriandoMetodos01 {
	
	public static void main(String[] args) {
		calculadora();
	}
	public static void calculadora() {
		int valor01, valor02, soma, sub, div, mult;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		valor01 = ler.nextInt();
		
		System.out.println("Digite outro valor: ");
		valor02 = ler.nextInt();
		
		soma = valor01 + valor02;
		sub = valor01 - valor02;
		div = valor01 / valor02;
		mult = valor01 * valor02;
		
		System.out.println("Resultado da Soma: "+soma);
		System.out.println("Resultado da Subtração: "+sub);
		System.out.println("Resultado da Divisão: "+div);
		System.out.println("Resultado da Multiplicação: "+mult);
	}
}