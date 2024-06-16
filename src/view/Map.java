package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import controller.JogadorController;
import controller.MapController;
import controller.PontuacaoController;
import dao.InitDB;
import dto.JogadorDTO;
import model.EPersonagem;
import model.ERegiaoNome;
import model.Time;

public class Map implements AtualizarScoreListener {

	JTextPane pontuacaoTime2;
	JTextPane pontuacaoTime1;

	JTextPane pontuacaoJogador1;
	JTextPane pontuacaoJogador2;
	JTextPane pontuacaoJogador3;
	JTextPane pontuacaoJogador4;

	private JFrame frame;
	private MapController mapController;
	private JogadorController jogadorController;
	private PontuacaoController pontuacaoController;
	private InitDB initDB;

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
		initDB = new InitDB();
		initDB.inicializarBanco();

		pontuacaoController = new PontuacaoController(this);
		jogadorController = new JogadorController(pontuacaoController);
		mapController = new MapController(jogadorController, pontuacaoController);
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

		JLabel mapa = new JLabel("");
		mapa.setBounds(170, 0, 766, 573);
		mapa.setHorizontalAlignment(SwingConstants.CENTER);
		URL iconURLMap = Map.class.getResource("/images/RuneTerraMap.jpeg");
		if (iconURLMap != null) {
			mapa.setIcon(new ImageIcon(iconURLMap));
		}

		inicializarBotaoLevel();

		inicializarScoreJogador();

		pontuacaoTime1 = new JTextPane();
		pontuacaoTime1.setText("0");
		pontuacaoTime1.setFont(new Font("Dialog", Font.BOLD, 20));
		pontuacaoTime1.setEditable(false);
		pontuacaoTime1.setBounds(125, 43, 35, 30);
		frame.getContentPane().add(pontuacaoTime1);

		pontuacaoTime2 = new JTextPane();
		pontuacaoTime2.setText("0");
		pontuacaoTime2.setFont(new Font("Dialog", Font.BOLD, 20));
		pontuacaoTime2.setEditable(false);
		pontuacaoTime2.setBounds(125, 317, 35, 30);
		frame.getContentPane().add(pontuacaoTime2);

		JLabel lblMusicista = new JLabel("Musicista");
		lblMusicista.setFont(new Font("Dialog", Font.BOLD, 16));
		lblMusicista.setForeground(new Color(255, 255, 255));
		lblMusicista.setBounds(25, 43, 80, 35);
		frame.getContentPane().add(lblMusicista);

		JLabel lblSombras = new JLabel("Sombras");
		lblSombras.setForeground(Color.WHITE);
		lblSombras.setFont(new Font("Dialog", Font.BOLD, 16));
		lblSombras.setBounds(25, 317, 80, 35);
		frame.getContentPane().add(lblSombras);

		inicializarRegioesMapa();

		inicializarJogadores();

