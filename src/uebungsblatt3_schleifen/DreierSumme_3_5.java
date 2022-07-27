package uebungsblatt3_schleifen;

import java.util.Scanner;

public class DreierSumme_3_5 {

	public static void main(String[] args) {

		int n;
		int result = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Geben Sie einen Wert für n ein: ");
		n = sc.nextInt();

		if (n < 3) {
			result = 0;
			System.out.println("Summe = " + result);
		} else if (n >= 3) {

			// FOR - SCHLEIFE -> AUFGABE a)
			for (int i = 3; n >= i; i += 3) {

				if((n - i) >= 3) {
					System.out.print(i + " + ");
				}else {
					System.out.print(i);
				}
				result += i;
			}
			System.out.println("\nSumme = " + result);

			// WHILE - SCHLEIFE -> AUFGABE b)
			result = 0;
			int j = 3;
			while (n >= j) {

				if((n - j) >= 3) {
					System.out.print(j + " + ");
				}else {
					System.out.print(j);
				}
				result += j;
				j += 3;
			}

			System.out.println("\nSumme = " + result);

			// DO-WHILE - SCHLEIFE -> AUFGABE c)
			result = 0;
			int k = 3;
			do {
				
				if((n - k) >= 3) {
					System.out.print(k + " + ");
				}else {
					System.out.print(k);
				}
				result += k;
				
				k += 3;
			} while (n >= k);
			System.out.println("\nSumme = " + result);
		}
		sc.close();
	}

}
