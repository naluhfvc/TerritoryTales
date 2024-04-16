package model;

import java.net.URL;

import javax.swing.ImageIcon;

public enum TipoPersonagem {
    SONNA(1, "/images/SonnaIcon.png"),
    SERAPHINE(2, "/images/SeraphineIcon.png"),
    THRESH(3, "/images/ThreshIcon.png"),
    MORDEKAISER(4, "/images/MordekaiserIcon.png");

    private final int id;
    private final String iconeNomeArquivo;

    TipoPersonagem(int id, String iconeNomeArquivo) {
        this.id = id;
        this.iconeNomeArquivo = iconeNomeArquivo;
    }

    public int getId() {
        return id;
    }

    public ImageIcon getIcon() {
        URL imageURL = TipoPersonagem.class.getResource(iconeNomeArquivo);
        if (imageURL != null) {
            return new ImageIcon(imageURL);
        } else {
            System.err.println("Imagem não encontrada:" + iconeNomeArquivo);
            return null;
        }
    }
}
