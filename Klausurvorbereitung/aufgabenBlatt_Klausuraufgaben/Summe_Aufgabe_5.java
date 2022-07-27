package aufgabenBlatt_Klausuraufgaben;

public class Summe_Aufgabe_5 {

	public static int berechne(int n) { // Berechnung als Formel
		return (n * (n + 1) * (2 * n + 1)) / 6;
	}

	public static int berechne(short n) { // Iterativ
		short result = 0;
		for (int i = 0; i <= n; i++) {
			result = (short) (result + (i * i));
		}
		return result;
	}

	public static int berechne(long n) { // Rekursiv
		if (n <= 1) { // Basisfall
			return (int) n;
		} else {
			return (int) ((n * n) + berechne((long) (n - 1))); // Rekursiver Aufruf
		}
	}

	public static void main(String[] args) {
		System.out.println(berechne(20));// int
		System.out.println(berechne((short) (20))); // Short
		System.out.println(berechne(20l)); // long
	}

	// b) geht in diesem Fall nicht -> M�ssen mehrere Parameter �bergeben werden
	// c) �berladen kann man den gleichen Namen verwenden aber die �bergabevariabeln
	// m�ssen mehrere haben. Siehe konstruktor. Muss hei�en wie der Klassenname.
	// Signatur ist der �bergabeparameter und Name der �bergeben wird
	// d) �berladen von Methoden m�ssen entweder verschiedene Signaturen (int, float, usw.) haben.
}
