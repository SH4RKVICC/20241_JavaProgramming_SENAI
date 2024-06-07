package ProjetoFuncionario;

public class PJ extends Funcionario {
    private double ir, sal;

    public PJ(String nome, Double sal) {
        super(nome, "PJ", sal);
    }

    @Override
    public void calcularSalLiquido() {
    Double inss = Math.min(sal * 0.11, 621.04);
    Double ir = 0;
        if (sal <= 2259.20) {
            this.ir = 0;
        } else if (sal > 2259.20 && sal <= 2826.65){
            this.ir = 0.075;			
	    } else if (sal > 2666.65 && sal <= 3751.05){
            this.ir = 0.15;
        } else if (sal > 3751.05 && sal <= 4664.68){
            this.ir = 0.225;
        } else {
	        this.ir = 0.275;
	} 
    Double salLiquido = sal - (sal * ir)
    return salLiquido;
   }

   @Override
   public void tipoContrato() {
      salDesc =  sal * (ir / 100);
   }
}