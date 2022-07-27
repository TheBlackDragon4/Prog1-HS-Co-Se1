package uebungsblatt2_expressions;

import java.util.Scanner;

public class Fakultaet_2_14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte n eingeben: ");
		int n = sc.nextInt();
		long result = n;

		for (int i = 1; i < n; i++)
			result *= (n - i); // L�sung: 1 * 2 * 3 * 4 * 5 * ... * n -> Das ist Fakult�t

		System.out.println(n + "! = " + result);

		sc.close();
	}

}
