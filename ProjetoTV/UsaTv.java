package ProjetoTV;

public class UsaTv {
    public static void main(String[] args) {
        TV tv = new TV();
        ControleRemoto cr = new ControleRemoto();

        cr.setMC(1);
        cr.setMV(50);

        System.out.println("Canal Atual: "+cr.getCanal());
        System.out.println("Volume Atual: "+cr.getVolume());

        // Associando o controle remoto a TV;
        tv.setControleRemoro(cr);
        
        // Alterando os valores usando o controle;
        tv.getControleRemoto().setMV(10);
        tv.getControleRemoto().setMV(70);

        // Exibindo valores atuais
        System.out.println("Canal Atual: "+tv.getControleRemoto().getMC());
        System.out.println("Volume Atual: "+tv.getControleRemoto().getMV());
    }
    
}
