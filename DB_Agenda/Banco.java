package DB_Agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Banco {
    public Connection conn = null;
	private final String DRIVER="com.mysql.jdbc.Driver";
	private final String DBNAME = "banco";
	private final String URL="jdbc:mysql://localhost:3306/"+DBNAME;
	private final String LOGIN = "root";
	private final String SENHA = "senai@126";

    public boolean getConnection() {
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, LOGIN, SENHA);
			System.out.println("Conectou!");
			return true;
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver de conxão não encontrado "+e.toString());
			return false;
			
		}catch(SQLException e){
			System.out.println("Falha na conexão com o banco de dados "+e.toString());
			return false;
		}
	}
	public void close() throws SQLException {
		try{
			conn.close();
		} catch (SQLException e) {
		conn.close();
		System.out.println("Desconectou!");
        }
    }  
}
