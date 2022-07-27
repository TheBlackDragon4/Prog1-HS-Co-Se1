package uebungsblatt7_Strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringURLKonvertierung_7_11 {

	public static String convertURL2JavaPackageName(String globaleURL) {

		String[] urlParts = globaleURL.split(Pattern.quote(".")); // Splitt nach Objekt "."
		StringBuffer packageName = new StringBuffer(10); // erstellen ein Objekt PackageNamen mit der Länge 10

		for (int i = 0; i < urlParts.length; i++) { // Durchlauf des Arrays "urlParts" um jeden Eintrag einzeln
													// durchlaufen zu können

			if (i == 0) { // Indexermittlung und Anpassen der Eingabe
				if (!isHeader(urlParts[i])) { // Überprüfung ob es sich an Position "0" um einen Header handelt
					packageName.insert(0, urlParts[i]); //
				}
			} else {
				packageName.insert(0, urlParts[i]);
			}

			if (i != urlParts.length - 1) {
				packageName.insert(0, ".");
			}

		}

		if (packageName.charAt(packageName.length() - 1) == '.') {
			packageName.deleteCharAt(packageName.length() - 1);
		}
		return packageName.toString();
	}

	public static Boolean isHeader(String token) {

		switch (token) {
		case "www":
		case "http://":
		case "https://":
		case "//www":
		case "https://www":
		case "http://www":
		case "//":
			return true;
		}
		
		return false;
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte gesamte URL eingeben: ");
		String s = sc.nextLine();

		System.out.println("\nKonvertierte URL: " + convertURL2JavaPackageName(s));
		sc.close();
	}
	
}
