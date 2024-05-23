import java.util.Scanner;

public class Algoritmo_32 {

    public static void main(String[] args) {
        int num;
        Scanner ler = new Scanner(System.in);

        try {
            System.out.println("Digite um número: ");
            num = ler.nextInt();
            System.out.println("Número: " + num);
        } finally {
            ler.close();
        }
    }
}