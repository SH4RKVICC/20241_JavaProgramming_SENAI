package Aula04;

import java.util.Scanner;

public class Algoritmo_90 {
	//Ler um número e dizer se é maior que 20
	//e se for, mostre!
	public static void main(String[] args) {
		double n;
		Scanner ler = new Scanner(System.in);
		System.out.println("O Número é maior do que 20?");
		System.out.println("Insira o número desejado: ");
		n = ler.nextDouble();
		
		if (n > 20){
			System.out.println(n + " é maior que 20!");
		}else if (n == 20){
			System.out.println("O número é igual a 20.");
		}else{
			System.out.println("O número é menor que 20 :(");
		}
		
	}

}
