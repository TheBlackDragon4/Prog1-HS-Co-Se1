package uebungsblatt7_Strings;

import java.util.Scanner;

public class Stringvergleich_7_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte String 1 eingeben: ");
		String firstString = sc.next();
		System.out.println("Bitte String 2 eingeben: ");
		String secondSting = sc.next();

		System.out.println(compareToo(firstString, secondSting)); //Aufruf der Methode "compareToo"
		sc.close();
	}

	public static String compareToo(String firstString, String secondSting) {

		int vergleich = firstString.compareTo(secondSting); // Überprüfung ob die Zeichenketten (Stings) gleich sind

		if (vergleich == 0) { // Wenn die Strings gleich lange sind kommt null bei compareTo raus somit "=="
			return firstString + " == " + secondSting;
		} else if (vergleich > 0) { // Wenn bei compareTo firstString größer ist, dann kommt ein Wert größer 0 raus 
			return firstString + " > " + secondSting;
		} else { //Hier wird alles andere ausgegeben -> somit ist secondString länger als firstString
			return firstString + " < " + secondSting;
		}
	}

}
