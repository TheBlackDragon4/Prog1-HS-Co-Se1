package uebungsblatt3_schleifen;

import java.util.Scanner;

public class SpaghettiCode_3_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Geben Sie einen Wert für x ein: ");
		double x = sc.nextInt();

		if (x == 0) {
			System.out.println(x);
		} else {
			if (x > 2005) {
				x /= Math.sqrt(x);
				System.out.println(x);
			} else {
				x /= x * (x + x);
				x /= x * x;
				System.out.println(x);
			}

		}
		
		sc.close();
		
	}

}
