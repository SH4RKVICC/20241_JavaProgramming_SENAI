package ProjetoFuncionario;

public abstract class Funcionario {

    private String nome, tipo;
    private double sal;

    public Funcionario(String nome, String tipo, Double sal) {
        this.nome = nome;
        this.sal = sal;
        this.tipo = tipo;
    }

    public abstract double calcularSalLiquido();

}
