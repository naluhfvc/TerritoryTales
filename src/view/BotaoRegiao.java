package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;

public class BotaoRegiao extends JButton {

	public BotaoRegiao() {
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (!enabled) {
            if (getIcon() == null) {
                setDisabledIcon(null);
                setBackground(new Color(255, 0, 0, 127));
            } else {
                setDisabledIcon(getIcon());
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (!isEnabled() && getIcon() == null) {
            Graphics g2 = g.create();
            g2.setColor(getBackground());
            g2.fillRect(0, 0, getWidth(), getHeight());
            g2.dispose();
        }
        super.paintComponent(g);
    }
}
