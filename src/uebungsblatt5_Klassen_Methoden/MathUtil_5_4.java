package uebungsblatt5_Klassen_Methoden;

public class MathUtil_5_4 {

	public static int isEven(int zahl) { // soll angeben ob gerade oder ungerade
		int result;
		if (zahl % 2 == 0)
			result = 0;
		else
			result = 1;
		return result;
	}

	public static int gcd(int zahl1, int zahl2) { // Ausrechnung des gr��ten gemeinsamen Teilers (ggT) zweier ganzer
													// Zahlen
		int rest = 0;
		int groessereZahl = 0;
		int kleinereZahl = 0;
		if (zahl1 < zahl2) {
			groessereZahl = zahl2;
			kleinereZahl = zahl1;
		} else {
			groessereZahl = zahl1;
			kleinereZahl = zahl2;
		}

		do {
			rest = groessereZahl % kleinereZahl;
			groessereZahl = kleinereZahl;
			kleinereZahl = rest;
		} while (rest != 0);

		return groessereZahl;
	}

	public static float minimum3(float zahl1, float zahl2, float zahl3) { // Soll das Minimum ausrechnen -> Mit
		float vergleicheOneTwo = Math.min(zahl1, zahl2);
		float result = Math.min(vergleicheOneTwo, zahl3);
		return result;
	}

	public static double integerPower(float base, float exponent) { // Soll den Exponenten berechnen
		return (double) (Math.pow(base, exponent));
	}

	public static void printAsteriks(int n) { // Soll in Abh�ngikeit von n die **** in einem Rechteckigen Format
												// ausgeben.
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
