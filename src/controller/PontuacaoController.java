package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTextPane;
import dto.JogadorDTO;
import model.Time;
import services.PontuacaoService;
import view.AtualizarScoreListener;

public class PontuacaoController {
    private PontuacaoService pontuacaoService;

    public PontuacaoController(AtualizarScoreListener listener) {
        pontuacaoService = new PontuacaoService(listener);
    }

    public void incrementarPontuacaoTime(Time time) {
        pontuacaoService.incrementarPontuacaoTime(time);
    }

    public void incrementarPontuacaoJogador(JogadorDTO jogador) {
        pontuacaoService.incrementarPontuacaoJogador(jogador);
    }
    
    public boolean verificarResposta(int idPergunta, Object object) throws SQLException {
    	return pontuacaoService.verificarResposta(idPergunta, object);
    }
}
