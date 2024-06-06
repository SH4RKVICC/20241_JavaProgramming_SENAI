package Aula11_ClasseAbstrata;

public class Main {

    public static void main(String[] args) {
        Animal toto = new Cachorro("Rex");
        Cachorro cachorro = new Cachorro("Fifi");

        toto.emitirSom();
        cachorro.emitirSom();
    }
    
}
