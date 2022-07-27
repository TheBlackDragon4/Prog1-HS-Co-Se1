package uebungsblatt5_Klassen_Methoden;

import java.util.Scanner;

public class PrimTest_5_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte Obergrenze eingeben: ");
		int obergrenze = sc.nextInt(); // natürliche Zahl n

		isPrime(obergrenze);
		sc.close();
	}

	public static boolean isPrime(int obergrenze) {
		boolean primzahl = true;
		int zahl = 2;

		while (obergrenze >= zahl) { // Berechnung der Primzahlen bis Obergrenze
			for (int t = 2; t < zahl; t++) {
				if ((zahl % t) == 0) {
					primzahl = false;
				}
			}
			if(zahl == 2) {
				primzahl = true;
			}
			if (primzahl == true) {
				System.out.println(zahl);
			}
			primzahl = true;
			zahl++;
		}

		for (int t = 2; t >= obergrenze; t++) { // Test für Obergrenze ob Primzahl oder nicht
			if (obergrenze % t == 0) {
				primzahl = false;
			}
		}
		return primzahl;
	}
}
