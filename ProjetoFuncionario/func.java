abstract class func {
    String nome, contrato;
    double sal;
    boolean tipo;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSal(){
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;

    }

    public void definirContrato(String tipo){
        if (tipo.equalsIgnoreCase("CLT")) {
            this.tipo = true;
            this.contrato = "CLT";
        } else if (tipo.equalsIgnoreCase("PJ")) {
            this.tipo = false;
            this.contrato = "PJ";
        } else {
            System.out.println("Tipo de Contrato Não Identificado!");
        }
    }
}
