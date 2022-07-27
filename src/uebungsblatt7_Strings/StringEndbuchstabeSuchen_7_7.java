package uebungsblatt7_Strings;

import java.util.Scanner;

public class StringEndbuchstabeSuchen_7_7 {

	/**
	 * Hier sollen die Endbuchstabe eines Wortes aus mitgegebenden Text und
	 * Buchstaben nach Wahl ermittelt werden.
	 * 
	 * @param text      Mitgegebenes Wort
	 * @param buchstabe Buchstabe nach dem gesucht werden soll
	 * @return - bei true ist der gesuchte Buchstabe gefunden, bei false eben nicht
	 */
	public static boolean endBuchstabenPruefung(String text, String buchstabe) {

		if (text.endsWith(buchstabe)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte String oder Wort eingeben: ");
		String textString = sc.nextLine();
		System.out.println(
				"Bitte den Buchstaben eingeben nach dem als Endbuchstaben gesucht werden soll: \n Bitte Groﬂ und Kleinbuchstaben beachten");
		String buchstabenString = sc.next();

		boolean restultTextWert = endBuchstabenPruefung(textString, buchstabenString);

		if (restultTextWert == true) {
			System.out.println("Wort enth‰lt Buchstaben " + buchstabenString + " als Endbuchstaben. ");
		} else {
			System.out.println("Wort enth‰lt NICHT Buchstaben " + buchstabenString + " ale Endbuchstabe. ");
		}

		sc.close();

	}

}
