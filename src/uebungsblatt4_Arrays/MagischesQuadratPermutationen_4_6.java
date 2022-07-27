package uebungsblatt4_Arrays;

import java.util.Scanner;

public class MagischesQuadratPermutationen_4_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 0;

		// 1. n ist die Größe des magischen Quadrats
		do { // Schleife soll solange durchlaufen werdem bis n > 2 && n < 10
			System.out.println("Gebe bitte einen Wert für n ein: ");
			n = sc.nextInt();
		} while (n < 2 || n > 10);

		// 2. Erzeugung eines zweidimensionalen Arrays mit Länge von n
		int quad[][] = new int[n][n];

		// 3. Variablendeklaration
		int zeile = n / 2;
		int spalte = n / 2 + 1;
		int m = 0;

		// 4. Führe aus solange m < n^2
		do {
			m++;
			quad[zeile][spalte] = m;
			zeile--;
			spalte++;
			zeile = (zeile + n) % n;
			spalte %= n;
			if (quad[zeile][spalte] != 0) {
				zeile++;
				spalte++;
				zeile %= n;
				spalte %= n;
			}
		} while (m < n * n);

		// 5. Ausgabe von dem Magischen Quadrat
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m = quad[i][j];
				if (m < 10)
					System.out.print(" ");
				if (m < 100)
					System.out.print(" ");
				System.out.print(" " + m);
			}
		}
		sc.close();
	}
}
