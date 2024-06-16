package dto;

import model.EPersonagem;
import model.Time;

public class JogadorDTO {
	private EPersonagem personagem;
	private int pontuacao;
	private int id;
	private Time time;

	public EPersonagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(EPersonagem personagem) {
		this.personagem = personagem;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}
