package uebungsblatt7_Strings;

import java.util.Scanner;

public class StringZeichenzaehlen_7_4 {

	public static void main(String[] args) {

		/**
		 * https://developer.mozilla.org/de/docs/Web/JavaScript/Reference/Global_Objects/String/indexOf
		 * 
		 * Beschreibung IndexOf(): Die indexOf() Methode gibt den Index der
		 * Zeichenketteinnerhalb des aufrufenden String Objekts des ersten Vorkommnis
		 * des angegebenen Wertes beginnend bei fromIndex zur�ck. Gibt -1 zur�ck, wenn
		 * der Wert nicht gefunden wurde.
		 * 
		 * Syntax: str.indexOf(searchValue[, fromIndex])
		 * 
		 * Parameter: searchValue Ein String der den zu suchenden Wert repr�sentiert.
		 * fromIndex (Optional) Der Index, von dem angefangen wird vorw�rts im String zu
		 * suchen. Der Standardwert ist 0, so dass der ganze String durchsucht wird.
		 * Wenn fromIndex < 0 ist, wird der ganze String durchsucht. Wenn fromIndex >=
		 * str.length ist, wird der String nicht durchsucht und -1 wird zur�ckgegeben.
		 * Die Ausnahme ist, wenn f�r searchValue ein leeren String eingesetzt wird,
		 * dann wird str.length zur�ckgegeben.
		 * 
		 * R�ckgabewert: Den Index des ersten Vorkommens des gesuchten Wertes; -1 wenn
		 * der Wert nicht gefunden wurde.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte gibe eine Zeile Text ein:"); // Satzeingabe
		String text = sc.nextLine();
		System.out.println("Bitte Buchstaben eingeben nach deren Anzahl gesucht werden soll: ");
		String character = sc.next();
		int counter = 0;
		int current = 0;
		int last = -2;

		for (int i = -1; i < text.length();) {

			current = text.indexOf(character, ++i); // Hier wir herausgefunden an welcher Position die Werte vorhanden
			if (current != -1 && current != last) { // Pr�ft ob Aktueller Wert -1 also NOT Match oder ob Character
													// gefunden wurde
				last = current; 
				counter++;
			}
		}

		System.out.println("Anzahl von Character von " + character + "'s: " + counter);

		// System.out.println(zeileString.indexOf("Hallo")); // �berpr�ft ob "Hallo" im
		// String vorkommt -> Wenn ja R�ckgabe
		// = return 0

		// "" sorgt f�r das NICHT suchen eines Wortes in dem String
		// zeilenString.length() gibt die Gesamtl�nge des Wortes / Satzes zur�ck
		// System.out.println("Anzahl der Zeichen des Satzes: " + text.indexOf("",
		// zeileString.length()));
		// System.out.println("Indexwert des gesuchen Wortes: " + text.indexOf("wie"));

		sc.close();
	}

}
