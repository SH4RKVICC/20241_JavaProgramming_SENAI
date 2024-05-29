package ProjetoBomba;

import java.util.Scanner;

public class UsaBomba {
    
    public static void main(String[] args) {
        Bomba bomba = new Bomba();

        Scanner ler = new Scanner(System.in);

        try {
            System.out.println("Digite o tempo de uso da bomba (em segundos): ");
            int tempo = ler.nextInt();

            bomba.ligar(tempo);
            System.out.println(bomba.status ? "Bomba está ligada" : "Bomba está desligada");

            bomba.desligar();
            System.out.println(bomba.status ? "Bomba está ligada" : "Bomba está desligada");
        } finally {
            ler.close();
        }
    }
}
