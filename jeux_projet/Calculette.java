package jeux_projet;

import jeux_projet.StyledButton;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.Font;

public class Calculette {

	private JFrame frame;
	private JTextField calcul;
	private int operation;
	private int i;
	private int y;
	private String result;
	private String nbAdd;
	private JButton button_0;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_division;
	private JButton btn_multiplication;
	private JButton button_soustraction;
	private JButton button_addition;
	private JButton button_effacer_tous;
	private JButton button_egale;
	private JButton button_parenthese;
	private JButton button_virgule;
	private JButton button_pourcentage;
	private JButton button_effacer;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculette window = new Calculette();
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
	public Calculette() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		calcul = new JTextField();
		calcul.setEditable(false);
		calcul.setBounds(25, 22, 230, 148);
		frame.getContentPane().add(calcul);
		calcul.setColumns(10);
		
		//*************************************************************
		
		nbAdd = "";
		
		//*************************************************************
		
		button_0 = new StyledButton(
				"0",
				new Color(198, 198, 188), 
			    new Color(152, 152, 142),   
			    new Color(0, 0, 0), 
			    new Color(198, 198, 188),   
			    new Color(152, 152, 142),
			    new Color(0, 0, 0) 
				);
		button_0.setBounds(25, 440, 50, 50);
		frame.getContentPane().add(button_0);
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbAdd += "0";
				calcul.setText(nbAdd);
			}
		});
		
		button_1 = new StyledButton(
				"1",
				new Color(198, 198, 188), 
			    new Color(152, 152, 142),   
			    new Color(0, 0, 0), 
			    new Color(198, 198, 188),   
			    new Color(152, 152, 142),
			    new Color(0, 0, 0) 
				);
		button_1.setBounds(25, 380, 50, 50);
		frame.getContentPane().add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbAdd += "1";
				calcul.setText(nbAdd);
			}
		});
		
		button_2 = new StyledButton(
				"2",
				new Color(198, 198, 188), 
			    new Color(152, 152, 142),   
			    new Color(0, 0, 0), 
			    new Color(198, 198, 188),   
			    new Color(152, 152, 142),
			    new Color(0, 0, 0) 
				);
		button_2.setBounds(85, 380, 50, 50);
		frame.getContentPane().add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbAdd += "2";
				calcul.setText(nbAdd);
			}
		});
		
		button_3 = new StyledButton(
				"3",
				new Color(198, 198, 188), 
			    new Color(152, 152, 142),   
			    new Color(0, 0, 0), 
			    new Color(198, 198, 188),   
			    new Color(152, 152, 142),
			    new Color(0, 0, 0) 
				);
		button_3.setBounds(145, 380, 50, 50);
		frame.getContentPane().add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbAdd += "3";
				calcul.setText(nbAdd);
			}
		});
		
		button_4 = new StyledButton(
				"4",
				new Color(198, 198, 188), 
			    new Color(152, 152, 142),   
			    new Color(0, 0, 0), 
			    new Color(198, 198, 188),   
			    new Color(152, 152, 142),
			    new Color(0, 0, 0) 
				);
		button_4.setBounds(25, 320, 50, 50);
		frame.getContentPane().add(button_4);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbAdd += "4";
				calcul.setText(nbAdd);
			}
		});
		
		button_5 = new StyledButton(
				"5",
				new Color(198, 198, 188), 
			    new Color(152, 152, 142),   
			    new Color(0, 0, 0), 
			    new Color(198, 198, 188),   
			    new Color(152, 152, 142),
			    new Color(0, 0, 0)  
				);
		button_5.setBounds(85, 320, 50, 50);
		frame.getContentPane().add(button_5);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbAdd += "5";
				calcul.setText(nbAdd);
			}
		});
		
		button_6 = new StyledButton(
				"6",
				new Color(198, 198, 188), 
			    new Color(152, 152, 142),   
			    new Color(0, 0, 0), 
			    new Color(198, 198, 188),   
			    new Color(152, 152, 142),
			    new Color(0, 0, 0)  
				);
		button_6.setBounds(145, 320, 50, 50);
		frame.getContentPane().add(button_6);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbAdd += "6";
				calcul.setText(nbAdd);
			}
		});
		
		button_7 = new StyledButton(
				"7",
				new Color(198, 198, 188), 
			    new Color(152, 152, 142),   
			    new Color(0, 0, 0), 
			    new Color(198, 198, 188),   
			    new Color(152, 152, 142),
			    new Color(0, 0, 0) 
				);
		button_7.setBounds(25, 260, 50, 50);
		frame.getContentPane().add(button_7);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbAdd += "7";
				calcul.setText(nbAdd);
			}
		});
		
		button_8 = new StyledButton(
				"8",
				new Color(198, 198, 188), 
			    new Color(152, 152, 142),   
			    new Color(0, 0, 0), 
			    new Color(198, 198, 188),   
			    new Color(152, 152, 142),
			    new Color(0, 0, 0)  
				);
		button_8.setBounds(85, 260, 50, 50);
		frame.getContentPane().add(button_8);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbAdd += "8";
				calcul.setText(nbAdd);
			}
		});
		
		button_9 = new StyledButton(
				"9",
				new Color(198, 198, 188), 
			    new Color(152, 152, 142),   
			    new Color(0, 0, 0), 
			    new Color(198, 198, 188),   
			    new Color(152, 152, 142),
			    new Color(0, 0, 0) 
				);
		button_9.setBounds(145, 260, 50, 50);
		frame.getContentPane().add(button_9);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbAdd += "9";
				calcul.setText(nbAdd);
			}
		});
		
		
		
		//*************************************************************
		button_division = new StyledButton(
				"÷",
				new Color(207, 211, 222), 
			    new Color(166, 170, 181),   
			    new Color(0, 0, 0), 
			    new Color(207, 211, 222),   
			    new Color(166, 170, 181),
			    new Color(0, 0, 0) 
				);
		button_division.setBounds(145, 200, 50, 50);
		frame.getContentPane().add(button_division);
		button_division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_division.setEnabled(false);
				btn_multiplication.setEnabled(false);
				button_soustraction.setEnabled(false);
				button_addition.setEnabled(false);
				
				operation = 1;
				
				i = Integer.parseInt(nbAdd);
				
				nbAdd = "";
				calcul.setText(nbAdd);
			}
		});
		
		btn_multiplication = new StyledButton(
				"x",
				new Color(207, 211, 222), 
			    new Color(166, 170, 181),   
			    new Color(0, 0, 0), 
			    new Color(207, 211, 222),   
			    new Color(166, 170, 181),
			    new Color(0, 0, 0) 
				);
		btn_multiplication.setBounds(205, 260, 50, 50);
		frame.getContentPane().add(btn_multiplication);
		btn_multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_division.setEnabled(false);
				btn_multiplication.setEnabled(false);
				button_soustraction.setEnabled(false);
				button_addition.setEnabled(false);
				
				operation = 2;
				
				i = Integer.parseInt(nbAdd);
				
				nbAdd = "";
				calcul.setText(nbAdd);
			}
		});
		
		button_soustraction = new StyledButton(
				"-",
				new Color(207, 211, 222), 
			    new Color(166, 170, 181),   
			    new Color(0, 0, 0), 
			    new Color(207, 211, 222),   
			    new Color(166, 170, 181),
			    new Color(0, 0, 0) 
				);
		button_soustraction.setBounds(205, 320, 50, 50);
		frame.getContentPane().add(button_soustraction);
		button_soustraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_division.setEnabled(false);
				btn_multiplication.setEnabled(false);
				button_soustraction.setEnabled(false);
				button_addition.setEnabled(false);
				
				operation = 3;
				
				i = Integer.parseInt(nbAdd);
				
				nbAdd = "";
				calcul.setText(nbAdd);
			}
		});
		
		button_addition = new StyledButton(
				"+",
				new Color(207, 211, 222), 
			    new Color(166, 170, 181),   
			    new Color(0, 0, 0), 
			    new Color(207, 211, 222),   
			    new Color(166, 170, 181),
			    new Color(0, 0, 0) 
				);
		button_addition.setBounds(205, 380, 50, 50);
		frame.getContentPane().add(button_addition);
		button_addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_division.setEnabled(false);
				btn_multiplication.setEnabled(false);
				button_soustraction.setEnabled(false);
				button_addition.setEnabled(false);
				
				operation = 4;
				
				i = Integer.parseInt(nbAdd);
				
				nbAdd = "";
				calcul.setText(nbAdd);
			}
		});
		
		button_pourcentage = new StyledButton(
				"%",
				new Color(207, 211, 222), 
			    new Color(166, 170, 181),   
			    new Color(0, 0, 0), 
			    new Color(207, 211, 222),   
			    new Color(166, 170, 181),
			    new Color(0, 0, 0) 
				);
		button_pourcentage.setBounds(85, 200, 50, 50);
		frame.getContentPane().add(button_pourcentage);
		
		button_parenthese = new StyledButton(
				"( )",
				new Color(198, 198, 188), 
			    new Color(152, 152, 142),   
			    new Color(0, 0, 0), 
			    new Color(198, 198, 188),   
			    new Color(152, 152, 142),
			    new Color(0, 0, 0) 
				);
		button_parenthese.setBounds(145, 440, 50, 50);
		frame.getContentPane().add(button_parenthese);
		
		button_virgule = new StyledButton(
				".",
				new Color(198, 198, 188), 
			    new Color(152, 152, 142),   
			    new Color(0, 0, 0), 
			    new Color(198, 198, 188),   
			    new Color(152, 152, 142),
			    new Color(0, 0, 0) 
				);
		button_virgule.setBounds(85, 440, 50, 50);
		frame.getContentPane().add(button_virgule);
		
		//*************************************************************
		
		button_effacer_tous = new StyledButton(
				"CE",
				new Color(255, 75, 75), 
			    new Color(255, 0, 0),   
			    new Color(0, 0, 0), 
			    new Color(255, 75, 75),   
			    new Color(255, 0, 0),
			    new Color(0, 0, 0)
			   );
		button_effacer_tous.setFont(new Font("Tahoma", Font.PLAIN, 8));
		button_effacer_tous.setBounds(25, 200, 50, 50);
		frame.getContentPane().add(button_effacer_tous);
		button_effacer_tous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcul.setText("");
				operation = 0;
				nbAdd = "";
				i = 0;
				y = 0;
				button_division.setEnabled(true);
				btn_multiplication.setEnabled(true);
				button_soustraction.setEnabled(true);
				button_addition.setEnabled(true);
			}
		});
		
		button_effacer = new JButton("X");
		button_effacer.setBounds(205, 200, 50, 50);
		frame.getContentPane().add(button_effacer);
		
		button_egale = new JButton("=");
		button_egale.setBounds(205, 440, 50, 50);
		frame.getContentPane().add(button_egale);
		button_egale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				y = Integer.parseInt(nbAdd);
				
				if (operation == 1) {
					result = String.valueOf(i/y);
				}
				else if (operation == 2) {
					result = String.valueOf(i*y);
				}
				else if (operation == 3) {
					result = String.valueOf(i-y);
				}
				else if (operation == 4) {
					result = String.valueOf(i+y);
				}
				else {
					result = String.valueOf(i);
				}
				calcul.setText(result);
				nbAdd = "";
				button_division.setEnabled(true);
				btn_multiplication.setEnabled(true);
				button_soustraction.setEnabled(true);
				button_addition.setEnabled(true);
			}
		});
	}
}
