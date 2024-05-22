package Aula06;

public class UsandoLoop_06 {

	public static void main(String[] args) {
		int cont=0;
		
		do {
			System.out.println("Volta: "+cont);
			cont++;
		} while (cont<5);
		
		while (cont<5) {
			System.out.println("Volta: "+cont);
			cont++;
		}
	}

}