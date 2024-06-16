package dao;

import java.sql.SQLException;
import java.sql.Statement;

public class TabelasDAO extends ConnectDAO {

    public void criarTabelas() {
        try {
            executarSQL("CREATE TABLE IF NOT EXISTS regioes (" +
                        "id INT AUTO_INCREMENT PRIMARY KEY, " +
                        "nome VARCHAR(50) NOT NULL)");

            executarSQL("CREATE TABLE IF NOT EXISTS perguntas (" +
                        "id INT AUTO_INCREMENT PRIMARY KEY, " +
                        "descricao TEXT NOT NULL, " +
                        "id_regiao INT, " +
                        "FOREIGN KEY (id_regiao) REFERENCES regioes(id))");

            executarSQL("CREATE TABLE IF NOT EXISTS alternativas (" +
                        "id INT AUTO_INCREMENT PRIMARY KEY, " +
                        "texto TEXT NOT NULL, " +
                        "id_pergunta INT, " +
                        "FOREIGN KEY (id_pergunta) REFERENCES perguntas(id))");

            executarSQL("CREATE TABLE IF NOT EXISTS gabaritos (" +
                        "id INT AUTO_INCREMENT PRIMARY KEY, " +
                        "id_pergunta INT, " +
                        "id_alternativa INT, " +
                        "FOREIGN KEY (id_pergunta) REFERENCES perguntas(id), " +
                        "FOREIGN KEY (id_alternativa) REFERENCES alternativas(id))");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void executarSQL(String sql) throws SQLException {
        Statement stmt = null;
        try {
            stmt = connection.createStatement();
            stmt.execute(sql);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }
}
