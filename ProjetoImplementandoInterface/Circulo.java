package ProjetoImplementandoInterface;

public class Circulo extends formaGeometrica{
    private double r;

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(r, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * r;
    }
    
}
