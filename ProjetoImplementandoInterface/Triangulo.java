package ProjetoImplementandoInterface;

public class Triangulo implements formaGeometrica{
    private double b, h, l1, l2, l3;

    public Triangulo(double b, double h, double l1, double l2, double l3) {
        this.b = b;
        this.h = h;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public double calcularPerimetro() {
        return l1 + l2 + l3;
    }

    @Override
    public double calcularArea(double a) {
        double total=0;
        total = (b * h) / 2;
        return total;
    }

    @Override
    public double calcularArea(double a, double b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularArea'");
    }

    @Override
    public double calcularPerimetro(double a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPerimetro'");
    }

    @Override
    public double calcularPerimetro(double a, double b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPerimetro'");
    }
    
}