		frame.getContentPane().add(mapa);
	}

	private void inicializarJogadores() {
		PlayerConfig configSonna = new PlayerConfig(25, 50, 103, 86, EPersonagem.SONNA.getIcon());
		PlayerConfig configSeraphine = new PlayerConfig(25, 177, 103, 86, EPersonagem.SERAPHINE.getIcon());
		PlayerConfig configThresh = new PlayerConfig(25, 308, 103, 86, EPersonagem.THRESH.getIcon());
		PlayerConfig configMordekaiser = new PlayerConfig(25, 434, 103, 86, EPersonagem.MORDEKAISER.getIcon());

		JButton buttonSonna = new JButton("");
		buttonSonna.addActionListener(e -> jogadorController.selecionarJogador(EPersonagem.SONNA));
		buttonSonna.setIcon(configSonna.icon);
		buttonSonna.setBounds(57, 84, configSonna.width, configSonna.height);
		buttonSonna.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				frame.getContentPane().setComponentZOrder(buttonSonna, 0);
				buttonSonna.repaint();
			}
		});
		frame.getContentPane().add(buttonSonna);

		JButton buttonSeraphine = new JButton("");
		buttonSeraphine.addActionListener(e -> jogadorController.selecionarJogador(EPersonagem.SERAPHINE));
		buttonSeraphine.setIcon(configSeraphine.icon);
		buttonSeraphine.setBounds(57, 181, configSeraphine.width, configSeraphine.height);
		frame.getContentPane().add(buttonSeraphine);

		JButton buttonThresh = new JButton("");
		buttonThresh.addActionListener(e -> jogadorController.selecionarJogador(EPersonagem.THRESH));
		buttonThresh.setIcon(configThresh.icon);
		buttonThresh.setBounds(57, 357, 103, 86);
		frame.getContentPane().add(buttonThresh);

		JButton buttonMordekaiser = new JButton("");
		buttonMordekaiser.addActionListener(e -> jogadorController.selecionarJogador(EPersonagem.MORDEKAISER));
		buttonMordekaiser.setIcon(configMordekaiser.icon);
		buttonMordekaiser.setBounds(57, 453, 103, 86);
		frame.getContentPane().add(buttonMordekaiser);

		JLabel campeaoLabel = new JLabel("CHAMPIONS");
		campeaoLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20));
		campeaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		campeaoLabel.setForeground(Color.WHITE);
		campeaoLabel.setBounds(10, 10, 150, 31);
		frame.getContentPane().add(campeaoLabel);
	}

	private void inicializarRegioesMapa() {
		HashMap<ERegiaoNome, String> nomesRegioes = mapController.getNomesRegioes();
		HashMap<ERegiaoNome, RegiaoConfig> regiaoConfigs = new HashMap<>() {
			{
				put(ERegiaoNome.IONIA, new RegiaoConfig(706, 73, 150, 31, new Font("Kristen ITC", Font.BOLD, 20)));
				put(ERegiaoNome.AGUAS_DE_SENTINA,
						new RegiaoConfig(723, 260, 150, 87, new Font("Kristen ITC", Font.BOLD, 14)));
				put(ERegiaoNome.SHURIMA, new RegiaoConfig(373, 378, 150, 31, new Font("Kristen ITC", Font.BOLD, 20)));
				put(ERegiaoNome.DEMACIA, new RegiaoConfig(228, 203, 150, 31, new Font("Kristen ITC", Font.BOLD, 20)));
				put(ERegiaoNome.FRELJORD, new RegiaoConfig(203, 61, 150, 31, new Font("Kristen ITC", Font.BOLD, 20)));
			}
		};

		regiaoConfigs.forEach((regiaoNome, config) -> {
			JLabel lblRegiao = new JLabel(nomesRegioes.get(regiaoNome));
			lblRegiao.setHorizontalAlignment(SwingConstants.CENTER);
			lblRegiao.setForeground(Color.WHITE);
			lblRegiao.setFont(config.font);
			lblRegiao.setBounds(config.x, config.y, config.width, config.height);
			frame.getContentPane().add(lblRegiao);
		});
	}

	private void inicializarScoreJogador() {
		ArrayList<JTextPane> scores = new ArrayList<JTextPane>();
		pontuacaoJogador1 = new JTextPane();
		pontuacaoJogador1.setText("0");
		pontuacaoJogador1.setFont(new Font("Dialog", Font.BOLD, 20));
		pontuacaoJogador1.setEditable(false);
		pontuacaoJogador1.setBounds(25, 84, 35, 86);
		centralizarScore(pontuacaoJogador1);
		frame.getContentPane().add(pontuacaoJogador1);
		scores.add(pontuacaoJogador1);

		pontuacaoJogador2 = new JTextPane();
		pontuacaoJogador2.setText("0");
		pontuacaoJogador2.setFont(new Font("Dialog", Font.BOLD, 20));
		pontuacaoJogador2.setEditable(false);
		pontuacaoJogador2.setBounds(25, 181, 35, 87);
		centralizarScore(pontuacaoJogador2);
		frame.getContentPane().add(pontuacaoJogador2);
		scores.add(pontuacaoJogador2);

		pontuacaoJogador3 = new JTextPane();
		pontuacaoJogador3.setText("0");
		pontuacaoJogador3.setFont(new Font("Dialog", Font.BOLD, 20));
		pontuacaoJogador3.setEditable(false);
		pontuacaoJogador3.setBounds(25, 357, 35, 86);
		centralizarScore(pontuacaoJogador3);
		frame.getContentPane().add(pontuacaoJogador3);
		scores.add(pontuacaoJogador3);

		pontuacaoJogador4 = new JTextPane();
		pontuacaoJogador4.setText("0");
		pontuacaoJogador4.setFont(new Font("Dialog", Font.BOLD, 20));
		pontuacaoJogador4.setEditable(false);
		pontuacaoJogador4.setBounds(25, 453, 35, 86);
		centralizarScore(pontuacaoJogador4);
		frame.getContentPane().add(pontuacaoJogador4);
		scores.add(pontuacaoJogador4);
	}

	private void centralizarScore(JTextPane pane) {
		StyledDocument doc = pane.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
	}

	private void inicializarFrame() {
		frame = new JFrame();
		frame.setBounds(100, 100, 950, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setResizable(false);
		frame.setForeground(new Color(255, 255, 255));
	}

	private void inicializarBotaoLevel() {
		BotaoRegiao fj4 = new BotaoRegiao();
		BotaoRegiao fj3 = new BotaoRegiao();
		BotaoRegiao fj2 = new BotaoRegiao();
		BotaoRegiao fj1 = new BotaoRegiao();
		BotaoRegiao sh2 = new BotaoRegiao();
		BotaoRegiao io1 = new BotaoRegiao();
		BotaoRegiao dm3 = new BotaoRegiao();
		BotaoRegiao ac5 = new BotaoRegiao();
		BotaoRegiao ac3 = new BotaoRegiao();
		BotaoRegiao ac4 = new BotaoRegiao();
		BotaoRegiao ac2 = new BotaoRegiao();
		BotaoRegiao ac1 = new BotaoRegiao();
		BotaoRegiao dm1 = new BotaoRegiao();
		BotaoRegiao dm2 = new BotaoRegiao();
		BotaoRegiao dm4 = new BotaoRegiao();
		BotaoRegiao dm5 = new BotaoRegiao();
		BotaoRegiao io4 = new BotaoRegiao();
		BotaoRegiao io2 = new BotaoRegiao();
		BotaoRegiao io3 = new BotaoRegiao();
		BotaoRegiao io5 = new BotaoRegiao();
		BotaoRegiao sh5 = new BotaoRegiao();
		BotaoRegiao sh3 = new BotaoRegiao();
		BotaoRegiao sh1 = new BotaoRegiao();
		BotaoRegiao sh4 = new BotaoRegiao();
		BotaoRegiao fj5 = new BotaoRegiao();

		// FREI JORGE
		mapController.configurarBotao(fj1, ERegiaoNome.FRELJORD);
		mapController.configurarBotao(fj2, ERegiaoNome.FRELJORD);
		mapController.configurarBotao(fj3, ERegiaoNome.FRELJORD);
		mapController.configurarBotao(fj4, ERegiaoNome.FRELJORD);
		mapController.configurarBotao(fj5, ERegiaoNome.FRELJORD);

		// IH ONIA
		mapController.configurarBotao(io1, ERegiaoNome.IONIA);
		mapController.configurarBotao(io2, ERegiaoNome.IONIA);
		mapController.configurarBotao(io3, ERegiaoNome.IONIA);
		mapController.configurarBotao(io4, ERegiaoNome.IONIA);
		mapController.configurarBotao(io5, ERegiaoNome.IONIA);

		// SHURIMA SEU IMPERADOR RETORNOU
		mapController.configurarBotao(sh1, ERegiaoNome.SHURIMA);
		mapController.configurarBotao(sh2, ERegiaoNome.SHURIMA);
		mapController.configurarBotao(sh3, ERegiaoNome.SHURIMA);
		mapController.configurarBotao(sh4, ERegiaoNome.SHURIMA);
		mapController.configurarBotao(sh5, ERegiaoNome.SHURIMA);

		// DEMEN... DEMACIA
		mapController.configurarBotao(dm1, ERegiaoNome.DEMACIA);
		mapController.configurarBotao(dm2, ERegiaoNome.DEMACIA);
		mapController.configurarBotao(dm3, ERegiaoNome.DEMACIA);
		mapController.configurarBotao(dm4, ERegiaoNome.DEMACIA);
		mapController.configurarBotao(dm5, ERegiaoNome.DEMACIA);

		// ac
		mapController.configurarBotao(ac1, ERegiaoNome.AGUAS_DE_SENTINA);
		mapController.configurarBotao(ac2, ERegiaoNome.AGUAS_DE_SENTINA);
		mapController.configurarBotao(ac3, ERegiaoNome.AGUAS_DE_SENTINA);
		mapController.configurarBotao(ac4, ERegiaoNome.AGUAS_DE_SENTINA);
		mapController.configurarBotao(ac5, ERegiaoNome.AGUAS_DE_SENTINA);

		fj4.setBounds(240, 135, 35, 35);
		fj5.setBounds(284, 135, 35, 35);
		fj3.setBounds(301, 90, 35, 35);
		fj2.setBounds(258, 90, 35, 35);
		fj1.setBounds(214, 90, 35, 35);
		sh2.setBounds(427, 408, 35, 35);
		sh5.setBounds(451, 453, 35, 35);
		sh3.setBounds(470, 408, 35, 35);
		sh1.setBounds(382, 408, 35, 35);
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

	@Override
	public void atualizarScoreTime(Time time, int newScore) {
		if (time == Time.LUZ) {
			pontuacaoTime1.setText(String.valueOf(newScore));
		} else if (time == Time.SOMBRA) {
			pontuacaoTime2.setText(String.valueOf(newScore));
		}
	}

	@Override
	public void atualizarScoreJogador(JogadorDTO jogador, int newScore) {
		switch (jogador.getPersonagem().getId()) {
		case 1:
			pontuacaoJogador1.setText(String.valueOf(newScore));
			break;
		case 2:
			pontuacaoJogador2.setText(String.valueOf(newScore));
			break;
		case 3:
			pontuacaoJogador3.setText(String.valueOf(newScore));
			break;
		case 4:
			pontuacaoJogador4.setText(String.valueOf(newScore));
			break;
		}
	}
}
