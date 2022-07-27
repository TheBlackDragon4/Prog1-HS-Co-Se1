package uebungsblatt3_schleifen;

import java.util.Scanner;

public class Pi_3_13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Geben Sie die Genauigkeit an: ");
		int accuracy = sc.nextInt();
		double PI = 0.0;
		double zaehler = 4.0;
		double nenner = 1.0;

		System.out.println("Accuracy: " + accuracy);
		for (int i = 0; i <= accuracy; i++) {
			if (i % 2 == 1) {
				PI = PI - (zaehler / nenner);
			} else {
				PI = PI + (zaehler / nenner);
			}
			System.out.println("Term " + i + ": \t" + PI);
			nenner += 2.0;
		}
		
		sc.close();
	}
}
