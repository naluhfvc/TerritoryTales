package controller;

import java.sql.SQLException;

import dao.Perguntas.PerguntasDAO;
import model.Pergunta;

public class PerguntaController {
	
	public Pergunta obterPerguntaAleatoria(int id) throws SQLException {
		return PerguntasDAO.obterPerguntaAleatoria(id);
	}
}
