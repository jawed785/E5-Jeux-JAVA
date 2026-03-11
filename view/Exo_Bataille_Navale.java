package view;


import java.util.Scanner;

public class Exo_Bataille_Navale {

	// Procédure affichagetab notre terrain

	public static void affichagetab (int tab[][]) {
		int len = tab.length;
		int nbcol = tab[0].length;
		System.out.print("    ");
		for (int i=0; i < (len); i++) {
			if ((i+1)<10) {
				System.out.print((i+1) + " ");

			}
			else if ((i+1)>=10) {
				System.out.print((i+1));

			}

		}
		System.out.println();

		for (int j=0; j < (nbcol); j++) {
			if ((j+1)<10) {


				System.out.print(j+1);
				System.out.print("   ");
			}
			else {
				System.out.print(j+1);
				System.out.print("  ");

			}
			for (int i=0; i < (len); i++) {
				if (tab[i][j]== 0) {
					System.out.print("o ");
				}
				if (tab[i][j]== 1) {
					System.out.print("~ ");
				}
				if (tab[i][j]== 2) {
					System.out.print("x ");
				}

			}
			System.out.println();
		}
	}

	//Procedure affichagetab terrain de l'ordi

	public static void affichagetabCache (int tab[][]) {
		int len = tab.length;
		int nbcol = tab[0].length;
		System.out.print("    ");
		for (int i=0; i < (len); i++) {
			if ((i+1)<10) {
				System.out.print((i+1) + " ");

			}
			else if ((i+1)>=10) {
				System.out.print((i+1));

			}

		}
		System.out.println();

		for (int j=0; j < (nbcol); j++) {
			if ((j+1)<10) {


				System.out.print(j+1);
				System.out.print("   ");
			}
			else {
				System.out.print(j+1);
				System.out.print("  ");

			}
			for (int i=0; i < (len); i++) {
				if (tab[i][j]== 0) {
					System.out.print("? ");
				}
				if (tab[i][j]== 1) {
					System.out.print("? ");
				}
				if (tab[i][j]== 2) {
					System.out.print("o ");
				}
				if (tab[i][j]== 3) {
					System.out.print("x ");
				}


			}
			System.out.println();
		}
	}




	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Initialisation des variables

		Scanner sc = new Scanner (System.in);

		int ln=10;
		int col=10;
		int tabjoueur[][] = new int [ln][col];
		int tabordi[][]= new int [ln][col];
		int nbpion_joueur = 0;
		int lnpion = 0;
		int colpion = 0;
		int nbpion_ordinateur = 0;
		int nbpiontrouvejoueur=0;
		int nbpiontrouveordi=0;


		// Création d'un tableau 10 par 10 avec uniquement des 0

		for(int i=0; i<ln; i++) {
			for (int j=0; j<col; j++) {
				tabjoueur[i][j] = 0;
			}
		}

		for(int i=0; i<ln-1; i++) {
			for (int j=0; j<col; j++) {
				tabordi[i][j] = 0;
			}
		}


		// Affecter navires du joueur

		while (nbpion_joueur<5) {
			System.out.println("Entrer la ligne de votre navire.");
			lnpion = sc.nextInt();
			System.out.println("Entrer la colonne de votre navire.");
			colpion = sc.nextInt();
			if ((lnpion < ln+1 && lnpion > 0) && (colpion < col+1 && colpion > 0) && (tabjoueur[lnpion][colpion] != 1) ) {
				tabjoueur[lnpion-1][colpion-1]= 1;
				

				nbpion_joueur ++;

			}
			else {
				System.out.println("Erreur : Veuillez entrer une ligne et une colonne compris entre 0 et " + ln + " lignes et entre 0 et " + col + " colonnes." );
				System.out.println("Veuillez ne pas entrer 2 fois les même coordonées.");
			}


		}
		
		System.out.println();
		System.out.println("Votre terrain :");
		System.out.println();
		affichagetab(tabjoueur);

		// Affecter navires de l'ordinateur

		while (nbpion_ordinateur < 5) {
			lnpion = (int)(Math.random()*(ln))+1;
			colpion = (int)(Math.random()*(col))+1;
			tabordi[lnpion-1][colpion-1] = 1;
			nbpion_ordinateur ++;

		}

		// Début de la partie

		while (nbpiontrouvejoueur != 5 || nbpiontrouveordi != 5 ) {

			// Je joue

			System.out.println();
			System.out.println("A vous de jouer !");

			System.out.println();
			System.out.println("Quelle ligne souhaitez-vous attaquer ?");
			int lnattack = sc.nextInt();

			System.out.println();
			System.out.println("Quelle colonne souhaitez-vous attaquer ?");
			int colattack =sc.nextInt();

			System.out.println();
			System.out.println("Tir en cours ...");
			Thread.sleep(2*1000);





			if (tabordi[lnattack-1][colattack-1]==0) {
				
				System.out.println();
				System.out.println("Raté ...");
				
				tabordi[lnattack-1][colattack-1]=3;
			}
			else if (tabordi[lnattack-1][colattack-1]==1) {
				
				System.out.println();
				System.out.println("Touché !");
				
				tabordi[lnattack-1][colattack-1]=2;
				nbpiontrouvejoueur ++;
			}
			else {
				
				System.out.println();
				System.out.println("Tir à blanc !");
			}

			affichagetabCache(tabordi);
			
			Thread.sleep(2*1000);
			
			// L'ordi joue

			System.out.println();
			System.out.println("Tour de l'ordinateur.");
			
			System.out.println();
			System.out.println("Tir en cours ...");
			
			Thread.sleep(2*1000);

			lnattack = (int)(Math.random()*(ln))+1;
			colattack = (int)(Math.random()*(col))+1;

			while ((tabjoueur[lnattack-1][colattack-1]!=0) && (tabjoueur[lnattack-1][colattack-1]!=1)) {
				lnattack = (int)(Math.random()*(ln))+1;
				colattack = (int)(Math.random()*(col))+1;

			}

			if (tabjoueur[lnattack-1][colattack-1]==0) {
				
				System.out.println();
				System.out.println("Raté ...");
				
				tabjoueur[lnattack-1][colattack-1]=3;
			}
			if (tabjoueur[lnattack-1][colattack-1]==1) {
				
				System.out.println();
				System.out.println("Touché !");
				
				tabjoueur[lnattack-1][colattack-1]=2;
				nbpiontrouveordi ++;
			}
			
			affichagetabCache(tabjoueur);
			
			System.out.println();
			System.out.println("Le score est de " + nbpiontrouvejoueur + " pour le joueur et de " + nbpiontrouveordi + " pour l'ordinateur.");
		





		}
		
		// Résultat
		
		if (nbpiontrouvejoueur==5) {
			System.out.println("Vous avez gagné ! Bravo :)");
		}
		if (nbpiontrouveordi== 5) {
			System.out.println("Vous avez perdu ...");
		}










	}

	public Exo_Bataille_Navale() {
		try {
			main(null);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




}