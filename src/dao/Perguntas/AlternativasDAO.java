package dao.Perguntas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ConnectDAO;
import model.Alternativa;

public class AlternativasDAO extends ConnectDAO {

    public static List<Alternativa> consultaAlternativasDaPergunta(int idPergunta) throws SQLException {
        String query = "SELECT id, texto FROM alternativas WHERE id_pergunta = ?";
        List<Alternativa> alternativas = new ArrayList<>();
        
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, idPergunta);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Alternativa alternativa = new Alternativa(rs.getInt("id"), rs.getString("texto"));
                alternativas.add(alternativa);
            }
        }
        
        return alternativas;
    }
}
