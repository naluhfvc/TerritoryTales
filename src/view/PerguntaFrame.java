package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.JogadorController;
import controller.PontuacaoController;
import controller.RegiaoController;
import dto.AtualizarIconeInput;
import model.Alternativa;

public class PerguntaFrame extends JFrame {

    private JLabel perguntaLabel; 
    private JButton[] alternativaButtons;

    public PerguntaFrame(AtualizarIconeInput input, RegiaoController regiaoController, PontuacaoController pontuacaoController, JogadorController jogadorController) {
        
    	// Tratar erro de inicialização de frame na inicialização do jogo
    	if(input.getPergunta() == null || input.getRegiaoAtual() == null)
    		return;
    	
    	setTitle("Pergunta (" + input.getPergunta().getId() + ") -" + input.getRegiaoAtual().getNome());
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);

        perguntaLabel = new JLabel("<html>" + input.getPergunta().getDescricao() + "</html>");
        perguntaLabel.setFont(new Font("Dialog", Font.BOLD, 16));
        perguntaLabel.setBounds(20, 20, 550, 50);
        panel.add(perguntaLabel);

        List<Alternativa> alternativas = input.getPergunta().getAlternativas();
        alternativaButtons = new JButton[alternativas.size()];
        for (int i = 0; i < alternativas.size(); i++) {
            Alternativa alternativa = alternativas.get(i);
            alternativaButtons[i] = new JButton(alternativa.getTexto());
            alternativaButtons[i].setBounds(20, 90 + i * 60, 550, 50);
            alternativaButtons[i].setFont(new Font("Dialog", Font.PLAIN, 14));
            alternativaButtons[i].putClientProperty("id", alternativa.getId());
            panel.add(alternativaButtons[i]);
            alternativaButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton sourceButton = (JButton) e.getSource();
                    int alternativaId = (int) sourceButton.getClientProperty("id");
                    input.setAlternativaEscolhida(alternativaId);
                    regiaoController.atualizarIcone(input, pontuacaoController, jogadorController);
                    dispose();
                }
            });
        }
        
        add(panel);
    }
}
