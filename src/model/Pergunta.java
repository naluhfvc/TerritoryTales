package model;

import java.util.List;

public class Pergunta {
	private int id;
	private String descricao;
	private Regiao regiao;
	private List<Alternativa> alternativas;
	
	public Pergunta(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	public List<Alternativa> getAlternativas() {
		return this.alternativas;
	}
	
	public void setAlternativas(List<Alternativa> alternativas) {
		this.alternativas = alternativas;
	}

	public Regiao getRegiao() {
		return regiao;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getId() {
		return id;
	}
}
