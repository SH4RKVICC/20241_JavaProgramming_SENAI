public class pj extends func {
    public double ir;

    public void definirIr(Double ir){
        if (sal <= 2259.20) {
            this.ir = 0;
        } else if (sal > 2259.20 && sal <= 2826.65){
            this.ir = 7.5;			
	} else if (sal > 2666.65 && sal <= 3751.05){
        this.ir = 15;
        } else if (sal > 3751.05 && sal <= 4664.68){
            this.ir = 22.5;
    } else {
	this.ir = 27.5;
	} 
   }
}