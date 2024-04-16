package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class Map {

	private JFrame frame;
	private int personagem = 0;

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
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jonas\\Downloads\\iconLol.png"));
		frame.setBounds(100, 100, 950, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton fj4 = new JButton("");
		fj4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					fj4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					fj4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					fj4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					fj4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		
		JButton fj3 = new JButton("");
		fj3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					fj3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					fj3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					fj3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					fj3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		
		JButton fj2 = new JButton("");
		fj2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					fj2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					fj2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					fj2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					fj2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		
				
		JButton fj1 = new JButton("");
		fj1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					fj1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					fj1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					fj1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					fj1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		
		JButton sh2 = new JButton("");
		sh2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					sh2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					sh2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					sh2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					sh2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		
		JButton io1 = new JButton("");
		io1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					io1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					io1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					io1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					io1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		
		JButton dm3 = new JButton("");
		dm3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					dm3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					dm3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					dm3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					dm3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		
		JButton ac5 = new JButton("");
		ac5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					ac5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					ac5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					ac5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					ac5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		
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
		ac3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					ac3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					ac3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					ac3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					ac3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		ac3.setBounds(779, 336, 35, 35);
		frame.getContentPane().add(ac3);
		
		JButton ac4 = new JButton("");
		ac4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					ac4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					ac4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					ac4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					ac4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		ac4.setBounds(821, 336, 35, 35);
		frame.getContentPane().add(ac4);
		
		JButton ac2 = new JButton("");
		ac2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					ac2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					ac2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					ac2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					ac2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		ac2.setBounds(736, 336, 35, 35);
		frame.getContentPane().add(ac2);
		
		JButton ac1 = new JButton("");
		ac1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					ac1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					ac1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					ac1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					ac1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		ac1.setBounds(762, 381, 35, 35);
		frame.getContentPane().add(ac1);
		dm3.setBounds(327, 233, 35, 35);
		frame.getContentPane().add(dm3);
		
		JButton dm1 = new JButton("");
		dm1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					dm1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					dm1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					dm1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					dm1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		dm1.setBounds(240, 233, 35, 35);
		frame.getContentPane().add(dm1);
		
		JButton dm2 = new JButton("");
		dm2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					dm2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					dm2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					dm2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					dm2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		dm2.setBounds(284, 233, 35, 35);
		frame.getContentPane().add(dm2);
		
		JButton dm4 = new JButton("");
		dm4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					dm4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					dm4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					dm4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					dm4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		dm4.setBounds(258, 278, 35, 35);
		frame.getContentPane().add(dm4);
		
		JButton dm5 = new JButton("");
		dm5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					dm5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					dm5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					dm5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					dm5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		dm5.setBounds(303, 278, 35, 35);
		frame.getContentPane().add(dm5);
		io1.setBounds(746, 148, 35, 35);
		frame.getContentPane().add(io1);
		
		JButton io4 = new JButton("");
		io4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					io4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					io4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					io4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					io4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		io4.setBounds(807, 103, 35, 35);
		frame.getContentPane().add(io4);
		
		JButton io2 = new JButton("");
		io2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					io2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					io2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					io2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					io2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
			}
		);
		io2.setBounds(719, 103, 35, 35);
		frame.getContentPane().add(io2);
		
		JButton io3 = new JButton("");
		io3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					io3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					io3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					io3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					io3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		io3.setBounds(762, 103, 35, 35);
		frame.getContentPane().add(io3);
		
		JButton io5 = new JButton("");
		io5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					io5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					io5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					io5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					io5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		io5.setBounds(789, 148, 35, 35);
		frame.getContentPane().add(io5);
		sh2.setBounds(427, 408, 35, 35);
		frame.getContentPane().add(sh2);
		
		JButton sh5 = new JButton("");
		sh5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					sh5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					sh5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					sh5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					sh5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		sh5.setBounds(451, 453, 35, 35);
		frame.getContentPane().add(sh5);
		
		JButton sh3 = new JButton("");
		sh3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					sh3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					sh3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					sh3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					sh3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		sh3.setBounds(470, 408, 35, 35);
		frame.getContentPane().add(sh3);
		
		JButton sh1 = new JButton("");
		sh1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					sh1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					sh1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					sh1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					sh1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		sh1.setBounds(383, 408, 35, 35);
		frame.getContentPane().add(sh1);
		
		JButton sh4 = new JButton("");
		sh4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					sh4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					sh4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					sh4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					sh4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
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
		fj5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					fj5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					fj5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					fj5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					fj5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		fj5.setBounds(284, 135, 35, 35);
		frame.getContentPane().add(fj5);
		
		
		JLabel mapa = new JLabel("New label");
		mapa.setBounds(170, 0, 766, 573);
		mapa.setHorizontalAlignment(SwingConstants.CENTER);
		mapa.setIcon(new ImageIcon("C:\\Users\\jonas\\Downloads\\RuneTerraMap.png"));
		frame.getContentPane().add(mapa);
		
		JButton lblNewLabel_1 = new JButton("");
		lblNewLabel_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				personagem = 1;
				
			}
			
		});
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
		lblNewLabel_1.setBounds(25, 70, 120, 100);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton lblNewLabel_2 = new JButton("");
		lblNewLabel_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem = 2;
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
		lblNewLabel_2.setBounds(25, 189, 120, 100);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton lblNewLabel_3 = new JButton("");
		lblNewLabel_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem = 3;
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
		lblNewLabel_3.setBounds(25, 330, 120, 100);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton label = new JButton("");
		label.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem = 4;
			}
		});
		label.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
		label.setBounds(25, 453, 120, 100);
		frame.getContentPane().add(label);
		
		JLabel campeaoLabel = new JLabel("CHAMPIONS");
		campeaoLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20));
		campeaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		campeaoLabel.setForeground(new Color(255, 255, 255));
		campeaoLabel.setBounds(10, 20, 150, 31);
		frame.getContentPane().add(campeaoLabel);
	}
}
