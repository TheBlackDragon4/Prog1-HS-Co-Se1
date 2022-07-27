package uebungsblatt5_Klassen_Methoden;

import java.util.Scanner;

public class Triangle_5_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte a eingeben: ");
		double a = sc.nextDouble();
		System.out.println("Bitte b eingeben: ");
		double b = sc.nextDouble();

		double hypotenuse = Triangle_5_3.hypotenuse(a, b);
		System.out.println("Hypotenuse c= " + hypotenuse);

		sc.close();
	}

	public static double hypotenuse(double a, double b) {
		//double result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
	}
}
