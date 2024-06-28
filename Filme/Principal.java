import java.util.List;

public class Principal {

    public static void main(String [] args) throws SQLException {
        BD bd = new BD();

        try {
            if (!bd.getConnection()) {
                System.out.println("Erro ao conectar com o banco!");
                return;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        FilmeDAO dao = new FilmeDAO(bd);

        Filme filme1 = new Filme("10", "O Poderoso Chefão", "Drama", "Paramount", java.sql.Date.valueOf("2024-06-25"));
        if (dao.salvar(filme1)) {
            System.out.println("Filme salvo com sucesso!");
        } else {
            System.out.println("Erro ao salvar filme.");
        }

        String codigoParaDeletar = "2";
        if (dao.deletar(codigoParaDeletar)) {
            System.out.println("Filme deletado com sucesso!");
        } else {
            System.out.println("Filme não encontrado ou erro ao deletar.");
        }

        List<Filme> filmes = dao.listar();
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado.");
        } else {
            System.out.println("Filmes cadastrados: ");
            for (Filme filme : filmes) {
                System.out.println(filme);
            }
        }
    }
}