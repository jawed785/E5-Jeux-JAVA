package controller;

import java.sql.SQLException;

import model.model;
import view.view_jeux;

public class mainMVC {
	
	private static model m;
	
	

	public static model getM() {
		return m;
	}



	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		m= new model();
		
		view_jeux window = new view_jeux();
		
		
	}

}