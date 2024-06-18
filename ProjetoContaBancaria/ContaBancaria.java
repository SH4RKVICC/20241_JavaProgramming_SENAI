package ProjetoContaBancaria;

public class ContaBancaria {
    @SuppressWarnings("unused")
    private String nomeTitular, cod, metodo, op;
    @SuppressWarnings("unused")
    private double saldo;

    public ContaBancaria(String nomeTitular, String cod, double saldo) {
        this.nomeTitular = nomeTitular;
        this.cod = cod;
        this.saldo = saldo;
    }

    public void definirMetodo(String op) {
        switch (op) {
            case "1":
                this.metodo = "Sacar.";
                System.out.println("Método saque definido!");
                break;
            case "2":
                this.metodo = "Depositar.";
                System.out.println("Método deposito definido!");
                break;
            case "3":
                this.metodo = "Consultar saldo.";
                System.out.println("Método consulta definido!");
                break;
        }
    }
    
}