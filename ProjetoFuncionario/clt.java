public class clt extends func {
    public double inss;

    public void definirInss(Double inss){
        if (sal <= 1412) {
            this.inss = 7.5;
        } else if (sal > 1412 && sal <= 2666.68){
            this.inss = 9;
	    } else if (sal > 2666.68 && sal <= 4000.03){
		    this.inss = 12;
	    } else {
		    this.inss = 14;
	    } 
    }
}
