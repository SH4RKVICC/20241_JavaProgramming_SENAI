import java.util.Scanner;

public class Algoritmo91 {
	//ler dois valores núm. int e efetuar a adição
	//caso o resultado seja maior que 10, apresenta-lo!
	public static void main(String[] args) {
		int n1, n2, t;
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o primeiro valor: ");
		n1 = ler.nextInt();
		System.out.println("Insira o segundo valor: ");
		n2 = ler.nextInt();
		t = n1 + n2;
				
		if (t > 10) {
			System.out.println("Resultado: "+t);
		}else {
			System.out.println("O resultado é menor que 10!");
		}

	}

}
