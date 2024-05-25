package ProjetoTV;

public class TV {
    private int volume, canal, mudarVol, mudarCanal;
    private ControleRemoto controleRemoto;

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal(){
        return canal;
    }

    public void setCanal(int canal){
        this.canal = canal;
    }

    public int getMC(){
        return mudarCanal;
    }

    public void setMC(int mudarCanal){
        this.mudarCanal = mudarCanal;
    }

    public int getMV(){
        return mudarVol;
    }

    public void setMV(int mudarVol){
        this.mudarVol = mudarVol;
    }

    public ControleRemoto getControleRemoto() {
        return controleRemoto;
    }

    public void setControleRemoto(ControleRemoto controleRemoto) {
        this.controleRemoto = controleRemoto;
    }

}
