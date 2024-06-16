package services;

import java.sql.SQLException;
import java.util.HashMap;

import dao.Perguntas.PerguntasDAO;
import dto.JogadorDTO;
import model.EPersonagem;
import model.Time;
import view.AtualizarScoreListener;

public class PontuacaoService {
    private AtualizarScoreListener scoreListener;
    private HashMap<Time, Integer> pontuacaoTimes = new HashMap<>();
    private HashMap<EPersonagem, Integer> pontuacaoJogadores = new HashMap<>();

    public PontuacaoService(AtualizarScoreListener listener) {
        pontuacaoTimes.put(Time.LUZ, 0);
        pontuacaoTimes.put(Time.SOMBRA, 0);
        this.scoreListener = listener;
    }

    public void incrementarPontuacaoTime(Time time) {
        int novaPontuacao = pontuacaoTimes.getOrDefault(time, 0) + 1;
        pontuacaoTimes.put(time, novaPontuacao);
        if (scoreListener != null) {
            scoreListener.atualizarScoreTime(time, novaPontuacao);
        }
    }

    public void incrementarPontuacaoJogador(JogadorDTO jogador) {
    	EPersonagem personagemAtual = jogador.getPersonagem();
        int novaPontuacao = pontuacaoJogadores.getOrDefault(personagemAtual, 0) + 1;
        pontuacaoJogadores.put(personagemAtual, novaPontuacao);
        if (scoreListener != null) {
            scoreListener.atualizarScoreJogador(jogador, novaPontuacao);
        }
    }

	public boolean verificarResposta(int idPergunta, Object object) throws SQLException {
		return PerguntasDAO.verificarResposta(idPergunta, object);
	}
}
