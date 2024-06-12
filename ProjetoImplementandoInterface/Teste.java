package ProjetoImplementandoInterface;

public class Teste {
    
    public static void main(String[] args) {
        formaGeometrica t = new Triangulo(5, 8, 3, 4, 5);
        formaGeometrica c = new Circulo(4.3);
        formaGeometrica r = new Retangulo(4, 12);

        System.out.println("Área do Triangulo: "+ t.calcularArea());
        System.out.println("Perimetro do Triângulo: "+ t.calcularPerimetro());
        System.out.println("Área do Circulo: "+ c.calcularArea());
        System.out.println("Perimetro do Circulo: "+ c.calcularPerimetro());
        System.out.println("Área do Retângulo: "+ r.calcularArea());
        System.out.println("Perimetro do Retângulo: "+ r.calcularPerimetro());
    }
}
