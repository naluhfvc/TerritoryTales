package dto;

import javax.swing.JButton;

public class MouseEventDTO {
	private JButton button;
	private JogadorDTO jogadorDTO;

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}

	public JogadorDTO getJogadorDTO() {
		return jogadorDTO;
	}

	public void setJogadorDTO(JogadorDTO jogadorDTO) {
		this.jogadorDTO = jogadorDTO;
	}
}
