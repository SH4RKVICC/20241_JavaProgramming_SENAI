import java.util.Scanner;

public class FilmeControllerApp {

    public static void main(String[] args) {
        BD bd = new BD();
        try {
            if (!bd.getConnection()) {
                System.out.println("Erro ao conectar ao banco!");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        FilmeDAO filmeDAO = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu de Filmes:");
            System.out.println("1. Salvar Filme;");
            System.out.println("2. Deletar Filme;");
            System.out.println("3. Listar Filmes;");
            System.out.println("4. Sair.");

            System.out.print("Digite sua opção: ")
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o código do filme: ");
                    String codigo = scanner.nextLine();

                    System.out.println("Digite o titulo do filme: ");
                    String titulo = scanner.nextLine();

                    System.out.println("Digite o genero do filme: ");
                    String genero = scanner.nextLine();

                    System.out.println("Digite a produtora do filme: ");
                    Strinf produtora = scanner.nextLine();

                    Filme filme = new filme(codigo, titulo, genero, produtora, null);

                    FilmeController.salvarFilme(filme);
                    break;

                case 2:
                    System.out.println("Digite o código do filme a ser deletado: ");
            }
        }
    }
}