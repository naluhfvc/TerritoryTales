package dao;

import java.sql.Connection;

public abstract class DAO {

	protected static Connection connection = null;
	
	protected String dbName   = "TerritoryTales";
	protected String url      = "jdbc:mysql://localhost:3306/";
	protected String user 	  = "root";
	protected String passwd   = "";
    
    public void setConnection(Connection connection) {
        DAO.connection = connection;
    }
	
	public abstract Connection criaConexaoBanco();
}
