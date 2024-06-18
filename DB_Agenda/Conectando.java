package DB_Agenda;

public Conectando connec;

    private final Banco banco;

        public AgendaOi (Banco banco) {
            this.banco = banco;
        }

        public boolena salvo(Contato contato)  throws SQLException {
            Connectando connec = banco.connec;

        if (connec == null) {
            return false;
        }

        String sql = "INSERT INTO agenda (nome, telefone, email) VALUES (?, ?, ?)";
        PreparedStatement stmt = connection.preparedStatement(sql);
        stmt.setString(agenda.getNome());
        stmt.setString(agenda.getTelefone());
        stmt.setString(agenda.getEmail());

        int rowsAffected = stmt.executeUpdate();
        stmt.close();
        connec.close();

        return rowsAffected > 0;
    }

    public void alterar() {

    }

    public void deletar() {

    }
