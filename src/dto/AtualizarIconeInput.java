package dto;

import java.util.HashMap;
import java.util.List;

import javax.swing.JButton;

import model.ERegiaoNome;
import model.Pergunta;
import services.RegiaoService;

public class AtualizarIconeInput {
	private JButton botao;
	private JogadorDTO jogadorDTO;
	private RegiaoService[] regioes;
	private HashMap<ERegiaoNome, List<JButton>> regionButtons;
	private Pergunta pergunta;
	private int alternativaEscolhida;
	private ERegiaoNome regiaoAtual;

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

	public JButton getBotao() {
		return botao;
	}

	public void setBotao(JButton botao) {
		this.botao = botao;
	}

	public JogadorDTO getJogadorDTO() {
		return jogadorDTO;
	}

	public void setJogadorDTO(JogadorDTO jogadorDTO) {
		this.jogadorDTO = jogadorDTO;
	}

	public RegiaoService[] getRegioes() {
		return regioes;
	}

	public void setRegioes(RegiaoService[] regioes) {
		this.regioes = regioes;
	}

	public HashMap<ERegiaoNome, List<JButton>> getRegionButtons() {
		return regionButtons;
	}

	public void setRegionButtons(HashMap<ERegiaoNome, List<JButton>> regionButtons) {
		this.regionButtons = regionButtons;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public ERegiaoNome getRegiaoAtual() {
		return regiaoAtual;
	}

	public void setRegiaoAtual(ERegiaoNome regiaoAtual) {
		this.regiaoAtual = regiaoAtual;
	}

	public int getAlternativaEscolhida() {
		return alternativaEscolhida;
	}

	public void setAlternativaEscolhida(int alternativaEscolhida) {
		this.alternativaEscolhida = alternativaEscolhida;
	}
}
