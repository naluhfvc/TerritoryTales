package controller;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;

import model.TipoPersonagem;

public class MapController {
    private JogadorController[] jogadores;
    private JogadorController jogadorSelecionado;
    private HashMap<JogadorController, JTextPane> mapaPontuacao;
    
    public MapController() {
        jogadores = new JogadorController[]{
            new JogadorController(TipoPersonagem.SONNA),
            new JogadorController(TipoPersonagem.SERAPHINE),
            new JogadorController(TipoPersonagem.THRESH),
            new JogadorController(TipoPersonagem.MORDEKAISER)
        };
    }
    
    public JogadorController selecionarJogador(TipoPersonagem personagem) {
        for (JogadorController jogador : jogadores) {
            if (jogador.getPersonagem().equals(personagem)) {
                jogadorSelecionado = jogador;
                return jogadorSelecionado;
            }
        }
		return null;
    }
    
    public void atualizarIcone(JButton botao) {
	    if (jogadorSelecionado != null) {
	        JogadorController jogadorNoBotao = (JogadorController) botao.getClientProperty("jogador");
	        
	        if (jogadorNoBotao != null && !jogadorNoBotao.equals(jogadorSelecionado)) {
	        	decrementarPontuacao(jogadorNoBotao);
	            atualizarPontuacaoTexto(jogadorNoBotao);
	        }
	        
	        ImageIcon iconePersonagem = jogadorSelecionado.getPersonagem().getIcon();
	        int largura = botao.getWidth();
	        int altura = botao.getHeight();
	        ImageIcon iconeRedimensionado = redimensionarImagem(iconePersonagem, largura, altura);
	        botao.setIcon(iconeRedimensionado);
	        botao.putClientProperty("possuiImagem", true);
	        botao.putClientProperty("jogador", jogadorSelecionado);
	        
	        if(jogadorNoBotao == null || jogadorNoBotao != null && !jogadorNoBotao.equals(jogadorSelecionado))
	        	incrementarPontuacao(jogadorSelecionado);
	        atualizarPontuacaoTexto(jogadorSelecionado);
	        
	        jogadorSelecionado = null;
	    } else {
	        JogadorController jogador = (JogadorController) botao.getClientProperty("jogador");
	        if (jogador != null) {
	        	decrementarPontuacao(jogador);
	            atualizarPontuacaoTexto(jogador);
	            
	            botao.putClientProperty("jogador", null);
	        }
	        botao.setIcon(null);
	        botao.putClientProperty("possuiImagem", false);
	    }
	}

    private void atualizarPontuacaoTexto(JogadorController jogadorController) {
	    JTextPane pontuacaoTexto = mapaPontuacao.get(jogadorController);
	    if (pontuacaoTexto != null) {
	        int novaPontuacao = jogadorController.getPontuacao();
	        EventQueue.invokeLater(() -> pontuacaoTexto.setText(String.valueOf(novaPontuacao)));
	    }
	}

	private ImageIcon redimensionarImagem(ImageIcon icon, int largura, int altura) {
	    Image imagem = icon.getImage();
	    Image novaImg = imagem.getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
	    return new ImageIcon(novaImg);
	}

	private ImageIcon criarIconeComOpacidade(ImageIcon icon, float opacidade) {
	    int largura = icon.getIconWidth();
	    int altura = icon.getIconHeight();
	    BufferedImage imagemOpaca = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g2 = imagemOpaca.createGraphics();
	
	    g2.setComposite(AlphaComposite.SrcOver.derive(opacidade));
	    g2.drawImage(icon.getImage(), 0, 0, largura, altura, null);
	    g2.dispose();
	
	    return new ImageIcon(imagemOpaca);
	}

	public void configurarBotao(JButton button) {
	    button.addActionListener(e -> atualizarIcone(button));
	    button.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseEntered(MouseEvent e) {
	        	boolean possuiImagem = (Boolean)button.getClientProperty("possuiImagem") == Boolean.TRUE;
	            if (jogadorSelecionado == null && possuiImagem) {
	                button.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
	            } else if (jogadorSelecionado != null && !possuiImagem) {
	                ImageIcon iconeOriginal = (ImageIcon) button.getIcon();
	                button.putClientProperty("iconeOriginal", iconeOriginal);
	                ImageIcon imagemRedimensionada = redimensionarImagem(jogadorSelecionado.getPersonagem().getIcon(), button.getWidth(), button.getHeight());
	                ImageIcon iconeComOpacidade = criarIconeComOpacidade(imagemRedimensionada, 0.5f);
	                button.setIcon(iconeComOpacidade);
	            }
	        }

	        @Override
	        public void mouseExited(MouseEvent e) {
	            if ((Boolean)button.getClientProperty("possuiImagem") != Boolean.TRUE) {
	                ImageIcon iconeOriginal = (ImageIcon) button.getClientProperty("iconeOriginal");
	                button.setIcon(iconeOriginal);
	            }
	            button.setBorder(null);
	        }
	    });
	}

	public void iniciarScorePartida(ArrayList<JTextPane> scores)
	{
		mapaPontuacao = new HashMap<>();
		for(int i = 0; i < scores.size(); i++)
		{
			JTextPane currentScore = scores.get(i);
			if(!mapaPontuacao.containsKey(currentScore))
				mapaPontuacao.put(jogadores[i], currentScore);
			
		}
	}
	private void incrementarPontuacao(JogadorController jogador) {
	    if (jogador != null) {
	        jogador.incrementarPontuacao();
	        atualizarPontuacaoTexto(jogador);
	    }
	}

	private void decrementarPontuacao(JogadorController jogador) {
	    if (jogador != null) {
	        jogador.decrementarPontuacao();
	        atualizarPontuacaoTexto(jogador);
	    }
	}
}
