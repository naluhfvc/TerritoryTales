package controller;

import java.sql.SQLException;
import java.util.HashMap;

import javax.swing.JOptionPane;

import dto.AtualizarIconeInput;
import dto.JogadorDTO;
import dto.MouseEventDTO;
import model.ERegiaoNome;
import model.Time;
import services.RegiaoService;

public class RegiaoController {
    private RegiaoService regiaoService;

    public RegiaoController() {
        this.regiaoService = new RegiaoService();
    }

    public HashMap<ERegiaoNome, String> getNomesRegioes() {
        return regiaoService.getNomesRegioes();
    }

    public void atualizarIcone(AtualizarIconeInput atualizarIconeInput, PontuacaoController pontuacaoController, JogadorController jogadorController) {
        ERegiaoNome regiaoNome = (ERegiaoNome) atualizarIconeInput.getBotao().getClientProperty("region");
        JogadorDTO jogadorDTO = atualizarIconeInput.getJogadorDTO();

        boolean respostaCorreta = false;
        
        try {
            int alternativaId = atualizarIconeInput.getAlternativaEscolhida();
            respostaCorreta = pontuacaoController.verificarResposta(atualizarIconeInput.getPergunta().getId(), alternativaId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        if (jogadorDTO != null && respostaCorreta) {
            regiaoService.processarJogadorNoBotao(atualizarIconeInput.getBotao(), jogadorDTO, regiaoNome);
            if (regiaoService.isDominada(regiaoNome)) {
                Time dominador = regiaoService.getDominador(regiaoNome);
                if (dominador != null) {
                    pontuacaoController.incrementarPontuacaoTime(dominador);
                    regiaoService.desativarBotoesDaRegiao(regiaoNome, atualizarIconeInput.getRegionButtons());
                    JOptionPane.showMessageDialog(
                        null, 
                        "Região dominada pela equipe " + dominador, 
                        regiaoNome.name().replace("_", " ") + " DOMINADA!", 
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    if (regiaoService.verificarVitoria(dominador)) {
                        JOptionPane.showMessageDialog(
                            null, 
                            "A equipe " + dominador + " venceu o jogo!", 
                            "VITÓRIA!", 
                            JOptionPane.INFORMATION_MESSAGE
                        );
                        System.exit(0);
                    }
                }
            } 
            pontuacaoController.incrementarPontuacaoJogador(jogadorDTO);
        } else if (!respostaCorreta) {
            JOptionPane.showMessageDialog(null, "Alternativa incorreta! Não desanime, tente novamente.", "Vishh, não foi essa vez!", JOptionPane.ERROR_MESSAGE);
        }
        jogadorController.limparJogadorSelecionado();
    }

    public void mouseEntered(MouseEventDTO dto) {
        ERegiaoNome regiaoNome = (ERegiaoNome) dto.getButton().getClientProperty("region");
        regiaoService.mouseEntered(dto.getButton(), dto.getJogadorDTO(), regiaoNome);
    }

    public void mouseExited(MouseEventDTO dto) {
        ERegiaoNome regiaoNome = (ERegiaoNome) dto.getButton().getClientProperty("region");
        regiaoService.mouseExited(dto.getButton(), regiaoNome);
    }
}
