package uebungsblatt3_schleifen;

import java.util.Scanner;

public class ControllStrukture_3_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte gebe Bedingung (true / false) an: ");
		boolean bedingung = sc.nextBoolean();
		System.out.println("Bitte gebe einen Zahlenwert ein: ");
		int wert = sc.nextInt();

		for(int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		
		
		while (bedingung == true) {
			System.out.println("Bedingung ist wahr");
			break; // Beendet while-Schleife
		}
		
		int n = 1;
		switch (n) {
		
		case 1:
			System.out.println("afjalf");
		case 2:
			System.out.println("afjoajf");
			break;
		default:
			System.out.println("ahjflöajf");
			break;
		}
		
		
		if (wert == 0) {
			System.out.println("Wert ist 0");
		} else if (wert == 1) {
			System.out.println("Wert ist 1");
		} else if (wert == 2) {
			System.out.println("Wert ist 2");
		} else {
			System.out.println("Wert ist weder 0, noch 1, noch 2");
		}
		
		sc.close();

	}

}
