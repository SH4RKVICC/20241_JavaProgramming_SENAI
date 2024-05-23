import java.util.Scanner;

public class Algoritmo91 {
    // Ler dois valores numéricos inteiros e efetuar a adição
    // Caso o resultado seja maior que 10, apresentá-lo!
    public static void main(String[] args) {
        int n1, n2, t;
        Scanner ler = new Scanner(System.in);

        try {
            System.out.println("Insira o primeiro valor: ");
            n1 = ler.nextInt();
            System.out.println("Insira o segundo valor: ");
            n2 = ler.nextInt();
            t = n1 + n2;

            if (t > 10) {
                System.out.println("Resultado: " + t);
            } else {
                System.out.println("O resultado é menor que 10!");
            }
        } finally {
            ler.close(); // Fechar o Scanner no final
        }
    }
}
