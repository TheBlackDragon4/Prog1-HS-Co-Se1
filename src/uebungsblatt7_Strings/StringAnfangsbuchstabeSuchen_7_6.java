package uebungsblatt7_Strings;

import java.util.Scanner;

public class StringAnfangsbuchstabeSuchen_7_6 {

	/**
	 * Hier sollen die Anfangsbuchstaben eines Wortes aus mitgegebenden Text und
	 * Buchstaben nach Wahl ermittelt werden
	 * 
	 * @param text       Mitgegebenes Wort
	 * @param buchstaben Buchstabe nach dem gesucht werden soll
	 * @return - bei true ist der gesuchte Buchstabe gefunden, bei false eben nicht
	 */
	public static boolean anfangsBuchstabenPruefung(String text, String buchstabe) {

		if (text.startsWith(buchstabe)) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte Sting / Wort eingeben: ");
		String textString = sc.nextLine();
		System.out.println(
				"Bitte Buchstabe eingeben nach dem als Startbuchstabe gesucht werden soll: \n Bitte Gross und Kleinbuchstaben beachten");
		String buchstabeString = sc.next();

		boolean returnWert = anfangsBuchstabenPruefung(textString, buchstabeString);

		if (returnWert == true) {
			System.out.println("Wort enthaelt Buchstaben " + buchstabeString + " als Anfangsbuchstaben. ");
		} else {
			System.out.println("Wort enthaelt NICHT Buchstaben " + buchstabeString + " ale Anfangsbuchstabe. ");
		}

		sc.close();
	}

}
