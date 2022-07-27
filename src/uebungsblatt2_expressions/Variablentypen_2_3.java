package uebungsblatt2_expressions;

import java.util.Scanner;

public class Variablentypen_2_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		//a. einePostLeizahl -> int
		int einePostleizahlString = 96271;
		System.out.println("Postleizahl: " + einePostleizahlString);
		
		//b. eineKarteikarte -> char
		char eineKarteikarte = 'A';
		System.out.println("Karteikarte: " + eineKarteikarte);
		
		//c. PI -> double
		double pi = Math.PI;
		System.out.println("PI: " + pi);
		
		//d. einStrassenname -> String
		String einStrassennameString = "Coburger Straße 62";
		System.out.println("Straßenname: " + einStrassennameString);
		
		//e. dieRaumNummer -> int
		int dieRaumNummer = 101;
		System.out.println("Raumnummer: " + dieRaumNummer);
		
		//f. einLichtSchalter -> Boolean
		boolean einLichtSchalter = false;
		System.out.println("Zustand eines Lichtschalters: " + einLichtSchalter);
		
		//g. dieAussentemperatur -> double
		double dieAussentemperatur = 35.5;
		System.out.println("Aussentemperatur: " + dieAussentemperatur);
		
		//h. dasStockwerk -> int
		int dasStockwerk = 5;
		System.out.println("Stockwerk: " + dasStockwerk);
		
		//i. eineISBNNummer -> string -> da Unterteilung mit -
		String eineISBNNummer = "978-3-7205-2740-8";
		System.out.println("ISBN-Nummer: " + eineISBNNummer);
		
		//j. derAutor -> 
		String derAutor = "Napoleon Hill";
		System.out.println("Autor: " + derAutor);
		
		//k. dieAnzahlPCs
		int dieAnzahlPCs = 4;
		System.out.println("PC Anzahl: " + dieAnzahlPCs);
	}

}
