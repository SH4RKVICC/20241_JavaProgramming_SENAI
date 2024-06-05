package ProjetoContaBancaria;

public class ContaBancaria {
    private String nome, cod, metodo, op;
     private double saldo;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCod(){
        return cod;
    }

    public void setNumConta(String nome) {
        this.cod = cod;
    }

    public void definirMetodo(String op) {
        switch (op) {
            case "1":
                this.metodo = "Sacar.";
                System.out.println("Metodo saque definido!");
                break;
            case "2":
                this.metodo = "Depositar.";
                System.out.println("Metodo deposito definido!");
                break;
            case "3":
                this.metodo = "Consultar saldo.";
                System.out.println("Metodo consulta definido!");
                break;
        }
    }

    public Double getSaldo(){
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
