package view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.Printable;
import java.awt.event.ActionEvent;

public class App3 {

	private JFrame frame;
	private JTextField textFieldguess;
	private int target = (int)(Math.random()*(100-0))+0;
	private int guess=0;
	private int nbtenta=0;
	

	/**
	 * Create the application.
	 */
	public App3() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 707, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textFieldguess = new JTextField();
		textFieldguess.setBounds(168, 124, 96, 18);
		frame.getContentPane().add(textFieldguess);
		textFieldguess.setColumns(10);

		JLabel lblNewLabeldevine = new JLabel("Devine le nombre :");
		lblNewLabeldevine.setBounds(42, 127, 116, 12);
		frame.getContentPane().add(lblNewLabeldevine);

		JLabel lblNewLabeltentative = new JLabel("nombre tentative :");
		lblNewLabeltentative.setBounds(325, 168, 129, 12);
		frame.getContentPane().add(lblNewLabeltentative);

		JLabel lblNewLabelnbtentative = new JLabel("0");
		lblNewLabelnbtentative.setBounds(482, 168, 44, 12);
		frame.getContentPane().add(lblNewLabelnbtentative);

		JLabel lblNewLabelretour = new JLabel("");
		lblNewLabelretour.setBounds(117, 264, 337, 28);
		frame.getContentPane().add(lblNewLabelretour);
		JButton btnNewButtonrestart = new JButton("Rejouer ?");
		JButton btnNewButtontry = new JButton("?");
		btnNewButtontry.setToolTipText("");
		btnNewButtontry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((textFieldguess.getText()).equals("")) {
					lblNewLabelretour.setText("Veuillez rentrez votre choix de nombre dans la zone de texte");
				}
				else {
					
					guess = Integer.parseInt(textFieldguess.getText());
					if (guess==target) {
						nbtenta = Integer.parseInt(lblNewLabelnbtentative.getText());
						nbtenta++;
						lblNewLabelnbtentative.setText(String.valueOf(nbtenta));
						lblNewLabelretour.setText("Trouvé ! la cible était bien : "+target);
						btnNewButtontry.setVisible(false);
						lblNewLabeldevine.setVisible(false);
						textFieldguess.setVisible(false);
						btnNewButtonrestart.setVisible(true);
						

					}
					else if(guess<target) {
						nbtenta = Integer.parseInt(lblNewLabelnbtentative.getText());
						nbtenta++;
						lblNewLabelnbtentative.setText(String.valueOf(nbtenta));
						lblNewLabelretour.setText("Trop petit ! Réessayez");
					}
					else if (guess>target) {
						nbtenta = Integer.parseInt(lblNewLabelnbtentative.getText());
						nbtenta++;
						lblNewLabelnbtentative.setText(String.valueOf(nbtenta));
						lblNewLabelretour.setText("Trop grand ! Réessayez");
				}
				

				}


			}
		});
		btnNewButtontry.setBounds(168, 152, 96, 102);
		frame.getContentPane().add(btnNewButtontry);
		
		
		btnNewButtonrestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				target = (int)(Math.random()*(100-0))+0;
				System.out.println(target);
				nbtenta =0;
				lblNewLabelnbtentative.setText(String.valueOf(nbtenta));
				lblNewLabeldevine.setVisible(true);
				btnNewButtontry.setVisible(true);
				textFieldguess.setVisible(true);
				btnNewButtonrestart.setVisible(false);
				
				
			}
		});
		btnNewButtonrestart.setBounds(168, 164, 96, 20);
		frame.getContentPane().add(btnNewButtonrestart);
		
		JButton btnAccueil = new JButton("Retour à l'accueil");
		btnAccueil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				view_jeux view_jeux = new view_jeux();
			}
		});
		btnAccueil.setBounds(10, 371, 192, 20);
		frame.getContentPane().add(btnAccueil);
	}
}