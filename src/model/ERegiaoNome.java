package model;

public enum ERegiaoNome {
    IONIA(1, "Ionia"),
    AGUAS_DE_SENTINA(2, "Aguas de Sentina"),
    SHURIMA(3, "Shurima"),
    DEMACIA(4, "Demacia"),
    FRELJORD(5, "Freljord");
	
    private final int id;
	private final String nome;

	ERegiaoNome(int id, String nome) {
    	this.nome = nome;
    	this.id = id;
	}
	
	public String getNome()
	{
		return nome;
	}

	public int getId() {
		return id;
	}
}
