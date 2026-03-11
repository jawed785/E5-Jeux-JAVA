package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class App5 {

	private JFrame frame;
	private int nbpartie=0;
	private int choix_ordinateur=0;
	private int choix_joueur=0;
	private int score_ordinateur=0;
	private int score_joueur=0;
	private Icon pierre= new ImageIcon("C:\\Users\\GB\\Downloads\\resized_image3_84x84.png");
	private Icon feuille= new ImageIcon("C:\\Users\\GB\\Downloads\\resized_image2_84x84.png");
	private Icon ciseaux= new ImageIcon("C:\\Users\\GB\\Downloads\\resized_image_84x84.png");

	

	/**
	 * Create the application.
	 */
	public App5() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 697, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel_choice_player = new JLabel("");
		lblNewLabel_choice_player.setVisible(false);
		lblNewLabel_choice_player.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_choice_player.setBounds(135, 157, 100, 100);
		frame.getContentPane().add(lblNewLabel_choice_player);

		JLabel lblNewLabel_choice_ordi = new JLabel("");
		lblNewLabel_choice_ordi.setVisible(false);
		lblNewLabel_choice_ordi.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_choice_ordi.setBounds(435, 157, 100, 100);
		frame.getContentPane().add(lblNewLabel_choice_ordi);

		JLabel lblNewLabel_VS = new JLabel("VS");
		lblNewLabel_VS.setVisible(false);
		lblNewLabel_VS.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_VS.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_VS.setBounds(300, 172, 84, 84);
		frame.getContentPane().add(lblNewLabel_VS);

		JLabel lblNewLabel_title = new JLabel("Shifumi");
		lblNewLabel_title.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_title.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_title.setBounds(10, 10, 663, 42);
		frame.getContentPane().add(lblNewLabel_title);
		JLabel lblNewLabel_score = new JLabel("Score");
		JLabel lblNewLabel_subtitle = new JLabel("En combien de manche voulez vous jouez ?");
		lblNewLabel_subtitle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_subtitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_subtitle.setBounds(10, 62, 663, 28);
		frame.getContentPane().add(lblNewLabel_subtitle);

		JButton btnNewButton_3 = new JButton("3");
		JButton btnNewButton_5 = new JButton("5");
		JButton btnNewButton_next = new JButton("Continuer");
		JButton btnNewButton_restart = new JButton("Rejouer ?");
		btnNewButton_restart.setVisible(false);
		JButton btnNewButton_10 = new JButton("10");
		JButton btnNewButton_rock = new JButton("Pierre");
		btnNewButton_rock.setIcon(new ImageIcon("C:\\Users\\GB\\Downloads\\resized_image3_84x84.png")); // CHANGEZ LE PATH EN FONCTION DU PC
		btnNewButton_rock.setVisible(false);
		JButton btnNewButton_paper = new JButton("Feuille");
		btnNewButton_paper.setIcon(new ImageIcon("C:\\Users\\GB\\Downloads\\resized_image2_84x84.png"));
		btnNewButton_paper.setVisible(false);
		JButton btnNewButton_scissors = new JButton("Ciseaux");
		btnNewButton_scissors.setIcon(new ImageIcon("C:\\Users\\GB\\Downloads\\resized_image_84x84.png"));
		btnNewButton_scissors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choix_ordinateur = (int)(Math.random()*(3))+1;

				if(choix_ordinateur==1) {
					lblNewLabel_choice_ordi.setIcon(pierre);
				}
				else if(choix_ordinateur==2) {
					lblNewLabel_choice_ordi.setIcon(feuille);
				}
				else if(choix_ordinateur==3) {
					lblNewLabel_choice_ordi.setIcon(ciseaux);
				}
				choix_joueur=3;
				lblNewLabel_choice_player.setIcon(ciseaux);

				if ((choix_joueur == 1 && choix_ordinateur == 3 ) || (choix_joueur == 2 && choix_ordinateur == 1) || (choix_joueur == 3 && choix_ordinateur == 2) ) {
					score_joueur = score_joueur + 1;
					lblNewLabel_choice_ordi.setVisible(true);
					lblNewLabel_choice_player.setVisible(true);
					lblNewLabel_VS.setVisible(true);
					lblNewLabel_subtitle.setText("Shi Fu Mi !");
					lblNewLabel_score.setText("Vous avez gagné la manche. Score : "+score_joueur+" à "+score_ordinateur+".");
					lblNewLabel_score.setVisible(true);
					btnNewButton_paper.setVisible(false);
					btnNewButton_rock.setVisible(false);
					btnNewButton_scissors.setVisible(false);
					btnNewButton_next.setVisible(true);

				}

				if (choix_joueur == choix_ordinateur) {
					lblNewLabel_choice_ordi.setVisible(true);
					lblNewLabel_choice_player.setVisible(true);
					lblNewLabel_VS.setVisible(true);
					lblNewLabel_subtitle.setText("Shi Fu Mi !");
					lblNewLabel_score.setText("Egalité. Score : "+score_joueur+" à "+score_ordinateur+".");
					lblNewLabel_score.setVisible(true);
					btnNewButton_paper.setVisible(false);
					btnNewButton_rock.setVisible(false);
					btnNewButton_scissors.setVisible(false);
					btnNewButton_next.setVisible(true);

				}

				if ((choix_joueur == 3 && choix_ordinateur == 1 ) || (choix_joueur == 1 && choix_ordinateur == 2) || (choix_joueur == 2 && choix_ordinateur == 3)) {
					score_ordinateur = score_ordinateur + 1;
					lblNewLabel_choice_ordi.setVisible(true);
					lblNewLabel_choice_player.setVisible(true);
					lblNewLabel_VS.setVisible(true);
					lblNewLabel_subtitle.setText("Shi Fu Mi !");
					lblNewLabel_score.setText("Vous avez perdu la manche. Score : "+score_joueur+" à "+score_ordinateur+".");
					lblNewLabel_score.setVisible(true);
					btnNewButton_paper.setVisible(false);
					btnNewButton_rock.setVisible(false);
					btnNewButton_scissors.setVisible(false);
					btnNewButton_next.setVisible(true);

				}
			}
		});
		btnNewButton_scissors.setVisible(false);
		btnNewButton_next.setVisible(false);
		btnNewButton_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (score_joueur==nbpartie || score_ordinateur==nbpartie) {
					lblNewLabel_choice_ordi.setVisible(false);
					lblNewLabel_choice_player.setVisible(false);
					lblNewLabel_VS.setVisible(false);
					btnNewButton_next.setVisible(false);
					btnNewButton_restart.setVisible(true);
					lblNewLabel_subtitle.setText("Partie terminé !");
					if (score_joueur>score_ordinateur) {
						lblNewLabel_score.setText("Bravo ! Vous avez gagné "+ score_joueur+" à "+ score_ordinateur);
					}
					else {
						lblNewLabel_score.setText("Dommage ... Vous avez perdu "+ score_joueur+" à "+ score_ordinateur);
					}
				}
				else {
					lblNewLabel_choice_ordi.setVisible(false);
					lblNewLabel_choice_player.setVisible(false);
					lblNewLabel_VS.setVisible(false);
					btnNewButton_next.setVisible(false);
					lblNewLabel_score.setVisible(false);
					btnNewButton_paper.setVisible(true);
					btnNewButton_rock.setVisible(true);
					btnNewButton_scissors.setVisible(true);
					lblNewLabel_subtitle.setText("Faites votre choix :");

				}

			}
		});



		lblNewLabel_score.setVisible(false);
		btnNewButton_rock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				choix_ordinateur = (int)(Math.random()*(3))+1;

				if(choix_ordinateur==1) {
					lblNewLabel_choice_ordi.setIcon(pierre);
				}
				else if(choix_ordinateur==2) {
					lblNewLabel_choice_ordi.setIcon(feuille);
				}
				else if(choix_ordinateur==3) {
					lblNewLabel_choice_ordi.setIcon(ciseaux);
				}
				choix_joueur=1;
				lblNewLabel_choice_player.setIcon(pierre);


				if ((choix_joueur == 1 && choix_ordinateur == 3 ) || (choix_joueur == 2 && choix_ordinateur == 1) || (choix_joueur == 3 && choix_ordinateur == 2) ) {
					score_joueur = score_joueur + 1;
					lblNewLabel_choice_ordi.setVisible(true);
					lblNewLabel_choice_player.setVisible(true);
					lblNewLabel_VS.setVisible(true);
					lblNewLabel_subtitle.setText("Shi Fu Mi !");
					lblNewLabel_score.setText("Vous avez gagné la manche. Score : "+score_joueur+" à "+score_ordinateur+".");
					lblNewLabel_score.setVisible(true);
					btnNewButton_paper.setVisible(false);
					btnNewButton_rock.setVisible(false);
					btnNewButton_scissors.setVisible(false);
					btnNewButton_next.setVisible(true);

				}

				if (choix_joueur == choix_ordinateur) {
					lblNewLabel_choice_ordi.setVisible(true);
					lblNewLabel_choice_player.setVisible(true);
					lblNewLabel_VS.setVisible(true);
					lblNewLabel_subtitle.setText("Shi Fu Mi !");
					lblNewLabel_score.setText("Egalité. Score : "+score_joueur+" à "+score_ordinateur+".");
					lblNewLabel_score.setVisible(true);
					btnNewButton_paper.setVisible(false);
					btnNewButton_rock.setVisible(false);
					btnNewButton_scissors.setVisible(false);
					btnNewButton_next.setVisible(true);

				}

				if ((choix_joueur == 3 && choix_ordinateur == 1 ) || (choix_joueur == 1 && choix_ordinateur == 2) || (choix_joueur == 2 && choix_ordinateur == 3)) {
					score_ordinateur = score_ordinateur + 1;
					lblNewLabel_choice_ordi.setVisible(true);
					lblNewLabel_choice_player.setVisible(true);
					lblNewLabel_VS.setVisible(true);
					lblNewLabel_subtitle.setText("Shi Fu Mi !");
					lblNewLabel_score.setText("Vous avez perdu la manche. Score : "+score_joueur+" à "+score_ordinateur+".");
					lblNewLabel_score.setVisible(true);
					btnNewButton_paper.setVisible(false);
					btnNewButton_rock.setVisible(false);
					btnNewButton_scissors.setVisible(false);
					btnNewButton_next.setVisible(true);

				}




			}

		});
		lblNewLabel_score.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_score.setBounds(10, 282, 663, 28);
		frame.getContentPane().add(lblNewLabel_score);

		btnNewButton_rock.setBounds(150, 134, 84, 84);
		frame.getContentPane().add(btnNewButton_rock);
		btnNewButton_paper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choix_ordinateur = (int)(Math.random()*(3))+1;

				if(choix_ordinateur==1) {
					lblNewLabel_choice_ordi.setIcon(pierre);
				}
				else if(choix_ordinateur==2) {
					lblNewLabel_choice_ordi.setIcon(feuille);
				}
				else if(choix_ordinateur==3) {
					lblNewLabel_choice_ordi.setIcon(ciseaux);
				}
				choix_joueur=2;
				lblNewLabel_choice_player.setIcon(feuille);


				if ((choix_joueur == 1 && choix_ordinateur == 3 ) || (choix_joueur == 2 && choix_ordinateur == 1) || (choix_joueur == 3 && choix_ordinateur == 2) ) {
					score_joueur = score_joueur + 1;
					lblNewLabel_choice_ordi.setVisible(true);
					lblNewLabel_choice_player.setVisible(true);
					lblNewLabel_VS.setVisible(true);
					lblNewLabel_subtitle.setText("Shi Fu Mi !");
					lblNewLabel_score.setText("Vous avez gagné la manche. Score : "+score_joueur+" à "+score_ordinateur+".");
					lblNewLabel_score.setVisible(true);
					btnNewButton_paper.setVisible(false);
					btnNewButton_rock.setVisible(false);
					btnNewButton_scissors.setVisible(false);
					btnNewButton_next.setVisible(true);

				}

				if (choix_joueur == choix_ordinateur) {
					lblNewLabel_choice_ordi.setVisible(true);
					lblNewLabel_choice_player.setVisible(true);
					lblNewLabel_VS.setVisible(true);
					lblNewLabel_subtitle.setText("Shi Fu Mi !");
					lblNewLabel_score.setText("Egalité. Score : "+score_joueur+" à "+score_ordinateur+".");
					lblNewLabel_score.setVisible(true);
					btnNewButton_paper.setVisible(false);
					btnNewButton_rock.setVisible(false);
					btnNewButton_scissors.setVisible(false);
					btnNewButton_next.setVisible(true);

				}

				if ((choix_joueur == 3 && choix_ordinateur == 1 ) || (choix_joueur == 1 && choix_ordinateur == 2) || (choix_joueur == 2 && choix_ordinateur == 3)) {
					score_ordinateur = score_ordinateur + 1;
					lblNewLabel_choice_ordi.setVisible(true);
					lblNewLabel_choice_player.setVisible(true);
					lblNewLabel_VS.setVisible(true);
					lblNewLabel_subtitle.setText("Shi Fu Mi !");
					lblNewLabel_score.setText("Vous avez perdu la manche. Score : "+score_joueur+" à "+score_ordinateur+".");
					lblNewLabel_score.setVisible(true);
					btnNewButton_paper.setVisible(false);
					btnNewButton_rock.setVisible(false);
					btnNewButton_scissors.setVisible(false);
					btnNewButton_next.setVisible(true);

				}
			}
		});
		btnNewButton_paper.setBounds(300, 134, 84, 84);
		frame.getContentPane().add(btnNewButton_paper);
		btnNewButton_scissors.setBounds(450, 134, 84, 84);
		frame.getContentPane().add(btnNewButton_scissors);
		btnNewButton_next.setBounds(278, 253, 132, 20);
		frame.getContentPane().add(btnNewButton_next);


		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbpartie=3;
				lblNewLabel_subtitle.setText("Faites votre choix :");
				btnNewButton_3.setVisible(false);
				btnNewButton_5.setVisible(false);
				btnNewButton_10.setVisible(false);
				btnNewButton_rock.setVisible(true);
				btnNewButton_paper.setVisible(true);
				btnNewButton_scissors.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(150, 134, 84, 84);
		frame.getContentPane().add(btnNewButton_3);


		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbpartie=5;
				lblNewLabel_subtitle.setText("Faites votre choix :");
				btnNewButton_3.setVisible(false);
				btnNewButton_5.setVisible(false);
				btnNewButton_10.setVisible(false);
				btnNewButton_rock.setVisible(true);
				btnNewButton_paper.setVisible(true);
				btnNewButton_scissors.setVisible(true);
			}
		});
		btnNewButton_5.setForeground(Color.RED);
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_5.setBounds(300, 134, 84, 84);
		frame.getContentPane().add(btnNewButton_5);


		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbpartie=10;
				lblNewLabel_subtitle.setText("Faites votre choix :");
				btnNewButton_3.setVisible(false);
				btnNewButton_5.setVisible(false);
				btnNewButton_10.setVisible(false);
				btnNewButton_rock.setVisible(true);
				btnNewButton_paper.setVisible(true);
				btnNewButton_scissors.setVisible(true);


			}
		});
		btnNewButton_10.setForeground(Color.RED);
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_10.setBounds(450, 134, 84, 84);
		frame.getContentPane().add(btnNewButton_10);


		btnNewButton_restart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score_joueur=0;
				score_ordinateur=0;
				nbpartie=0;
				btnNewButton_restart.setVisible(false);

				btnNewButton_3.setVisible(true);
				btnNewButton_5.setVisible(true);
				btnNewButton_10.setVisible(true);
				lblNewLabel_score.setVisible(false);
				lblNewLabel_subtitle.setText("En combien de manche voulez vous jouez ?");



			}
		});
		btnNewButton_restart.setBounds(278, 154, 132, 44);
		frame.getContentPane().add(btnNewButton_restart);
		
		JButton btnAccueil = new JButton("Retour à l'accueil");
		btnAccueil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				view_jeux view_jeux = new view_jeux();
			}
		});
		btnAccueil.setBounds(10, 326, 192, 20);
		frame.getContentPane().add(btnAccueil);
	


	}
}