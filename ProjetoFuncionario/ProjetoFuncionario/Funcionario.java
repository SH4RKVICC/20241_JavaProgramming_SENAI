package ProjetoFuncionario;

public abstract class Funcionario {

    @SuppressWarnings("unused")
    private String nome, tipo;
    @SuppressWarnings("unused")
    private double sal;

    public Funcionario(String nome, String tipo, Double sal) {
        this.nome = nome;
        this.sal = sal;
        this.tipo = tipo;
    }

    public abstract double calcularSalLiquido();

}
