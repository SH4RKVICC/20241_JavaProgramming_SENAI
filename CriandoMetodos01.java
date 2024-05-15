import java.util.Scanner;

public class CriandoMetodos01 {
	
	public static void main(String[] args) {
		calculo();
	}
	public static void calculo() {
		int valor01, valor02, soma, sub;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		valor01 = ler.nextInt();
		
		System.out.println("Digite outro valor: ");
		valor02 = ler.nextInt();
		
		soma = valor01 + valor02;
		sub = valor01 - valor02;
		
		System.out.println("Resultado da Soma: "+soma);
		System.out.println("Resultado da Subtração: "+sub);
	}
}