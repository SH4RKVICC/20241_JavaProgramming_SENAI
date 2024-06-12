package ProjetoImplementandoInterface;

public class Triangulo extends formaGeometrica{
    private double b, h, l1, l2, l3;

    public Triangulo(double b, double h, double l1, double l2, double l3) {
        this.b = b;
        this.h = h;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public double calcularArea() {
        return (b * h) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return l1 + l2 + l3;
    }
    
}
