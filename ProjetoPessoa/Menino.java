package ProjetoPessoa;

public class Menino {
    public static void main(String[] args) {
        PessoaFisica Menino = new PessoaFisica();

        Menino.NomeCompleto = "Pietro";
        Menino.idade = 17;
        Menino.genero = "M";
        Menino.cor = "Branco";
        Menino.endereco = "Rua Semana de Arte Moderna, 22";
        Menino.email = "ilovej@va.com";
        Menino.CPF = "123.456.789/20";
        Menino.tel = "(11)9988-7766";

        System.out.println("Nome: "+Menino.NomeCompleto+
                            "\nIdade: "+Menino.idade+
                            "\nGênero: "+Menino.genero);
    }
    
}
