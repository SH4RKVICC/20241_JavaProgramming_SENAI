package Filme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conecta {//throws
	
	public void main(String[] args) {
		final String DRIVER = "com.mysql.jdbc.Driver";
		final String URL = "jdbc:mysql://localhost:3306:mysql";
		
		try {
			Class.forName(DRIVER);
			Connection connection = DriverManager.getConnection(URL, "root", "senai@126");
			JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso!");
			connection.close();
			
		}catch(ClassNotFoundException erro) {
			JOptionPane.showMessageDialog(null, "Driver de conexão não encontrado" +erro.toString());
		}catch(SQLException erro) {
			JOptionPane.showMessageDialog(null, "Problema com a conexão com a base de dados." +erro.toString());
		}
	}

}
