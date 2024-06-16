package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InitDB extends DAO {

    @Override
    public Connection criaConexaoBanco() {
        Connection connection = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, user, passwd);

            Statement stmt = connection.createStatement();
            
            stmt.executeUpdate("DROP DATABASE IF EXISTS " + dbName);
            stmt.executeUpdate("CREATE DATABASE " + dbName);

            stmt.close();
            connection.close();
            
            connection = DriverManager.getConnection(url + dbName, user, passwd);

        } catch (ClassNotFoundException cnfex) {
            System.err.println("Driver JDBC/ODBC não encontrado: " + cnfex.getMessage());
            System.exit(1);
            
        } catch (SQLException sqlex) {
            System.err.println("Conexão indisponível: " + sqlex.getMessage());
            System.exit(1);
        }
        
        return connection;
    }

    public void inicializarBanco() {
        Connection connection = criaConexaoBanco();
        TabelasDAO tabelasDAO = new TabelasDAO();
        tabelasDAO.setConnection(connection);
        tabelasDAO.criarTabelas();
        
        SeedData seedData = new SeedData();
        seedData.setConnection(connection);
        seedData.inserirDados();
    }
}
