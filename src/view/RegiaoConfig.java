package view;

import java.awt.Font;

public class RegiaoConfig extends LabelConfig {
    Font font;

    RegiaoConfig(int x, int y, int width, int height, Font font) {
        super(x, y, width, height);
        this.font = font;
    }
}
