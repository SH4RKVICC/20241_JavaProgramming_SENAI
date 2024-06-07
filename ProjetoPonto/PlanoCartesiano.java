package ProjetoPonto;

public class PlanoCartesiano {

    public static void main(String[] args) {
        
        Ponto ponto1 = new Ponto(2.0, 3.0);
        Ponto ponto2 = new Ponto(4.0, 7.0);

        System.out.println("Ponto 1: "+ponto1);
        System.out.println("Ponto 2: "+ponto2);

        ponto1.mover(1.0, 2.0);
        System.out.println("Ponto 1 após mover: "+ponto1);

        ponto2.mover(5.0, 3.0);
        System.out.println("Ponto 2 após mover: "+ponto2);

        double distancia = ponto1.calcularDistancia(ponto2);
        System.out.println("Distancia entre os Pontos: "+distancia);

        boolean saoIguais = ponto1.isIgual(ponto2);
        System.out.println("Os Pontos são Iguais: "+saoIguais);
    }
    
}
