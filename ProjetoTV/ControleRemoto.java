package ProjetoTV;

public class ControleRemoto {
    private int mudarVol, mudarCanal;

    public int getMC(){
        return mudarCanal;
    }

    public void setMC (int mudarCanal) {
        if(mudarCanal < 1) {
			this.mudarCanal = 160;			
		} else if (mudarCanal > 160){
            this.mudarCanal = 1;
        } else {
            this.mudarCanal = mudarCanal;
        }
    }

    public int getMV() {
        return mudarVol;
    }

    public void setMV (int mudarVol) {
        if (mudarVol < 1) {
            this.mudarVol = 0;
        } else if (mudarVol > 99) {
            this.mudarVol = 100;
        } else {
            this.mudarVol = mudarVol;
        }
    }
}
