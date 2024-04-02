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

public class Map {

	private JFrame frame;

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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(170, 0, 766, 573);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\jonas\\Downloads\\RuneTerraMap.png"));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SonnaIcon.png"));
		lblNewLabel_1.setBounds(25, 70, 120, 100);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\SeraphineIcon.png"));
		lblNewLabel_2.setBounds(25, 189, 120, 100);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\jonas\\OneDrive\\Documentos\\TerritoryTales\\src\\image\\ThreshIcon.png"));
		lblNewLabel_3.setBounds(25, 330, 120, 100);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel label = new JLabel("");
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
