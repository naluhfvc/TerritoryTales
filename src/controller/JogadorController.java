package controller;

import model.Jogador;
import model.TipoPersonagem;

public class JogadorController {
	private Jogador jogador;
	
	public JogadorController(TipoPersonagem tipoPersonagem)
	{
		jogador = new Jogador(tipoPersonagem);
	}
	
	public void incrementarPontuacao() {
		jogador.setPontuacao(jogador.getPontuacao() + 1);
    }

    public void decrementarPontuacao() {
        if (jogador.getPontuacao() > 0) {
        	jogador.setPontuacao(jogador.getPontuacao() - 1);
        }
    }

    public int getPontuacao() {
        return jogador.getPontuacao();
    }

    public TipoPersonagem getPersonagem() {
        return jogador.getPersonagem();
    }
}
