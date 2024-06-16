package dao.Perguntas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import dao.ConnectDAO;
import model.Alternativa;
import model.Pergunta;

public class PerguntasDAO extends ConnectDAO {

	public static Pergunta obterPerguntaAleatoria(int idRegiao) throws SQLException {		
		PreparedStatement pstmt = connection.prepareStatement(""
				+ "SELECT id, descricao "
				+ "FROM perguntas "
				+ "WHERE id_regiao = ?"
				);
		
        pstmt.setInt(1, idRegiao);
        ResultSet rs = pstmt.executeQuery();
        List<Pergunta> perguntas = new ArrayList<Pergunta>();
        
        while (rs.next()) {
        	Pergunta perguntaDTO = new Pergunta(rs.getInt("id"), rs.getString("descricao"));
        	perguntas.add(perguntaDTO);
        }
        
        if (perguntas.isEmpty()) {
            System.out.println("Nenhuma pergunta encontrada para a região especificada.");
        } 
        
        Random aleatorio = new Random();
        int indiceAleatorio = aleatorio.nextInt(perguntas.size());
        Pergunta perguntaAleatoria = perguntas.get(indiceAleatorio);
        List<Alternativa> alternativas = AlternativasDAO.consultaAlternativasDaPergunta(perguntaAleatoria.getId());
        perguntaAleatoria.setAlternativas(alternativas);
        
        return perguntaAleatoria;
	}
	
	public static boolean verificarResposta(int idPergunta, Object object) throws SQLException {		
		PreparedStatement pstmt = connection.prepareStatement(""
				+ "SELECT id "
				+ "FROM gabaritos "
				+ "WHERE id_pergunta = ? "
				+ "AND id_alternativa = ? "
				);
		
        pstmt.setInt(1, idPergunta);
        pstmt.setInt(2, (int) object);

        ResultSet rs = pstmt.executeQuery();
        boolean existe = rs.next();
        return existe;
	}
}
