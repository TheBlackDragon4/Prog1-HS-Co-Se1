package uebungsblatt3_schleifen;

import java.util.Scanner;

public class DanglingElse_3_3 {

	public static void main(String[] args) {

		int x = 0;
		int y = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Geben Sie einen Wert für x ein: ");
		x = sc.nextInt();
		System.out.print("Geben Sie einen Wert für y ein: ");
		y = sc.nextInt();

		// Aufgabe a) -> x = 5 , y = 8
		System.out.println("\nAufgabe a) ");
		if (y == 8) {
			if (x == 5) {
				System.out.println("@@@@@");
			}
		} else {
			System.out.println("#####");
		}
		System.out.println("$$$$$");
		System.out.println("&&&&&");

		// Aufgabe b)
		System.out.println("\nAufgabe b) ");
		if (y == 8) {
			if (x == 5) {
				System.out.println("@@@@@");
			}
		} else {
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
		}

		// Aufgabe c)
		System.out.println("\nAufgabe c) ");
		if (y == 8) {
			if (x == 5) {
				System.out.println("@@@@@");
			}
		} else {
			System.out.println("#####");
			System.out.println("$$$$$");
		}
		System.out.println("&&&&&");

		// Aufgabe d)
		System.out.println("\nAufgabe d) ");
		if (y == 7) {
			if (x == 5) {
				System.out.println("@@@@@");
			} else {
				System.out.println("#####");
				System.out.println("$$$$$");
				System.out.println("&&&&&");
			}
		}

		sc.close();
	}

}
