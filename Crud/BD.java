package Crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {

    private final java.lang.String DRIVER="com.mysql.jdbc.Driver";
    private final java.lang.String DBNAME="banco";
    private final java.lang.String URL="jdbc.mysq://localhost:3306/"+DBNAME;
    private final java.lang.String LOGIN="root";
    private final java.lang.String SENHA="senai@126";
    public Connection connection;

    public boolean getConnection() throws ClassNotFoundException {
        try {
            connection = DriverManager.getConnection(URL, LOGIN, SENHA);
            System.out.println("Conectou!");
            return true;
        } catch(SQLException e) {
            System.out.println("Falha na conexão com o banco de dados "+e.toString());
            return false;
        }
    }
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Desconectou 'O'");
    }
}
