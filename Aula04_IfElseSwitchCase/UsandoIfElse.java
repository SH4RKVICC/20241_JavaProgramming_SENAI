package Aula04_IfElseSwitchCase;

import java.util.Scanner;

public class UsandoIfElse {

	public static void main(String[] args) {
		int idade, alt;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Teste para modelo!");
		System.out.println("Perguntando a Idade: ");
		idade = ler.nextInt();
		System.out.println("Perguntando a Altura em cm: ");
		alt = ler.nextInt();
		
		if (idade >= 15 && idade <=20 && alt >= 170) {
			System.out.println("Aprovada!");
			
		}else if (idade < 15 && idade > 20 && alt >= 170){
			System.out.println("Reprovada por idade!");
			
		}else if (idade >= 15 && idade <= 20 && alt <= 170){
			System.out.println("Reprovada por altura!");
			
		}else {
			System.out.println("Reprovada!");
		}  {
			ler.close();
		}

	}

}
