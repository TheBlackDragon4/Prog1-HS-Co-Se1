package uebungsblatt3_schleifen;

import java.util.Scanner;

public class Fibonacci_3_6 {

	public static void main(String[] args) {

		int n = 0;

		double fn = 0; // fn der Formel auf Wikipedia
		double vorLetzteZahl = 0; // fn-2 der Formel auf Wikipedia
		double letzteZahl = 1; // fn-1 der Formel auf Wikipedia

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte Index n eingeben: "); // n Zeigt die Schritte die insgesamt berechnet werden sollen.
		n = sc.nextInt();

		if (n == 0) {
			fn = vorLetzteZahl; // Vorletzte Zahl ist auf 0 gesetzt
			System.out.println("Fibonacci Zahl: f" + n + " = " + fn);
		} else if (n == 1) {
			fn = vorLetzteZahl + letzteZahl; // Vorletzte Zahl und letzte Zahl werden aufaddiert
			System.out.println("Fibonacci Zahl: f" + n + " = " + fn);
		} else {
			System.out.println("Fibonacci Zahl: f" + n + " = " + fn);
			for (int i = 1; i < n; i++) {
				fn = vorLetzteZahl + letzteZahl; // Vorletzte Zahl und letzte Zahl werden aufaddiert und fn zugewiesen
				vorLetzteZahl = letzteZahl; // letzte Zahl wird vorletzte Zahl zugewießen
				letzteZahl = fn; // Zuvor berechneter Wert für fn wird der letzten Zahl zugewiesen ->
									// Entsprechender Autausch der Variablen ist notwendig, da hier bestimmte
									// Zuweisungen stattfinden.
				System.out.println("Fibonacci Zahl: f" + n + " = " + fn);
			}
		}

		sc.close();
	}

}
