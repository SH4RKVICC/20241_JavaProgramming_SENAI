package Crud;

import java.sql.SQLException;

    public Connection  connection;

    private final BD bd;

      public FilmeDAO (BD bd) {
        this.bd = bd;
    }

    public boolean salvar(Filme filme) throws SQLException {
        Connection connection = bd.connection;

    if (connection == null) {
        return false;
    }

    String sql = "INSERT INTO filmes (codigo, titulo, genero, produtora, dataCompra) VALUES (?, ?, ?, ?, ?)";
    PreparedStatement stmt = connection.preparedStatement(sql);
    stmt.setString(1, filme.getCodigo());
    stmt.setString(2, filme.getTitulo());
    stmt.setString(3, filme.getGenero());
    stmt.setString(4, filme.getProdutora());
    stmt.setDate(5, filme.getDataCompra());

    int rowsAffected = stmt.executeUpdate();
    stmt.close();
    connection.close();

    return rowsAffected > 0;
    }

    public void alterar() {

    }

    public void deletar() {

    }