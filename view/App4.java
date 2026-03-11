package view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class App4 {

	private JFrame frame;
	private String nb1="";
	private String nb2="";
	private String restext="";
	private int next=0;
	private int ope;
	private Float calc1 = (float) 0;
	private Float calc2 = (float) 0;
	private Float res = (float) 0;
	

	

	/**
	 * Create the application.
	 */
	public App4() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblres = new JLabel("");
		lblres.setHorizontalAlignment(SwingConstants.CENTER);
		lblres.setBounds(10, 10, 405, 25);
		frame.getContentPane().add(lblres);

		JLabel labelnb1 = new JLabel("");
		labelnb1.setBackground(Color.LIGHT_GRAY);
		labelnb1.setBounds(10, 10, 84, 25);
		frame.getContentPane().add(labelnb1);

		JLabel labelnb2 = new JLabel("");
		labelnb2.setBackground(new Color(192, 192, 192));
		labelnb2.setBounds(250, 10, 176, 25);
		frame.getContentPane().add(labelnb2);

		JLabel lblNewLabel_ope = new JLabel("");
		lblNewLabel_ope.setBounds(196, 10, 44, 33);
		frame.getContentPane().add(lblNewLabel_ope);

		JButton btnNewButton7 = new JButton("7");
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (next==0) {
					nb1=nb1 + "7";
					labelnb1.setText(nb1);
				}
				else {
					nb2=nb2+"7";
					labelnb2.setText(nb2);
				}
			}
		});
		btnNewButton7.setBounds(10, 45, 84, 78);
		frame.getContentPane().add(btnNewButton7);

		JButton btnNewButton4 = new JButton("4");
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (next==0) {
					nb1=nb1 + "4";
					labelnb1.setText(nb1);
				}
				else {
					nb2=nb2+"4";
					labelnb2.setText(nb2);
				}
			}
		});
		btnNewButton4.setBounds(10, 133, 84, 78);
		frame.getContentPane().add(btnNewButton4);

		JButton btnNewButton1 = new JButton("1");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (next==0) {
					nb1=nb1 + "1";
					labelnb1.setText(nb1);
				}
				else {
					nb2=nb2+"1";
					labelnb2.setText(nb2);
				}
			}
		});
		btnNewButton1.setBounds(10, 221, 84, 78);
		frame.getContentPane().add(btnNewButton1);

		JButton btnNewButton0 = new JButton("0");
		btnNewButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(next==0){
					if (!(nb1.equalsIgnoreCase(""))) {
						nb1=nb1 + "0";
						labelnb1.setText(nb1);
					}
	
				}
				if(next==1){
					if (!(nb2.equalsIgnoreCase(""))) {
						nb2=nb2 + "0";
						labelnb2.setText(nb2);
					}
	
				}

			}
		});
		btnNewButton0.setBounds(10, 309, 84, 78);
		frame.getContentPane().add(btnNewButton0);

		JButton btnNewButton8 = new JButton("8");
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (next==0) {
					nb1=nb1 + "8";
					labelnb1.setText(nb1);
				}
				else {
					nb2=nb2+"8";
					labelnb2.setText(nb2);
				}
			}
		});
		btnNewButton8.setBounds(118, 45, 84, 78);
		frame.getContentPane().add(btnNewButton8);

		JButton btnNewButton5 = new JButton("5");
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (next==0) {
					nb1=nb1 + "5";
					labelnb1.setText(nb1);
				}
				else {
					nb2=nb2+"5";
					labelnb2.setText(nb2);
				}
			}
		});
		btnNewButton5.setBounds(118, 133, 84, 78);
		frame.getContentPane().add(btnNewButton5);

		JButton btnNewButton2 = new JButton("2");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (next==0) {
					nb1=nb1 + "2";
					labelnb1.setText(nb1);
				}
				else {
					nb2=nb2+"2";
					labelnb2.setText(nb2);
				}
			}
		});
		btnNewButton2.setBounds(118, 221, 84, 78);
		frame.getContentPane().add(btnNewButton2);

		JButton btnNewButton_CE = new JButton("CE");
		btnNewButton_CE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nb1="";
				nb2="";
				ope=0;
				next=0;
				lblNewLabel_ope.setText("");
				labelnb1.setText("");
				labelnb2.setText("");
				labelnb1.setVisible(true);
				labelnb2.setVisible(true);
				lblNewLabel_ope.setVisible(true);
				lblres.setVisible(false);
			}
		});
		btnNewButton_CE.setBounds(118, 309, 84, 78);
		frame.getContentPane().add(btnNewButton_CE);

		JButton btnNewButton_equal = new JButton("=");
		btnNewButton_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc1=Float.parseFloat(nb1);
				calc2=Float.parseFloat(nb2);
				
				if(ope==1) {
					res= calc1 + calc2;
				}
				else if(ope==2) {
					res= calc1 - calc2;
				}
				else if(ope==3) {
					res= calc1 * calc2;
				}
				else if(ope==4) {
					res= calc1 / calc2;
				}
				
				restext=res + "";
				
				labelnb1.setVisible(false);
				labelnb2.setVisible(false);
				lblNewLabel_ope.setVisible(false);
				lblres.setText(restext);
				lblres.setVisible(true);
				
			}
		});
		btnNewButton_equal.setBounds(226, 309, 84, 78);
		frame.getContentPane().add(btnNewButton_equal);

		JButton btnNewButton_plus = new JButton("+");
		btnNewButton_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ope==0) {
					ope=1;
					next=1;
					lblNewLabel_ope.setText("+");

				}
			}
		});
		btnNewButton_plus.setBounds(331, 307, 84, 80);
		frame.getContentPane().add(btnNewButton_plus);

		JButton btnNewButton3 = new JButton("3");
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (next==0) {
					nb1=nb1 + "3";
					labelnb1.setText(nb1);
				}
				else {
					nb2=nb2+"3";
					labelnb2.setText(nb2);
				}
			}
		});
		btnNewButton3.setBounds(226, 221, 84, 78);
		frame.getContentPane().add(btnNewButton3);

		JButton btnNewButton_sub = new JButton("-");
		btnNewButton_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ope==0) {
					ope=2;
					next=1;
					lblNewLabel_ope.setText("-");

				}
			}
		});
		btnNewButton_sub.setBounds(331, 221, 84, 78);
		frame.getContentPane().add(btnNewButton_sub);

		JButton btnNewButton6 = new JButton("6");
		btnNewButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (next==0) {
					nb1=nb1 + "6";
					labelnb1.setText(nb1);
				}
				else {
					nb2=nb2+"6";
					labelnb2.setText(nb2);
				}
			}
		});
		btnNewButton6.setBounds(226, 133, 84, 78);
		frame.getContentPane().add(btnNewButton6);

		JButton btnNewButton_mult = new JButton("*");
		btnNewButton_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ope==0) {
					ope=3;
					next=1;
					lblNewLabel_ope.setText("*");

				}

			}
		});
		btnNewButton_mult.setBounds(331, 133, 84, 78);
		frame.getContentPane().add(btnNewButton_mult);

		JButton btnNewButton9 = new JButton("9");
		btnNewButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (next==0) {
					nb1=nb1 + "9";
					labelnb1.setText(nb1);
				}
				else {
					nb2=nb2+"9";
					labelnb2.setText(nb2);
				}
				
			}
		});
		btnNewButton9.setBounds(226, 45, 84, 78);
		frame.getContentPane().add(btnNewButton9);

		JButton btnNewButton_div = new JButton("/");
		btnNewButton_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ope==0) {
					ope=4;
					next=1;
					lblNewLabel_ope.setText("/");

				}
			}
		});
		btnNewButton_div.setBounds(331, 45, 84, 77);
		frame.getContentPane().add(btnNewButton_div);
		
		



		JButton btnAccueil = new JButton("Retour à l'accueil");
		btnAccueil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				view_jeux view_jeux = new view_jeux();
			}
		});
		btnAccueil.setBounds(10, 390, 192, 20);
		frame.getContentPane().add(btnAccueil);
	}
}