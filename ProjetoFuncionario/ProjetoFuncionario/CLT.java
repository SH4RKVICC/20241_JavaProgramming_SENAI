package ProjetoFuncionario;
public class CLT extends Funcionario {
    private double inss, sal;

    public CLT(String nome, String contrato, double sal, double salDesc) {
        super(nome, contrato, sal);
    }

    public void tipoContrato() {
        System.out.print(getContrato()+"CLT");
    }

    public Double calcularDesconto(){
        if (sal <= 1412) {
            this.inss = 0.75;
        } else if (sal > 1412 && sal <= 2666.68){
            this.inss = 0.09;
	    } else if (sal > 2666.68 && sal <= 4000.03){
		    this.inss = 0.12;
	    } else {
		    this.inss = 0.14;
	    }
        return sal * (inss / 100); 
    }
    }
}
