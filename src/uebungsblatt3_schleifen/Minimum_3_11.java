package uebungsblatt3_schleifen;

import java.util.Scanner;

public class Minimum_3_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Anzahl der Zahlen eingeben: ");
		int zahl = sc.nextInt();

		int[] zahlen = new int[zahl];
		int minimum = 0;

		for (int i = 0; i < zahl; i++) {
			System.out.println("Bitte Zahl eingeben: ");
			int zahleingabe = sc.nextInt();

			zahlen[i] = zahleingabe;

			if (zahlen[i] < minimum) {
				minimum = zahlen[i];
			}
		}
		System.out.println("Minimum: " + minimum);

		sc.close();
	}

}
