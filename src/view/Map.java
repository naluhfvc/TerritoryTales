package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import controller.MapController;
import model.TipoPersonagem;

public class Map {

	private JFrame frame;
	private MapController mapController;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Map window = new Map();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Map() {
		mapController = new MapController();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		inicializarFrame();
	    
	    URL iconURL = Map.class.getResource("/images/iconLol.png");
	    if (iconURL != null) {
	        frame.setIconImage(new ImageIcon(iconURL).getImage());
	    } else {
	        System.err.println("Não foi possível carregar o ícone do frame: /images/iconLol.png");
	    }
	    
	    inicializarBotaoLevel();
	    
	    inicializarScoreJogador();

	    inicializarRegioesMapa();    
	    
	    JLabel mapa = new JLabel("");
	    mapa.setBounds(170, 0, 766, 573);
	    mapa.setHorizontalAlignment(SwingConstants.CENTER);
	    URL iconURLMap = Map.class.getResource("/images/RuneTerraMap.jpeg");
	    if (iconURLMap != null) {
	    	mapa.setIcon(new ImageIcon(iconURLMap));
	    }
	    
	    JButton lblNewLabel_1 = new JButton("");
	    lblNewLabel_1.addActionListener(e -> mapController.selecionarJogador(TipoPersonagem.SONNA));
	    lblNewLabel_1.setIcon(TipoPersonagem.SONNA.getIcon());
	    lblNewLabel_1.setBounds(25, 50, 103, 86);
	    frame.getContentPane().add(lblNewLabel_1);
	    
	    JButton lblNewLabel_2 = new JButton("");
	    lblNewLabel_2.addActionListener(e -> mapController.selecionarJogador(TipoPersonagem.SERAPHINE));
	    lblNewLabel_2.setIcon(TipoPersonagem.SERAPHINE.getIcon());
	    lblNewLabel_2.setBounds(25, 177, 103, 86);
	    frame.getContentPane().add(lblNewLabel_2);
	    
	    JButton lblNewLabel_3 = new JButton("");
	    lblNewLabel_3.addActionListener(e -> mapController.selecionarJogador(TipoPersonagem.THRESH));
	    lblNewLabel_3.setIcon(TipoPersonagem.THRESH.getIcon());
	    lblNewLabel_3.setBounds(25, 308, 103, 86);
	    frame.getContentPane().add(lblNewLabel_3);
	    
	    JButton lblNewLabel_4 = new JButton("");
	    lblNewLabel_4.addActionListener(e -> mapController.selecionarJogador(TipoPersonagem.MORDEKAISER));
	    lblNewLabel_4.setIcon(TipoPersonagem.MORDEKAISER.getIcon());
	    lblNewLabel_4.setBounds(25, 434, 103, 86);
	    frame.getContentPane().add(lblNewLabel_4);
	    
	    JLabel campeaoLabel = new JLabel("CHAMPIONS");
	    campeaoLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20));
	    campeaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    campeaoLabel.setForeground(new Color(255, 255, 255));
	    campeaoLabel.setBounds(10, 10, 150, 31);
	    frame.getContentPane().add(campeaoLabel);

	    frame.getContentPane().add(mapa);
	}
	
	private void inicializarRegioesMapa() {
		JLabel lblIonia = new JLabel("Ionia");
	    lblIonia.setHorizontalAlignment(SwingConstants.CENTER);
	    lblIonia.setForeground(Color.WHITE);
	    lblIonia.setFont(new Font("Kristen ITC", Font.BOLD, 20));
	    lblIonia.setBounds(706, 73, 150, 31);
	    frame.getContentPane().add(lblIonia);
	    
	    JLabel lblguasDeSentina = new JLabel("<html><p><center>Águas<br> de<br> Sentina</center></p></html>");
	    lblguasDeSentina.setHorizontalAlignment(SwingConstants.CENTER);
	    lblguasDeSentina.setForeground(Color.WHITE);
	    lblguasDeSentina.setFont(new Font("Kristen ITC", Font.BOLD, 14));
	    lblguasDeSentina.setBounds(723, 250, 150, 87);
	    frame.getContentPane().add(lblguasDeSentina);
	    
	    JLabel lblShurima = new JLabel("Shurima");
	    lblShurima.setHorizontalAlignment(SwingConstants.CENTER);
	    lblShurima.setForeground(Color.WHITE);
	    lblShurima.setFont(new Font("Kristen ITC", Font.BOLD, 20));
	    lblShurima.setBounds(373, 378, 150, 31);
	    frame.getContentPane().add(lblShurima);
	    
	    JLabel lblDemacia = new JLabel("Demacia");
	    lblDemacia.setHorizontalAlignment(SwingConstants.CENTER);
	    lblDemacia.setForeground(Color.WHITE);
	    lblDemacia.setFont(new Font("Kristen ITC", Font.BOLD, 20));
	    lblDemacia.setBounds(228, 203, 150, 31);
	    frame.getContentPane().add(lblDemacia);
	    
	    JLabel lblFreljord = new JLabel("Freljord");
	    lblFreljord.setHorizontalAlignment(SwingConstants.CENTER);
	    lblFreljord.setForeground(Color.WHITE);
	    lblFreljord.setFont(new Font("Kristen ITC", Font.BOLD, 20));
	    lblFreljord.setBounds(203, 61, 150, 31);
	    frame.getContentPane().add(lblFreljord);
		
	}

	private void inicializarScoreJogador()
	{
		ArrayList<JTextPane> scores = new ArrayList<JTextPane>();
	    JTextPane pontuacaoJogador1 = new JTextPane();
	    pontuacaoJogador1.setText("0");
	    pontuacaoJogador1.setFont(new Font("Dialog", Font.BOLD, 20));
	    pontuacaoJogador1.setEditable(false);
	    pontuacaoJogador1.setBounds(25, 137, 103, 30);
	    centralizarScore(pontuacaoJogador1);
	    frame.getContentPane().add(pontuacaoJogador1);
	    scores.add(pontuacaoJogador1);

	    JTextPane pontuacaoJogador2 = new JTextPane();
	    pontuacaoJogador2.setText("0");
	    pontuacaoJogador2.setFont(new Font("Dialog", Font.BOLD, 20));
	    pontuacaoJogador2.setEditable(false);
	    pontuacaoJogador2.setBounds(25, 264, 103, 30);
	    centralizarScore(pontuacaoJogador2);
	    frame.getContentPane().add(pontuacaoJogador2);
	    scores.add(pontuacaoJogador2);

	    JTextPane pontuacaoJogador3 = new JTextPane();
	    pontuacaoJogador3.setText("0");
	    pontuacaoJogador3.setFont(new Font("Dialog", Font.BOLD, 20));
	    pontuacaoJogador3.setEditable(false);
	    pontuacaoJogador3.setBounds(25, 395, 103, 30);
	    centralizarScore(pontuacaoJogador3);
	    frame.getContentPane().add(pontuacaoJogador3);
	    scores.add(pontuacaoJogador3);

	    JTextPane pontuacaoJogador4 = new JTextPane();
	    pontuacaoJogador4.setText("0");
	    pontuacaoJogador4.setFont(new Font("Kristen ITC", Font.BOLD, 20));
	    pontuacaoJogador4.setEditable(false);
	    pontuacaoJogador4.setBounds(25, 521, 103, 30);
	    centralizarScore(pontuacaoJogador4);
	    frame.getContentPane().add(pontuacaoJogador4);
	    scores.add(pontuacaoJogador4);
	    
	    mapController.iniciarScorePartida(scores);
	}
	
	private void centralizarScore(JTextPane pane)
	{
	    StyledDocument doc = pane.getStyledDocument();
	    SimpleAttributeSet center = new SimpleAttributeSet();
	    StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
	    doc.setParagraphAttributes(0, doc.getLength(), center, false);
	}

	private void inicializarFrame()
	{
	    frame = new JFrame();
	    frame.setBounds(100, 100, 950, 600);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(null);
	    frame.getContentPane().setBackground(new Color(0, 0, 0));
	    frame.setResizable(false);
	    frame.setForeground(new Color(255, 255, 255));
	}
	
	private void inicializarBotaoLevel()
	{
		JButton fj4 = new JButton("");
	    JButton fj3 = new JButton("");
	    JButton fj2 = new JButton("");
	    JButton fj1 = new JButton("");
	    JButton sh2 = new JButton("");
	    JButton io1 = new JButton("");
	    JButton dm3 = new JButton("");
	    JButton ac5 = new JButton("");
	    JButton ac3 = new JButton("");
	    JButton ac4 = new JButton("");
	    JButton ac2 = new JButton("");
	    JButton ac1 = new JButton("");
	    JButton dm1 = new JButton("");
	    JButton dm2 = new JButton("");
	    JButton dm4 = new JButton("");
	    JButton dm5 = new JButton("");
	    JButton io4 = new JButton("");
	    JButton io2 = new JButton("");
	    JButton io3 = new JButton("");
	    JButton io5 = new JButton("");
	    JButton sh5 = new JButton("");
	    JButton sh3 = new JButton("");
	    JButton sh1 = new JButton("");
	    JButton sh4 = new JButton("");
	    JButton fj5 = new JButton("");
	    
	    mapController.configurarBotao(fj4);
	    mapController.configurarBotao(fj3);
	    mapController.configurarBotao(fj2);
	    mapController.configurarBotao(fj1);
	    mapController.configurarBotao(sh2);
	    mapController.configurarBotao(io1);
	    mapController.configurarBotao(dm3);
	    mapController.configurarBotao(ac5);
	    mapController.configurarBotao(ac3);
	    mapController.configurarBotao(ac4);
	    mapController.configurarBotao(ac2);
	    mapController.configurarBotao(ac1);
	    mapController.configurarBotao(dm1);
	    mapController.configurarBotao(dm2);
	    mapController.configurarBotao(dm4);
	    mapController.configurarBotao(dm5);
	    mapController.configurarBotao(io4);
	    mapController.configurarBotao(io2);
	    mapController.configurarBotao(io3);
	    mapController.configurarBotao(io5);
	    mapController.configurarBotao(sh5);
	    mapController.configurarBotao(sh3);
	    mapController.configurarBotao(sh1);
	    mapController.configurarBotao(sh4);
	    mapController.configurarBotao(fj5);
	    
	    fj4.setBounds(240, 135, 35, 35);
	    fj5.setBounds(284, 135, 35, 35);
	    fj3.setBounds(301, 90, 35, 35);
	    fj2.setBounds(258, 90, 35, 35);
	    fj1.setBounds(214, 90, 35, 35);
	    sh2.setBounds(427, 408, 35, 35);
	    sh5.setBounds(451, 453, 35, 35);
	    sh3.setBounds(470, 408, 35, 35);
	    sh1.setBounds(383, 408, 35, 35);
	    sh4.setBounds(406, 453, 35, 35);
	    io1.setBounds(746, 148, 35, 35);
	    io4.setBounds(807, 103, 35, 35);
	    io2.setBounds(719, 103, 35, 35);
	    io3.setBounds(762, 103, 35, 35);
	    io5.setBounds(789, 148, 35, 35);
	    dm3.setBounds(327, 233, 35, 35);
	    dm1.setBounds(240, 233, 35, 35);
	    dm2.setBounds(284, 233, 35, 35);
	    dm4.setBounds(258, 278, 35, 35);
	    dm5.setBounds(303, 278, 35, 35);
	    ac5.setBounds(807, 381, 35, 35);
	    ac3.setBounds(779, 336, 35, 35);
	    ac4.setBounds(821, 336, 35, 35);
	    ac2.setBounds(736, 336, 35, 35);
	    ac1.setBounds(762, 381, 35, 35);
	    
	    frame.getContentPane().add(fj1);
	    frame.getContentPane().add(fj2);
	    frame.getContentPane().add(fj3);
	    frame.getContentPane().add(fj4);
	    frame.getContentPane().add(fj5);
	    frame.getContentPane().add(sh1);
	    frame.getContentPane().add(sh2);
	    frame.getContentPane().add(sh3);
	    frame.getContentPane().add(sh4);
	    frame.getContentPane().add(sh5);
	    frame.getContentPane().add(io1);
	    frame.getContentPane().add(io2);
	    frame.getContentPane().add(io3);
	    frame.getContentPane().add(io4);
	    frame.getContentPane().add(io5);
	    frame.getContentPane().add(dm1);
	    frame.getContentPane().add(dm2);
	    frame.getContentPane().add(dm3);
	    frame.getContentPane().add(dm4);
	    frame.getContentPane().add(dm5);
	    frame.getContentPane().add(ac1);
	    frame.getContentPane().add(ac2);
	    frame.getContentPane().add(ac3);
	    frame.getContentPane().add(ac4);
	    frame.getContentPane().add(ac5);
	}

}
