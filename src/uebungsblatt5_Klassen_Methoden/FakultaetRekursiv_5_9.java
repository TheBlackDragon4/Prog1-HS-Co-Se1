package uebungsblatt5_Klassen_Methoden;

import java.util.Scanner;

public class FakultaetRekursiv_5_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte Fakultät eingeben: ");
		int n = sc.nextInt();

		int fakultaet = (int) fakultaet(n);

		System.out.println(n + "! = " + fakultaet);
		sc.close();
	}

	public static double fakultaet(int n) {
		assert n >= 0;
		if (n == 0) { // Basisfall
			return 1.0;
		} else if (n == 1) { // Basisfall
			return 1.0;
		} else {
			return n * fakultaet(n - 1);
		}
	}
}
