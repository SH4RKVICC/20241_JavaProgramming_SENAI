package ProjetoPessoa;

public class PessoaFisica extends Pessoa{
   private String CPF, NomeCompleto, genero, cor;
   private int idade;

   public String getCPF(){
        return CPF;
   }

   public void setCPF(String CPF){
        this.CPF = CPF;
   }

   public String getNC(){
        return NomeCompleto;
   }

   public void setNC(String NomeCompleto){
        this.NomeCompleto = NomeCompleto;
   }

   public String getGenero(){
        return genero;
   }

   public void setGenero(String genero){
        this.genero = genero;
   }

   public String getCor(){
        return cor;
   }

   public void setCor(String cor) {
        this.cor = cor;
   }

   public int getIdade() {
        return idade;
   }

   public void setIdade(int idade){
        this.idade = idade;
   }
}
