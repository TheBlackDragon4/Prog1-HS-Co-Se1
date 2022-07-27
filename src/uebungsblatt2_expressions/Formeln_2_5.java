package uebungsblatt2_expressions;

import java.util.Scanner;

public class Formeln_2_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Gib einen Wert x als Flieﬂkommazahl ein: ");
		double x = sc.nextDouble();
		System.out.println("Gib einen Wert y als Flieﬂkommazahl ein: ");
		double y = sc.nextDouble();
		double z = 0;

		// a)
		z = (Math.pow(x, 2)) * (Math.pow(y, 2)) + 4 * x * y + 4;
		System.out.println("a) " + z);

		// b)
		z = (Math.pow((1 + x * y), 2)) / (1 + Math.pow((1 + x * y), 4));
		System.out.println("b) " + z);

		// c)
		z = x * y + (3 - x) * y - y;
		System.out.println("c) " + z);

		// d)
		z = 2 * y;
		System.out.println("d) " + z);

		sc.close();
	}

}
