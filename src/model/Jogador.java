package model;

public class Jogador {
    private int pontuacao;
    private TipoPersonagem personagem;

    public Jogador(TipoPersonagem personagem) {
        this.setPontuacao(0);
        this.personagem = personagem;
    }

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public TipoPersonagem getPersonagem() {
		return personagem;
	}
}
