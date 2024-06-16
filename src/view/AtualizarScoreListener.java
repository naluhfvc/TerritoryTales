package view;

import dto.JogadorDTO;
import model.Time;

public interface AtualizarScoreListener {
    void atualizarScoreTime(Time time, int newScore);
    void atualizarScoreJogador(JogadorDTO jogador, int newScore);
}
