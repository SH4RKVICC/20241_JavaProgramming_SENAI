package Aula02_Operadores;
public class OperadoresLogicoComparativos02 {
    public static void main(String[] args) {
    int valor_01=9;
		int valor_02=6;
		int valor_03=2;
		int valor_04=5;
		boolean total;

        total = valor_01 <= valor_02 || valor_01 == valor_03 || valor_02==valor_04;

        System.out.println("Resposta: "+total);
    
    }

}


