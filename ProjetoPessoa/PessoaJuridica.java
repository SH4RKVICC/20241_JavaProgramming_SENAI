package ProjetoPessoa;

public class PessoaJuridica extends Pessoa{    
    private String CNPJ, NomeFantasia;
    
    public String getCNPJ(){
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNF(){
        return NomeFantasia;
    }

    public void setNF(String NomeFantasia){
        this.NomeFantasia = NomeFantasia;
    }
}
