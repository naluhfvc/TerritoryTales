package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDAO extends DAO {
    
    @Override
    public Connection criaConexaoBanco() {
        Connection connection = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, passwd);
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("USE " + dbName);
            stmt.close();
        } catch (ClassNotFoundException cnfex) {
            System.err.println("Failed to load JDBC driver: " + cnfex.getMessage());
            System.exit(1);
        } catch (SQLException sqlex) {
            System.err.println("Unable to connect: " + sqlex.getMessage());
            System.exit(1);
        }
        return connection;
    }
}