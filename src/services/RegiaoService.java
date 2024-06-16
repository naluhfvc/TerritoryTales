package services;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import dto.JogadorDTO;
import model.ERegiaoNome;
import model.Regiao;
import model.Time;

public class RegiaoService {
    private Map<ERegiaoNome, Regiao> regioes;
    private int maxCasas = 3;
    private Map<ERegiaoNome, Map<Time, Integer>> casasControladas;
    private final int MAX_AREAS_DOMINADAS = 3;

    public RegiaoService() {
        this.regioes = new HashMap<>();
        for (ERegiaoNome regiaoNome : ERegiaoNome.values()) {
            regioes.put(regiaoNome, new Regiao(regiaoNome));
        }
        this.casasControladas = new HashMap<>();
        for (ERegiaoNome regiaoNome : ERegiaoNome.values()) {
            casasControladas.put(regiaoNome, new HashMap<>());
        }
    }

    public HashMap<ERegiaoNome, String> getNomesRegioes() {
        HashMap<ERegiaoNome, String> nomes = new HashMap<>();
        for (Regiao regiao : regioes.values()) {
            nomes.put(regiao.getRegiaoNome(), regiao.getRegiaoNome().getNome());
        }
        return nomes;
    }

    public void incrementarCasaControlada(ERegiaoNome regiaoNome, Time time) {
        Map<Time, Integer> casasPorTime = casasControladas.get(regiaoNome);
        if (!isDominada(regiaoNome)) {
            casasPorTime.put(time, casasPorTime.getOrDefault(time, 0) + 1);
        }
    }

    public boolean isDominada(ERegiaoNome regiaoNome) {
        Map<Time, Integer> casasPorTime = casasControladas.get(regiaoNome);
        for (Entry<Time, Integer> entry : casasPorTime.entrySet()) {
            if (entry.getValue() >= this.maxCasas) {
                regioes.get(regiaoNome).setDominada();
                
                return true;
            }
        }
        return false;
    }

    public Time getDominador(ERegiaoNome regiaoNome) {
        Map<Time, Integer> casasPorTime = casasControladas.get(regiaoNome);
        for (Entry<Time, Integer> entry : casasPorTime.entrySet()) {
            if (entry.getValue() >= this.maxCasas) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void processarJogadorNoBotao(JButton botao, JogadorDTO jogadorDTO, ERegiaoNome regiaoNome) {
        JogadorDTO jogadorNoBotao = (JogadorDTO) botao.getClientProperty("jogador");

        // Verificar se o botão já está ocupado
        if (jogadorNoBotao != null) {
            return;
        }

        incrementarCasaControlada(regiaoNome, jogadorDTO.getTime());

        ImageIcon iconePersonagem = jogadorDTO.getPersonagem().getIcon();
        ImageIcon iconeRedimensionado = redimensionarImagem(iconePersonagem, botao);
        botao.setIcon(iconeRedimensionado);
        botao.putClientProperty("possuiImagem", true);
        botao.putClientProperty("jogador", jogadorDTO);
    }

    public void desativarBotoesDaRegiao(ERegiaoNome regiaoNome, HashMap<ERegiaoNome, List<JButton>> regionButtons) {
        List<JButton> botoesDaRegiao = regionButtons.get(regiaoNome);
        if (botoesDaRegiao != null) {
            for (JButton botao : botoesDaRegiao) {
                botao.setEnabled(false);
            }
        }
    }

    public void mouseEntered(JButton button, JogadorDTO jogadorDTO, ERegiaoNome regiaoNome) {
        boolean possuiImagem = Boolean.TRUE.equals(button.getClientProperty("possuiImagem"));
        if (jogadorDTO == null && possuiImagem) {
            button.setBorder(BorderFactory.createLineBorder(java.awt.Color.RED, 2));
        } else if (jogadorDTO != null && !possuiImagem) {
            ImageIcon iconeOriginal = (ImageIcon) button.getClientProperty("iconeOriginal");
            button.putClientProperty("iconeOriginal", iconeOriginal);
            ImageIcon imagemRedimensionada = redimensionarImagem(jogadorDTO.getPersonagem().getIcon(), button);
            ImageIcon iconeComOpacidade = criarIconeComOpacidade(imagemRedimensionada, 0.5f);
            button.setIcon(iconeComOpacidade);
        }
    }

    public boolean verificarVitoria(Time time) {
        int areasDominadas = 0;
        for (Regiao regiao : regioes.values()) {
            if (isDominada(regiao.getRegiaoNome()) && getDominador(regiao.getRegiaoNome()).equals(time)) {
                areasDominadas++;
            }
        }
        return areasDominadas >= MAX_AREAS_DOMINADAS;
    }

    public void mouseExited(JButton button, ERegiaoNome regiaoNome) {
        if (!Boolean.TRUE.equals(button.getClientProperty("possuiImagem"))) {
            ImageIcon iconeOriginal = (ImageIcon) button.getClientProperty("iconeOriginal");
            button.setIcon(iconeOriginal);
        }
        button.setBorder(null);
    }

    private ImageIcon redimensionarImagem(ImageIcon icon, JButton botao) {
        int largura = botao.getWidth();
        int altura = botao.getHeight();
        Image imagem = icon.getImage();
        Image novaImg = imagem.getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
        return new ImageIcon(novaImg);
    }

    private ImageIcon criarIconeComOpacidade(ImageIcon icon, float opacidade) {
        int largura = icon.getIconWidth();
        int altura = icon.getIconHeight();
        BufferedImage imagemOpaca = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_ARGB);
        java.awt.Graphics2D g2 = imagemOpaca.createGraphics();

        g2.setComposite(java.awt.AlphaComposite.SrcOver.derive(opacidade));
        g2.drawImage(icon.getImage(), 0, 0, largura, altura, null);
        g2.dispose();

        return new ImageIcon(imagemOpaca);
    }
}
