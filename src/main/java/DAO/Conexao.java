package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
    public static void conectar() {
    	
        Connection conn = null;
        try {
            String url = "jdbc:mysql://server12mysql.database.azure.com:3306/crud?useSSL=true&requireSSL=false";
            String user = "Kaue";
            String password = "Bontlindo12/";
         
            conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("Conexão estabelecida com sucesso!");
            }

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao conectar ao banco de dados: " + ex.getMessage());
        	}
    	}
    }

	
	
	
	
	