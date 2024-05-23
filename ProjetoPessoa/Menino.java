package ProjetoPessoa;

public class Menino {
    public static void main(String[] args) {
        PessoaFisica Menino = new PessoaFisica();

        Menino.setNC("Pietro");
        Menino.setIdade(17);
        Menino.setGenero("M");
        Menino.setCor("Branco");
        Menino.setEnd("Rua Semana de Arte Moderna, 22");
        Menino.setEmail("ilovej@va.com");
        Menino.setCPF("123.456.789/20");
        Menino.setTel("(11)9988-7766");

        System.out.println("Nome: "+Menino.getNC()+
                            "\nIdade: "+Menino.getIdade()+
                            "\nGênero: "+Menino.getGenero());
    }
    
}
