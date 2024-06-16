package model;

import java.net.URL;

import javax.swing.ImageIcon;

public enum EPersonagem {
    SONNA(1, Time.LUZ, "/images/SonnaIcon.png"),
    SERAPHINE(2, Time.LUZ, "/images/SeraphineIcon.png"),
    THRESH(3, Time.SOMBRA, "/images/ThreshIcon.png"),
    MORDEKAISER(4, Time.SOMBRA, "/images/MordekaiserIcon.png");


    private Time time;
    private int id;
    private final String iconeNomeArquivo;

    EPersonagem(int id, Time time, String iconeNomeArquivo) {
        this.id = id;
        this.time = time;
        this.iconeNomeArquivo = iconeNomeArquivo;
    }

    public int getId() {
        return id;
    }
    
    public Time getTime() {
        return this.time;
    }

    public ImageIcon getIcon() {
        URL imageURL = EPersonagem.class.getResource(iconeNomeArquivo);
        if (imageURL != null) {
            return new ImageIcon(imageURL);
        } else {
            System.err.println("Imagem não encontrada:" + iconeNomeArquivo);
            return null;
        }
    }
}
