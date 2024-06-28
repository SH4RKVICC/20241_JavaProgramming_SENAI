import java.sql.SQLException;
import java.util.List;

public class FilmeController {

    private final FilmeDAO filmeDAO;

    public FilmeController(FilmeDAO filmeDAO) {
        this.filmeDAO = filmeDAO;
    }

    public void salvarFilme(Filme filme) {
        try {
            if (filmeDAO.salvar.(filme)) {
                System.out.println("Filme salvo com sucesso!");
            } else {
                System.out.println("Erro ao salvar filme!");
            }
        } catch (SQLException e) {
            System.out.println("Erro na base de dados: "+ e.getMessage());
        }
    }

    public void deletarFilme(String codigo) {
        try {
            if (filmeDAO.deletar(codigo)) {
                System.out.println("Filme deletado com sucesso!");
            } else {
                System.out.println("Erro ao deletar filme!");
            }
        } catch (SQLException e) {
            System.out.println("Erro na base de dados: "+ e.getMessage());
        }
    }

        public void listarFilmes() {
        try {
            List<Filme> filmes = filmeDAO.listar();
            if (filmes.isEmpty()) {
                System.out.println("Nenhum filme cadastrado.");
            } else {
                System.out.println("Listagem de Filmes: ");
                for (Filme filme : filmes) {
                    System.out.println(filme);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro na base de dados: "+ e.getMessage());
        }
    }
}