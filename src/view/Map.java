package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import model.TipoPersonagem;

public class Map {

	private JFrame frame;
	private TipoPersonagem personagemSelecionado;

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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setResizable(false);
		frame.setForeground(new Color(255, 255, 255));
		
		URL iconURL = Map.class.getResource("/images/iconLol.png");
		if (iconURL != null) {
		    frame.setIconImage(new ImageIcon(iconURL).getImage());
		} else {
		    System.err.println("Não foi possível carregar o ícone do frame: /images/iconLol.png");
		}

		frame.setBounds(100, 100, 950, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton fj4 = new JButton("");
		fj4.addActionListener(e -> atualizarIcone(fj4));
		
		JButton fj3 = new JButton("");
		fj3.addActionListener(e -> atualizarIcone(fj3));
		
		JButton fj2 = new JButton("");
		fj2.addActionListener(e -> atualizarIcone(fj2));
		
		JButton fj1 = new JButton("");
		fj1.addActionListener(e -> atualizarIcone(fj1));
		
		JButton sh2 = new JButton("");
		sh2.addActionListener(e -> atualizarIcone(sh2));
		
		JButton io1 = new JButton("");
		io1.addActionListener(e -> atualizarIcone(io1));
		
		JButton dm3 = new JButton("");
		dm3.addActionListener(e -> atualizarIcone(dm3));
		
		JButton ac5 = new JButton("");
		ac5.addActionListener(e -> atualizarIcone(ac5));
		
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
		ac5.setBounds(807, 381, 35, 35);
		frame.getContentPane().add(ac5);
		
		JButton ac3 = new JButton("");
		ac3.addActionListener(e -> atualizarIcone(ac3));
		
		ac3.setBounds(779, 336, 35, 35);
		frame.getContentPane().add(ac3);
		
		JButton ac4 = new JButton("");
		ac4.addActionListener(e -> atualizarIcone(ac4));
		
		ac4.setBounds(821, 336, 35, 35);
		frame.getContentPane().add(ac4);
		
		JButton ac2 = new JButton("");
		ac2.addActionListener(e -> atualizarIcone(ac2));
		
		ac2.setBounds(736, 336, 35, 35);
		frame.getContentPane().add(ac2);
		
		JButton ac1 = new JButton("");
		ac2.addActionListener(e -> atualizarIcone(ac2));
		
		ac1.setBounds(762, 381, 35, 35);
		frame.getContentPane().add(ac1);
		dm3.setBounds(327, 233, 35, 35);
		frame.getContentPane().add(dm3);
		
		JButton dm1 = new JButton("");
		dm1.addActionListener(e -> atualizarIcone(dm1));
		
		dm1.setBounds(240, 233, 35, 35);
		frame.getContentPane().add(dm1);
		
		JButton dm2 = new JButton("");
		dm2.addActionListener(e -> atualizarIcone(dm2));
		
		dm2.setBounds(284, 233, 35, 35);
		frame.getContentPane().add(dm2);
		
		JButton dm4 = new JButton("");
		dm4.addActionListener(e -> atualizarIcone(dm4));
		
		dm4.setBounds(258, 278, 35, 35);
		frame.getContentPane().add(dm4);
		
		JButton dm5 = new JButton("");
		dm5.addActionListener(e -> atualizarIcone(dm5));
		
		dm5.setBounds(303, 278, 35, 35);
		frame.getContentPane().add(dm5);
		io1.setBounds(746, 148, 35, 35);
		frame.getContentPane().add(io1);
		
		JButton io4 = new JButton("");
		io4.addActionListener(e -> atualizarIcone(io4));
		
		io4.setBounds(807, 103, 35, 35);
		frame.getContentPane().add(io4);
		
		JButton io2 = new JButton("");
		io2.addActionListener(e -> atualizarIcone(io2));
		
		io2.setBounds(719, 103, 35, 35);
		frame.getContentPane().add(io2);
		
		JButton io3 = new JButton("");
		io3.addActionListener(e -> atualizarIcone(io3));
		
		io3.setBounds(762, 103, 35, 35);
		frame.getContentPane().add(io3);
		
		JButton io5 = new JButton("");
		io5.addActionListener(e -> atualizarIcone(io5));
		
		io5.setBounds(789, 148, 35, 35);
		frame.getContentPane().add(io5);
		sh2.setBounds(427, 408, 35, 35);
		frame.getContentPane().add(sh2);
		
		JButton sh5 = new JButton("");
		sh5.addActionListener(e -> atualizarIcone(sh5));
		
		sh5.setBounds(451, 453, 35, 35);
		frame.getContentPane().add(sh5);
		
		JButton sh3 = new JButton("");
		sh3.addActionListener(e -> atualizarIcone(sh3));
		
		sh3.setBounds(470, 408, 35, 35);
		frame.getContentPane().add(sh3);
		
		JButton sh1 = new JButton("");
		sh1.addActionListener(e -> atualizarIcone(sh1));
		
		sh1.setBounds(383, 408, 35, 35);
		frame.getContentPane().add(sh1);
		
		JButton sh4 = new JButton("");
		sh4.addActionListener(e -> atualizarIcone(sh4));
		
		sh4.setBounds(406, 453, 35, 35);
		frame.getContentPane().add(sh4);
		fj1.setBounds(214, 90, 35, 35);
		frame.getContentPane().add(fj1);
		fj2.setBounds(258, 90, 35, 35);
		frame.getContentPane().add(fj2);
		fj3.setBounds(301, 90, 35, 35);
		frame.getContentPane().add(fj3);
		fj4.setBounds(240, 135, 35, 35);
		frame.getContentPane().add(fj4);
		
		JButton fj5 = new JButton("");
		fj5.addActionListener(e -> atualizarIcone(fj5));
		
		fj5.setBounds(284, 135, 35, 35);
		frame.getContentPane().add(fj5);
		
		
		JLabel mapa = new JLabel("New label");
		mapa.setBounds(170, 0, 766, 573);
		mapa.setHorizontalAlignment(SwingConstants.CENTER);
		mapa.setIcon(new ImageIcon("C:\\Users\\jonas\\Downloads\\RuneTerraMap.png"));
		frame.getContentPane().add(mapa);
		
		JButton lblNewLabel_1 = new JButton("");
		lblNewLabel_1.addActionListener(e -> personagemSelecionado = TipoPersonagem.SONNA);
		lblNewLabel_1.setIcon(TipoPersonagem.SONNA.getIcon());
		lblNewLabel_1.setBounds(25, 70, 120, 100);
		frame.getContentPane().add(lblNewLabel_1);

		JButton lblNewLabel_2 = new JButton("");
		lblNewLabel_2.addActionListener(e -> personagemSelecionado = TipoPersonagem.SERAPHINE);
		lblNewLabel_2.setIcon(TipoPersonagem.SERAPHINE.getIcon());
		lblNewLabel_2.setBounds(25, 189, 120, 100);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton lblNewLabel_3 = new JButton("");
		lblNewLabel_3.addActionListener(e -> personagemSelecionado = TipoPersonagem.THRESH);
		lblNewLabel_3.setIcon(TipoPersonagem.THRESH.getIcon());
		lblNewLabel_3.setBounds(25, 330, 120, 100);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton lblNewLabel_4 = new JButton("");
		lblNewLabel_4.addActionListener(e -> personagemSelecionado = TipoPersonagem.MORDEKAISER);
		lblNewLabel_4.setIcon(TipoPersonagem.MORDEKAISER.getIcon());
		lblNewLabel_4.setBounds(25, 453, 120, 100);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel campeaoLabel = new JLabel("CHAMPIONS");
		campeaoLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20));
		campeaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		campeaoLabel.setForeground(new Color(255, 255, 255));
		campeaoLabel.setBounds(10, 20, 150, 31);
		frame.getContentPane().add(campeaoLabel);
	}
	
	private void atualizarIcone(JButton botao) {
	    if (personagemSelecionado != null) {
	    	// Tamanho do botão para redimensionamento
	    	int largura = botao.getWidth();
	    	int altura = botao.getHeight();
	    	ImageIcon iconePersonagem = personagemSelecionado.getIcon();
	    	
	    	ImageIcon iconeRedimensionado = redimensionarImagem(iconePersonagem, largura, altura);
	        botao.setIcon(iconeRedimensionado);
	        personagemSelecionado = null;
	    }
	}
	
	private ImageIcon redimensionarImagem(ImageIcon icon, int largura, int altura) {
	    Image imagem = icon.getImage();
	    Image novaImg = imagem.getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
	    return new ImageIcon(novaImg);
	}
}
