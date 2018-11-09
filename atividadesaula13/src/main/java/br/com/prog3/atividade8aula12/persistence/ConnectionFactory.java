package br.com.prog3.atividade8aula12.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection() {
		String driver = "org.postgresql.Driver";
		String user = "postgres";// Usuário criado para acesso ao banco
		String senha = "postgres";// Senha para acesso ao banco
		String url = "jdbc:postgresql://127.0.0.1:50855/aula12"; // Servidor onde está instalado o banco
		Connection con = null;
		try {
			Class.forName(driver);
			con = (Connection) DriverManager.getConnection(url, user, senha);
			//System.out.println("Conexão realizada com sucesso.");
		} catch (ClassNotFoundException ex) {
			System.err.print(ex.getMessage());
		} catch (SQLException e) {
			System.err.print(e.getMessage());
		}
		return con;
	}

	public static void close(Connection con) {
		try {
			con.close();
		} catch (Exception e) {
		}
	}
}