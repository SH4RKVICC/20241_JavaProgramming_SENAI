package Aula02_Operadores;
public class OperadoresLogicoComparativos01 {

	public static void main(String[] args) {
        //declarando variaveis
		int valor_01=9;
		int valor_02=6;
		int valor_03=2;
		int valor_04=5;
		boolean total;
		
        //realizando operação
		total = valor_01 <= valor_04 && valor_01 > valor_03 + valor_02;

		//emitindo resultado
		System.out.println("Resposta: "+total);

	}

}
