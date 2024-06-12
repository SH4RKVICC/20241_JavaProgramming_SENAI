package ProjetoImplementandoInterface;

public class Triangulo extends formaGeometrica{
    private double b, h, l1, l2, l3;

    @Override
    public double calcularArea() {
        return (b * h) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return l1 + l2 + l3;
    }
    
}
