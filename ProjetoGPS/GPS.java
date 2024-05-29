package ProjetoGPS;

public class GPS {
    String idioma, rota, op;
    boolean status;

    public GPS(){
        this.status = false;
        this.idioma = "";
        this.rota = "";
    }

    public void desligar() {
        this.status = false;
    }

    public void ligar() {
        this.status = true;
        this.idioma = "Português";
        this.rota = "Sem rota definida!";
    }

    public void definirIdioma(String op) {
        switch (op) {
            case "Portugues":
                this.idioma = "Português";
                System.out.println("Idioma Português definido!");
                break;
            case "Ingles":
                this.idioma = "Inglês";
                System.out.println("Idioma Inglês definido!");
                break;
            case "Espanhol":
                this.idioma = "Espanhol";
                System.out.println("Idioma Espanhol definido!");
                break;
            case "Mandarim":
                this.idioma = "Mandarim";
                System.out.println("Idioma Mandarim definido!");
                break;
            case "Alemao":
                this.idioma = "Alemão";
                System.out.println("Idioma Alemão definido!");
                break;
             default:
                System.out.println("Desculpe, idioma não suportado :(");
                break;
        }
    }

    public void definirRota(String rota) {
        this.rota = rota;
        System.out.println("Rota: "+rota);
    }

    public void mostrar() {
        System.out.println("Idioma: "+idioma);
        System.out.println("Rota: "+rota);
    }
}
