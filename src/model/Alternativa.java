package model;

public class Alternativa {
	private int id;
	private Pergunta pergunta;
	private String texto;
	
	public Alternativa(int id, String texto) {
		this.id = id; 
		this.texto = texto;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public int getId() {
		return this.id;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}
}
