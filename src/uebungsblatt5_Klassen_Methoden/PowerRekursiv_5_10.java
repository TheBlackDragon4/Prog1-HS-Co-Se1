package uebungsblatt5_Klassen_Methoden;

import java.util.Scanner;

public class PowerRekursiv_5_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte Wert für 1.Basis und 2.Exponent eingeben:");
		int base = sc.nextInt();
		int exponent = sc.nextInt();

		System.out.println("Das Ergebnis aus " + base + "^" + exponent + " = " + power(base, exponent));

		sc.close();
	}

	static double power(int base, int exponent) {

		if (base > 0 && exponent == 0) {
			return 1.0;
		} else {
			return base * power(base, exponent - 1);
		}
	}
}
