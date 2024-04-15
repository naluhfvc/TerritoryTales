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
		
		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					btn4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					btn4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					btn4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					btn4.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		
		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					btn3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					btn3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					btn3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					btn3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		
		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					btn2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					btn2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					btn2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					btn2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		
				
		JButton btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					btn1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					btn1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					btn1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					btn1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		btn1.setBounds(214, 90, 60, 60);
		frame.getContentPane().add(btn1);
		btn2.setBounds(275, 90, 60, 60);
		frame.getContentPane().add(btn2);
		btn3.setBounds(336, 90, 60, 60);
		frame.getContentPane().add(btn3);
		btn4.setBounds(397, 90, 60, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (personagem == 1) {
					btn5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
				}
				else if (personagem == 2) {
					btn5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
				}
				else if (personagem == 3) {
					btn5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
				}
				else if (personagem == 4) {
					btn5.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\MordekaiserIcon.png"));
				}
			}
		});
		btn5.setBounds(458, 90, 60, 60);
		frame.getContentPane().add(btn5);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(170, 0, 766, 573);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\jonas\\Downloads\\RuneTerraMap.png"));
		frame.getContentPane().add(lblNewLabel);
		
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
		
		JLabel lblNewLabel_4 = new JLabel("CHAMPIONS");
		lblNewLabel_4.setFont(new Font("Kristen ITC", Font.BOLD, 20));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(10, 20, 150, 31);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
