package view;

import javax.swing.ImageIcon;

public class PlayerConfig extends LabelConfig {
    ImageIcon icon;

    PlayerConfig(int x, int y, int width, int height, ImageIcon icon) {
        super(x, y, width, height);
        this.icon = icon;
    }
}