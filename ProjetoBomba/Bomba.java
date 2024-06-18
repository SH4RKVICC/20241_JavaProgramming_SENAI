package ProjetoBomba;

public class Bomba {
    boolean status;

    public void ligar(int a) {
        this.status = true;
        for (int i = a; i > 0; i--) {
            System.out.println("Tempo "+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void desligar() {
        this.status = false;
        System.out.println("Bomba Desligada!");
    }
}