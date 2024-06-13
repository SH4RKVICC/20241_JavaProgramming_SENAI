package Filme;

public class TestaBD {

	public static void main(String[] args) {
		BD testa = new BD();
		
		testa.getConnection();
		testa.close();

	}

}
