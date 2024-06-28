public Connection connection;

private final BD bd;

    public FilmeDAO(BD bd) {
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
    stmt.setData(5, filme.getDataCompra());

    int rowsAffected = stmt.executeUpdate();
    stmt.close();
    connection.close();

    return rowsAffected > 0;

    }

    public boolean deletar(String codigo) throws SQLException {
        Connection connection = bd.connection;

        if (connection == null) {
            return false;
        }

        String sql = "DELETE FROM filmes WHERE codigo = ?";
        PreparedStatement stmt = connection.preparedStatement(sql);
        stmt.setString(1, codigo);

        int rowsAffected = stmt.executeUpdate();
        stmt.close();
        connection.close();

        return rowsAffected > 0;
    }

    public List<Filme> listar() throws SQLException {
        List<Filme> filmes = new ArrayList<>();
        Connection connection = bd.connection;

        if (connection == null) {
            return filmes;
        }

        String sql = "SELECT * FROM filmes";
        PreparedStatement stmt = connection.preparedStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Filme filme = new Filme(
                rs.getString("codigo"),
                rs.getString("titulo"),
                rs.getString("genero"),
                rs.getString("produtora"),
                rs.getDate("dataCompra"),
            );
            filmes.add(filmes);
        }

        rs.close();
        stmt.close();
        connection.close();

        return filmes;
    }