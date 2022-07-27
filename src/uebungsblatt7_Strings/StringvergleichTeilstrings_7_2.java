package uebungsblatt7_Strings;

import java.util.Scanner;

public class StringvergleichTeilstrings_7_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte den ersten String eingeben: ");
		String firstString = sc.next();
		System.out.println("Bitte den zweiten String eingeben: ");
		String secondString = sc.next();
		System.out.println("Anzahl der zu vergleichenden Objekte eingeben:");
		int number = sc.nextInt();
		System.out.println("Bitte den Startindex eingeben:");
		int startindex = sc.nextInt();

		System.out.println(regionMatches(firstString, secondString, number, startindex));
		sc.close();
	}

	public static String regionMatches(String firstString, String secondString, int number, int startindex) {

		// Hier wird geprüft ob Teile des Textes gleich sind -> Wenn Teile gleich dann
		// true / gleich wenn der Text nicht gleich ist dann false / ungleich

		if (firstString.regionMatches(true, startindex, secondString, 0, number)) {
			return "Die beiden Strings sind gleich bzw. equivalent";
		} else {
			return "Die beiden Strings sind NOT gleich";
		}
	}
}
