package ProjetoPessoa;

public class Estudio {
    public static void main(String[] args) {
        PessoaJuridica estudio = new PessoaJuridica();

        estudio.NomeFantasia = "Vitrine Filmes";
        estudio.endereco = "Rua Armando Pinto, 142";
        estudio.CNPJ = "11.620.976/0001-83";
        estudio.tel = "(11)3081-0968";
        estudio.email = "silvia.cruz@vitrinefilmes.com.br";

        System.out.println("Nome Fantasia: "+estudio.NomeFantasia+
                            "\nEndereço: "+estudio.endereco+
                            "\nCNPJ: "+estudio.CNPJ+
                            "\nTelefone: "+estudio.tel+
                            "\nEmail: "+estudio.email);
    }
    
}
