package model;

import javax.swing.ImageIcon;

public class Personagem {
    private TipoPersonagem tipo;

    public Personagem(TipoPersonagem tipo) {
        this.tipo = tipo;
    }

    public ImageIcon getIcone() {
        return tipo.getIcon();
    }
}