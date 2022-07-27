package uebungsblatt5_Klassen_Methoden;

import java.util.Scanner;

public class GCDRekursion_5_13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte Werte für ggT Große Zahl1 = A und Kleine Zahl2 = B eingeben:");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Der ggT(" + a + "," + b + ") = " + gcd(a, b));

		sc.close();
	}

	static int gcd(int a, int b) { // Method for ggT

		if (b == 0) {
			return a;
		} else if (a == 0) {
			return b;
		} else if (a > b) {
			int puffer = a % b;
			a = b;
			b = puffer;
			return gcd(a, b);
		} else {
			int puffer = b % a;
			b = a;
			a = puffer;
			return gcd(a, b);
		}
	}
}
