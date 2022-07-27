package uebungsblatt7_Strings;

import java.util.Scanner;

public class StringManipulierungVertauschen_7_5 {

	private StringBuffer stringBuffer;

	// Konstruktor -> Erstellung eines Objektes
	public StringManipulierungVertauschen_7_5(String stringBuffer) {
		this.stringBuffer = new StringBuffer(stringBuffer);
	}

	/**
	 * Vertauschen aller W�rter in einem Satz
	 * 
	 * @return - vertauche den Satz im StringBuffer
	 */
	public StringBuffer woerterVertauschen() {
		int wortEnde = 0;

		// StringBuffer musst duchlaufen werden
		// Starte das i immer auf den Beginn eines Wortes

		for (int i = 0; i < stringBuffer.length(); i = wortEnde) {

			// Ermittele das Ende des Wortes durch suchen des n�chsten Wortes
			wortEnde = sucheWortEnde(i);

			// Falls beim Durchsuchen ein Trennzeichen an aktueller Position muss mit dem
			// n�chsten Folgeindex fortgefahren werden. Ist das nicht der fall haben wir ein
			// Wort das vertauscht werden muss.
			if (wortEnde == i) {
				wortEnde++;
			} else {
				buchstabenImWortVertauschen(i, wortEnde);
			}

		}

		return stringBuffer;
	}

	/**
	 * Vertauscht die entsprechenden Buchstaben eines Wortes anhand von einem
	 * Algorithmus der Aufgabenstellung entsprechend
	 * 
	 * @param startIndex Index f�r den ersten Buchstaben eines Wortes
	 * @param wortEnde   Index f�r den letzten Bustaben eines Wortes
	 */
	public void buchstabenImWortVertauschen(int startIndex, int endIndex) {

		for (int i = startIndex + 1, j = endIndex - 1; i < j; i++, j--) {
			char c = stringBuffer.charAt(i); // Zwischenspeicher f�r Wert an Stelle von i
			stringBuffer.setCharAt(i, stringBuffer.charAt(j)); // Buchstabe von j wird nun auf Index von i gesetzt
			stringBuffer.setCharAt(j, c); // Buchtsabe vom Zwischenspeicher c wird auf index von j gesetzt
		}

	}

	/**
	 * Suche das Ende eines Wortes
	 * 
	 * @param startIndex Indey im Buffer, ab dem gesucht wird
	 * @return - den Index des letzten g�ltigen Buchstabens
	 */
	public int sucheWortEnde(int startIndex) {

		// M�glich w�re hier auch eine FOR - Schleife
		int endIndex = startIndex;
		while (endIndex != stringBuffer.length() && !istTrennzeichen(stringBuffer.charAt(endIndex))) {
			endIndex++;
		}
		return (endIndex == startIndex ? endIndex : endIndex - 1);
	}

	/**
	 * Sucht nach entsprechenden Trennzeichen in einem Wort
	 * 
	 * @param char c ist das entsprechend zu pr�fende Zeichen
	 * @return - ist true falls Trennzeichen ansonsten false als R�ckgabe
	 */
	public static boolean istTrennzeichen(char c) {

		char[] moeglicheTrennzeichen = { ' ', '.', ',', '?', '!', '|' };

		// verk�rzte FOR-Schleife -> nur mit Leserechten um einen Wert vergleichen zu
		// k�nnen
		for (char t : moeglicheTrennzeichen) {
			if (t == c) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		// Inner Buchstaben eines Wortes sollen vertauscht werden
		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte gibt einen Satz ein: ");
		String textString = sc.nextLine();

		StringManipulierungVertauschen_7_5 vertauscheText = new StringManipulierungVertauschen_7_5(textString);

		System.out.println(vertauscheText.woerterVertauschen());
		sc.close();
	}

}
