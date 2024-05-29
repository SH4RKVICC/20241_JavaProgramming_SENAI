package ProjetoGPS;

import java.util.Scanner;

public class UsaGPS {

    public static void main(String[] args) {
        GPS gps = new GPS();
        Scanner ler = new Scanner(System.in);

        try {
            System.out.println("Defina o Idioma: ");
            String idioma = ler.nextLine();
            gps.definirIdioma(idioma);

            System.out.println("Defina sua Rota: ");
            String rota = ler.nextLine();
            gps.definirRota(rota);
            
            gps.mostrar();
            
        } finally {
            ler.close();
        }
    }
    
}
