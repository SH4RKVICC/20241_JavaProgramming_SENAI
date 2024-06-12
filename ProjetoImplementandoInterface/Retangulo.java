package ProjetoImplementandoInterface;

public class Retangulo extends formaGeometrica{
    private double b, h;

    @Override
    public double calcularArea() {
        return b * h;
    }

    public double calcularPerimetro() {
        return 2*(b + h);
    }
    
}
