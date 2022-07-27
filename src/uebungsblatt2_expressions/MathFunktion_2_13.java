package uebungsblatt2_expressions;

import java.util.Scanner;

public class MathFunktion_2_13 {

	public static void main(String[] args) {

		int n, m;
		double x, y;
		double a0 = 1.0;
		double a1 = 2.5;
		double a2 = 0.1;
		double a3 = 0.0;
		double a4 = 0.8;
		double a5 = 0.0;
		double a6 = 1.5;

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte n eingeben: ");
		n = sc.nextInt();

		System.out.println("Bitte m eingeben: ");
		m = sc.nextInt();

		System.out.println("Bitte x eingeben: ");
		x = sc.nextDouble();

		// Ausdruck 1:
		y = Math.log(Math.abs(n - m) * x);
		System.out.println("1) y= " + y);

		// Ausdruck 2:
		y = Math.sin(((n + m) / 2.0) * x) - Math.cos(((n - m) / 2.0) * x);
		System.out.println("2) y= " + y);

		// Ausdruck 3:
		y = 0.5 * ((double) (n - m) / (n + m)) * x * Math.exp(-(n + m) * Math.pow(x, 2));
		System.out.println("3) Y= " + y);

		// Ausdruck 4:
		y = a0 - (a1 * x) + (a2 * Math.pow(x, 2)) - (a3 * Math.pow(x, 3)) + (a4 * Math.pow(x, 4))
				- (a5 * Math.pow(x, 5)) + (a6 * Math.pow(x, 6));
		System.out.println("4) y= " + y);

		// Ausdruck 5:
		y = (Math.pow(Math.exp(x) + x, 2)) / (0.5 * x + Math.exp(x)) - Math.exp(x);
		System.out.println("5) y= " + y);

		sc.close();
	}

}
