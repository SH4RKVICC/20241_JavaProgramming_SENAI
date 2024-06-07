package ProjetoFuncionario;
public class CLT extends Funcionario {
    private double inss, sal;

    public CLT(String nome, double sal) {
        super(nome, "CLT", sal);
    }

    @Override
    public double calcularSalLiquido(){
        if (sal <= 1412) {
            this.inss = 0.75;
        } else if (sal > 1412 && sal <= 2666.68){
            this.inss = 0.09;
	    } else if (sal > 2666.68 && sal <= 4000.03){
		    this.inss = 0.12;
	    } else {
		    this.inss = 0.14;
	    }
        return sal - (sal * inss);
    }
}
