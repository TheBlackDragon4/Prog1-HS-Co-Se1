package uebungsblatt3_schleifen;

import java.util.Scanner;

public class Rechentest_3_15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			int mathsOperations = (int) (Math.random() * 4); // 4 wegen +,-,*,/

			int x = (int) (Math.random() * 32); // Zufällige Zahl für x soll erstellt werden
			int y = (int) (Math.random() * 32); // Zufällige Zahl für x soll erstellt werden

			switch (mathsOperations) {

			case 0: // Addition +
				System.out.println(x + " + " + y);
				int correctResultAddition = x + y;
				System.out.println("Geben Sie das richtige Ergebnis ein: ");
				int result = sc.nextInt();

				if (result == correctResultAddition) {
					System.out.println("Wow. Das war richtig ");
				} else {
					System.out.println("Denke nochmals nach!! ");
				}
				break;
			case 1: // Subtraction -
				System.out.println(x + " - " + y);
				int correctResultSubtraction = x - y;
				System.out.println("Geben Sie das richtige Ergebnis ein: ");
				int resultAddition = sc.nextInt();

				result(resultAddition, correctResultSubtraction);
				break;
			case 2: // Multiplication *
				System.out.println(x + " * " + y);
				int correctResultMuliplication = x * y;
				System.out.println("Geben Sie das richtige Ergebnis ein: ");
				int resultMultiplication = sc.nextInt();

				result(resultMultiplication, correctResultMuliplication);
				break;
			case 3: // Division /
				if (y != 0) { //Ganzzahlige Division
					System.out.println(x + " / " + y);
					int corrctResultDivision = x / y;
					System.out.println("Geben Sie das richtige Ergebnis ein: ");
					int resultDivision = sc.nextInt();

					if (resultDivision == corrctResultDivision) {
						System.out.println("Wow. Das war richtig ");
					} else {
						System.out.println("Denke nochmal nach!!");
					}
				}
				break;
			}			
		}		
	}

	public static void result(int result, int corrctResult) {

		if (result == corrctResult) {
			System.out.println("Wow. Das war richtig ");
		} else {
			System.out.println("Denke nochmal nach!!");
		}

	}

}
