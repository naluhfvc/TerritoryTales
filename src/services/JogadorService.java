package services;

import java.util.ArrayList;

import dto.JogadorDTO;
import model.EPersonagem;
import model.Jogador;

public class JogadorService {
    private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    private Jogador jogadorSelecionado;

    public JogadorService() {
        jogadores.add(new Jogador(EPersonagem.SONNA));
        jogadores.add(new Jogador(EPersonagem.SERAPHINE));
        jogadores.add(new Jogador(EPersonagem.THRESH));
        jogadores.add(new Jogador(EPersonagem.MORDEKAISER));
    }

    public void selecionarJogador(EPersonagem personagem) {
        for (Jogador jogador : jogadores) {
            if (jogador.getPersonagem().equals(personagem)) {
                jogadorSelecionado = jogador;
                break;
            }
        }
    }

    public void incrementarPontuacaoJogador() {
    	for(Jogador jogador : jogadores) {
    		if (jogadorSelecionado != null && jogador.getPersonagem().equals(jogadorSelecionado.getPersonagem())) {
    			System.out.println("antes: " + jogador.getPontuacao());
    			jogador.setPontuacao(jogador.getPontuacao() + 1);
    			System.out.println("antes: " + jogador.getPontuacao());
    		}    		
    	}
    }

    public JogadorDTO getJogadorSelecionado() {
        if (jogadorSelecionado != null) {
            return toDTO(jogadorSelecionado);
        }
        return null;
    }
    
    public void limparJogadorSelecionado() {
    		jogadorSelecionado = null;
    }

    public JogadorDTO[] getJogadores() {
        return jogadores.stream().map(this::toDTO).toArray(JogadorDTO[]::new);
    }
    
	private JogadorDTO toDTO(Jogador jogador) {
		JogadorDTO dto = new JogadorDTO();
		EPersonagem personagem = jogador.getPersonagem();
		dto.setPersonagem(personagem);
		dto.setPontuacao(jogador.getPontuacao());
		dto.setId(jogador.getId());
		dto.setTime(personagem.getTime());
		return dto;
	}
}
