package ProjetoPonto;

public abstract class Ponto {
    
    // Criando Atributos;
    private double x, y;

    // Construtor para inicializar pontos;
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Método para Mover o Ponto em uma Qtde. dx na direção x e dx na direção y;
    public void mover(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    // Método para calcular distancia entre este ponto e o outro;
    public void calcularDistancia(Ponto outroPonto){
        double dx = this.x - outroPonto.x;
        double dy = this.y - outroPonto.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Método para verificar se este ponto é igual a outro ponto
    public boolean isIgual(Ponto outrPonto) {
        return (this.x == outroPonto.x && this.y == outroPonto.y);
    }

    //Getters para Obter Coordernadas;
    public double getx() {
        return x;
    }

    public double gety() {
        return y;
    }

    // Setters para Definir as Coordenadas;
    public double setx(double x) {
        return x;
    }

    public double sety(double y) {
        return y;
    }
}
