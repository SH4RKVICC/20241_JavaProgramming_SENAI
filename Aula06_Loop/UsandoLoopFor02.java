package Aula06_Loop;

import java.util.Scanner;

public class UsandoLoopFor02 {

	public static void main(String[] args) {
		int[]numeros = new int[10];
		
		Scanner ler = new Scanner (System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número: ");
			numeros[i]=ler.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Número: "+numeros[i]+"Posição: "+i);
		} {
			ler.close();
		}

	}

}
