package Aula04_IfElseSwitchCase;

public class UsandoSwitchCase {

	public static void main(String[] args) {
		String op = "Camiseta";
		
		switch (op) {
		case "Camiseta":
			System.out.println("Gaveta 01");		
			break;
		case "Calça":
			System.out.println("Gaveta 02");
			break;
		case "Sapato":
			System.out.println("Gaveta 03");
	
		
	default:
		break;
		}

	}

}
