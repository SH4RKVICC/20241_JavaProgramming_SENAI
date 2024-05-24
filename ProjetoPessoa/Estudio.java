package ProjetoPessoa;

public class Estudio {
    public static void main(String[] args) {
        PessoaJuridica estudio = new PessoaJuridica();

        estudio.setNF("Vitrine Filmes");
        estudio.setEnd("Rua Armando Pinto, 142");
        estudio.setCNPJ("11.620.976/0001-83");
        estudio.setTel("(11)3081-0968");
        estudio.setEmail("silvia.cruz@vitrinefilmes.com.br");

        System.out.println("Nome Fantasia: "+estudio.getNF()+
                            "\nEndereço: "+estudio.getEnd()+
                            "\nCNPJ: "+estudio.getCNPJ()+
                            "\nTelefone: "+estudio.getTel()+
                            "\nEmail: "+estudio.getEmail());
    }
    
}
