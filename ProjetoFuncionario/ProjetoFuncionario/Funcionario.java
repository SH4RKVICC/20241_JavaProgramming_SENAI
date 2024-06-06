package ProjetoFuncionario;

public abstract class Funcionario {

    private String nome, contrato;
    private double sal;

    public Funcionario(String nome, String contrato, Double sal, Doubles salDesc) {
        this.nome = nome;
        this.contrato = contrato;
        this.sal = sal;
    }

    public abstract void tipoContrato();

    public abstract double calcularDesconto();

}
