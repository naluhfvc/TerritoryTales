package controller;

import dto.JogadorDTO;
import model.EPersonagem;
import services.JogadorService;

public class JogadorController {
    private JogadorService jogadorService;
    private PontuacaoController pontuacaoController;

    public JogadorController(PontuacaoController pontuacaoController) {
        this.jogadorService = new JogadorService();
        this.pontuacaoController = pontuacaoController;
    }

    public void selecionarJogador(EPersonagem personagem) {
        jogadorService.selecionarJogador(personagem);
    }

    public JogadorDTO getJogadorSelecionado() {
        return jogadorService.getJogadorSelecionado();
    }

    public JogadorDTO[] getJogadores() {
        return jogadorService.getJogadores();
    }

    public void limparJogadorSelecionado() {
        jogadorService.limparJogadorSelecionado();
    }
}
