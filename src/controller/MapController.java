package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import dto.AtualizarIconeInput;
import dto.JogadorDTO;
import dto.MouseEventDTO;
import model.ERegiaoNome;
import model.Pergunta;
import view.PerguntaFrame;

public class MapController {
    private RegiaoController regiaoController;
    private HashMap<ERegiaoNome, List<JButton>> botoesRegioes = new HashMap<>();
    private JogadorController jogadorController;
    private PontuacaoController pontuacaoController;
    private PerguntaController perguntaController;

    public PontuacaoController getPontuacaoController() {
        return this.pontuacaoController;
    }

    public RegiaoController getRegiaoController() {
        return this.regiaoController;
    }

    public MapController(JogadorController jogadorController, PontuacaoController pontuacaoController) {
        this.jogadorController = jogadorController;
        this.pontuacaoController = pontuacaoController;
        this.perguntaController = new PerguntaController();
        this.regiaoController = new RegiaoController();
    }

    public HashMap<ERegiaoNome, String> getNomesRegioes() {
        return regiaoController.getNomesRegioes();
    }

    public HashMap<ERegiaoNome, List<JButton>> getBotoesRegioes() {
        return botoesRegioes;
    }

    public void configurarBotao(JButton botao, ERegiaoNome regiaoEnum) {
        botao.putClientProperty("region", regiaoEnum);
        botao.addActionListener(e -> {
            JogadorDTO jogadorSelecionado = jogadorController.getJogadorSelecionado();
            if (jogadorSelecionado != null) {
                Pergunta pergunta = null;
                try {
                    pergunta = perguntaController.obterPerguntaAleatoria(regiaoEnum.getId());
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                if (pergunta != null) {
                    AtualizarIconeInput input = new AtualizarIconeInput();
                    input.setBotao(botao);
                    input.setJogadorDTO(jogadorSelecionado);
                    input.setRegionButtons(botoesRegioes);
                    input.setPergunta(pergunta);
                    input.setRegiaoAtual(regiaoEnum);

                    new PerguntaFrame(input, regiaoController, pontuacaoController, jogadorController).setVisible(true);
                } 

                jogadorController.limparJogadorSelecionado();
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um personagem primeiro!", "Ops, algo aconteceu!!", JOptionPane.ERROR_MESSAGE);
            }
        });
        botao.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                MouseEventDTO dto = new MouseEventDTO();
                dto.setButton(botao);
                dto.setJogadorDTO(jogadorController.getJogadorSelecionado());
                regiaoController.mouseEntered(dto);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                MouseEventDTO dto = new MouseEventDTO();
                dto.setButton(botao);
                regiaoController.mouseExited(dto);
            }
        });
        botoesRegioes.computeIfAbsent(regiaoEnum, k -> new ArrayList<>()).add(botao);
    }
}
