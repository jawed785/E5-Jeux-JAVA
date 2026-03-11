package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controller.mainMVC;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class view_jeux {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view_jeux window = new view_jeux();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws InterruptedException 
	 */
	public view_jeux() {
		
	
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 796, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Bienvenue sur votre Application de Jeux en JAVA !");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(10, 10, 762, 45);
		frame.getContentPane().add(lblTitle);
		
		JLabel lblSubTitle = new JLabel("Veuillez sélectionnez un jeu au choix :");
		lblSubTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubTitle.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblSubTitle.setBounds(10, 65, 762, 29);
		frame.getContentPane().add(lblSubTitle);
		
		JButton btnDevine = new JButton("Devine Nombre !");
		btnDevine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				App3 viewapp3 = new App3();
			}
		});
		btnDevine.setBounds(41, 153, 150, 125);
		frame.getContentPane().add(btnDevine);
		
		JButton btnCalculatrice = new JButton("Calculatrice");
		btnCalculatrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				App4 viewapp4 = new App4();
			}
		});
		btnCalculatrice.setBounds(236, 153, 150, 125);
		frame.getContentPane().add(btnCalculatrice);
		
		JButton btnShifumi = new JButton("Shifumi");
		btnShifumi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				App5 viewapp5 = new App5();
			}
		});
		btnShifumi.setBounds(434, 153, 150, 125);
		frame.getContentPane().add(btnShifumi);
		
		JButton btnBatailleNavale = new JButton("BatailleNavale");
		btnBatailleNavale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exo_Bataille_Navale newgame = new Exo_Bataille_Navale();
				
			}
		});
		btnBatailleNavale.setBounds(622, 153, 150, 125);
		frame.getContentPane().add(btnBatailleNavale);
		
		JButton btnCalculatrice_1 = new JButton("Calculatrice");
		btnCalculatrice_1.setBounds(331, 338, 150, 125);
		frame.getContentPane().add(btnCalculatrice_1);
		
		JButton btnDevine_1 = new JButton("Devine Nombre !");
		btnDevine_1.setBounds(136, 338, 150, 125);
		frame.getContentPane().add(btnDevine_1);
		
		JButton btnShifumi_1 = new JButton("Shifumi");
		btnShifumi_1.setBounds(529, 338, 150, 125);
		frame.getContentPane().add(btnShifumi_1);
		
		JLabel lblMateo = new JLabel("Version Matéo :");
		lblMateo.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblMateo.setHorizontalAlignment(SwingConstants.CENTER);
		lblMateo.setBounds(10, 304, 762, 12);
		frame.getContentPane().add(lblMateo);
		
		JLabel lblBenjamin = new JLabel("Version Benjamin :");
		lblBenjamin.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblBenjamin.setHorizontalAlignment(SwingConstants.CENTER);
		lblBenjamin.setBounds(10, 104, 762, 12);
		frame.getContentPane().add(lblBenjamin);
	}
}