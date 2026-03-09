package jeux_projet;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;
import javax.swing.Timer;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ShiFumi {

	private JFrame frame;
	private JLabel joueur;
	private JLabel ordinateur;
	private JLabel resultOrdi;
	private JToggleButton button_pierre;
	private JToggleButton button_feuille;
	private JToggleButton button_ciseaux;
	private JButton button_shifumi;
	private ButtonGroup choixJoueur;
	private int choixNb;
	private String choixOrdi;
	private String resultShifumi;
	private JLabel vainqueur;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShiFumi window = new ShiFumi();
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
	public ShiFumi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 534, 356);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		joueur = new JLabel("Joueur");
		joueur.setBounds(49, 11, 46, 14);
		frame.getContentPane().add(joueur);

		ordinateur = new JLabel("Ordinateur");
		ordinateur.setBounds(410, 11, 74, 14);
		frame.getContentPane().add(ordinateur);


		resultOrdi = new JLabel("New label");
		resultOrdi.setVisible(false);
		resultOrdi.setBounds(390, 97, 118, 45);
		frame.getContentPane().add(resultOrdi);
		
		vainqueur = new JLabel("New label");
		vainqueur.setVisible(false);
		vainqueur.setBounds(222, 214, 140, 14);
		frame.getContentPane().add(vainqueur);

		button_pierre = new JToggleButton("Pierre");
		button_pierre.setIcon(new ImageIcon("C:\\Users\\GA\\Downloads\\Pierre.png"));
		button_pierre.setBounds(10, 36, 160, 45);
		frame.getContentPane().add(button_pierre);

		button_feuille = new JToggleButton("Feuille");
		button_feuille.setIcon(new ImageIcon("C:\\Users\\GA\\Downloads\\Feuille.jpg"));
		button_feuille.setBounds(10, 97, 160, 45);
		frame.getContentPane().add(button_feuille);

		button_ciseaux = new JToggleButton("Ciseaux");
		button_ciseaux.setIcon(new ImageIcon("C:\\Users\\GA\\Downloads\\Ciseaux.png"));
		button_ciseaux.setBounds(10, 160, 160, 45);
		frame.getContentPane().add(button_ciseaux);

		choixJoueur = new ButtonGroup();
		choixJoueur.add(button_pierre);
		choixJoueur.add(button_feuille);
		choixJoueur.add(button_ciseaux);

		button_pierre.addActionListener(e -> {
			choixNb = 1;
			button_shifumi.setEnabled(true);
		});
		button_feuille.addActionListener(e -> {
			choixNb = 2;
			button_shifumi.setEnabled(true);
		});
		button_ciseaux.addActionListener(e -> {
			choixNb = 3;
			button_shifumi.setEnabled(true);
		});

		button_shifumi = new JButton("SHIFUMI");
		button_shifumi.setEnabled(false);
		button_shifumi.addActionListener(e -> {
			vainqueur.setVisible(false);
			resultOrdi.setVisible(false);
			Timer timer = new Timer(500, new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int nbAlea = (int)(Math.random()*(3))+1;
					System.out.println(nbAlea);
					if (nbAlea == 1) {
						choixOrdi = "Pierre";
						resultOrdi.setIcon(new ImageIcon("C:\\Users\\GA\\Downloads\\Pierre.png"));
					}
					else if (nbAlea == 2) {
						choixOrdi = "Feuille";
						resultOrdi.setIcon(new ImageIcon("C:\\Users\\GA\\Downloads\\Feuille.jpg"));
					}
					else {
						choixOrdi = "Ciseaux";
						resultOrdi.setIcon(new ImageIcon("C:\\Users\\GA\\Downloads\\Ciseaux.png"));
					}
	
					if (choixNb == 1) { // joueur : Pierre
						if (nbAlea == 2) { // ordi : Feuille
							resultShifumi = "Ordinateur vainqueur !";
							vainqueur.setForeground(new Color(255, 0, 0));
						}
						else if (nbAlea == 3) { // ordi : Ciseaux
							resultShifumi = "Joueur vainqueur !";
							vainqueur.setForeground(new Color(0, 255, 0));
						}
						else { // ordi : Pierre
							resultShifumi = "Egalité.";
							vainqueur.setForeground(new Color(0, 0, 0));
						}
					}
					else if (choixNb == 2) { // joueur : Feuille
						if (nbAlea == 3) { // ordi : Ciseaux
							resultShifumi = "Ordinateur vainqueur !";
							vainqueur.setForeground(new Color(255, 0, 0));
						}
						else if (nbAlea == 1) { // ordi : Pierre
							resultShifumi = "Joueur vainqueur !";
							vainqueur.setForeground(new Color(0, 255, 0));
						}
						else { // ordi : Feuille
							resultShifumi = "Egalité.";
							vainqueur.setForeground(new Color(0, 0, 0));
						}
					}
					else { // joueur : Ciseaux
						if (nbAlea == 1) { // ordi : Pierre
							resultShifumi = "Ordinateur vainqueur !";
							vainqueur.setForeground(new Color(255, 0, 0));
						}
						else if (nbAlea == 2) { // ordi : Feuille
							resultShifumi = "Joueur vainqueur !";
							vainqueur.setForeground(new Color(0, 255, 0));
						}
						else { // ordi : Ciseaux
							resultShifumi = "Egalité.";
							vainqueur.setForeground(new Color(0, 0, 0));
						}
					}
					
					resultOrdi.setText(choixOrdi);
					vainqueur.setText(resultShifumi);
					vainqueur.setVisible(true);
					resultOrdi.setVisible(true);
					
					((Timer) e.getSource()).stop();
				}
			});
			timer.setRepeats(false);
			timer.start();
		});
		button_shifumi.setBounds(222, 72, 112, 96);
		frame.getContentPane().add(button_shifumi);
		
		
	}
}

