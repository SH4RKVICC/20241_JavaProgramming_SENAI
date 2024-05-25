package Aula04_IfElseSwitchCase;

import java.util.Scanner;

public class UsandoIfElse02 {

	public static void main(String[] args) {
		double valor, bolsa, cartao;
		Scanner ler = new Scanner(System.in);
		System.out.println("Comprando a bolsa da Larissa");
		System.out.println("a Larissa tem R$: ");
		valor = ler.nextDouble();
		cartao = 7000;
		bolsa = 6000;
				
		if(valor > bolsa) {
			System.out.println("Missão comprida!");
			
		}else if (cartao >= bolsa){
			System.out.println("Comprei!!!! Com cartão e juros, mas comprei!");
			
		}else {
			System.out.println("Compra negada!");
		}  {
			ler.close();
		}

	}

}