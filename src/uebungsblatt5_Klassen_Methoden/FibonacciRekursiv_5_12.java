package uebungsblatt5_Klassen_Methoden;

import java.util.Scanner;

public class FibonacciRekursiv_5_12 {

		public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte n eingeben");
		int n = sc.nextInt();

		System.out.println("f" + n + " = " + fib(n));

		sc.close();
	}

	public static long fib(int n) {
		// F�r welche Werte der Parameter kennen wir das Resultat sofort?
		if (n == 0) // Basisfall
			return 0;
		if (n == 1) // Basisfall
			return 1;
		// Pr�zidenz wird von links nach rechts ausgewertet
		// somit ist der n�chste Aufruf von fib(int n) auf einem erstmaligen Aufruf von
		// 50 49 48 usw.
		// Hier wird der erste Wert f�r fib(n-1) �bergeben, da von links nach rechts
		// ausgewertet wird.
		return fib(n - 1) + fib(n - 2);
	}
}
