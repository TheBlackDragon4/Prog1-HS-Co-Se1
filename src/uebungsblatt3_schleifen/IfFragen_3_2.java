package uebungsblatt3_schleifen;

import java.util.Scanner;

public class IfFragen_3_2 {

	public static void main(String[] args) {

		int x = 0, y = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Geben Sie einen Wert für x ein: ");
		x = sc.nextInt();
		System.out.println("Geben Sie einen Wert für y ein: ");
		y = sc.nextInt();

		// Aufgabe a)
		System.out.println("a) ");
		if (x < 10)
			if (y > 10)
				System.out.println("******");
			else
				System.out.println("######");
		System.out.println("$$$$$$");

		// Aufgabe b)
		System.out.println("\nb) ");
		if (x < 10) {
			if (y > 10) {
				System.out.println("******");
			}
		} else {
			System.out.println("######");
			System.out.println("$$$$$$");
		}
		
		sc.close();
	}

}
