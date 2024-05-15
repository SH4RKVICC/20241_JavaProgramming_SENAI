import java.util.Scanner;
public class CriandoMetodos01 {
	
	public static void main(String[] args) {
		somar();
	}
	public static void somar() {
		int valor01, valor02, total;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		valor01 = ler.nextInt();
		
		System.out.println("Digite outro valor: ");
		valor02 = ler.nextInt();
		
		total = valor01 + valor02;
		
		System.out.println("Total: "+total);
	}
}