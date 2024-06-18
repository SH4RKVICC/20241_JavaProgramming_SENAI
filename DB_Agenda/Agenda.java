package DB_Agenda;

import java.sql.PreparedStatement;

public class Agenda {

    private String nome;
    private String telefone;
    private String email;

    public Agenda(String nome, String telefone, String email, String sql, PreparedStatement stmt) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.sql = sql;
        this.stmt = stmt;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSql() {
        return sql;
    }
    public void setSql(String sql) {
        this.sql = sql;
    }
    public PreparedStatement getStmt() {
        return stmt;
    }
    public void setStmt(PreparedStatement stmt) {
        this.stmt = stmt;
    }
    public Agenda() {
    }
    
    String sql = "INSERT INTO agenda (nome, telefone, email) VALUES (?, ?, ?)";
    PreparedStatement stmt = connection.preparedStatement(sql);
    PreparedStatement stmt = connection.preparedStatement(sql);
    stmt.setString(agenda.getNome());
    stmt.setString(agenda.getTelefone());
    stmt.setString(agenda.getEmail());
    
}
