package model;

public class Jogador {
	private int id;
    private int pontuacao;
    private EPersonagem personagem;

    public Jogador(EPersonagem personagem) {
        this.setPontuacao(0);
        this.personagem = personagem;
        this.id = this.getPersonagem().getId();
    }

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public EPersonagem getPersonagem() {
		return personagem;
	}
	
	public int getId() {
		return this.id;
	}
}
