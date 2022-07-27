package tutorstunde;

import java.util.Scanner;

public class Wochentag_Switch_Case_Uebung {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Geben Sie einen Wert für einen Wochentag an: ");
		int wochentag = sc.nextInt(); // Mitgabe des Wochentags

		
		switch (wochentag) {
		case 1:
			System.out.println("Montag");
			break;
		case 2:
			System.out.println("Dienstag");
			break;
		case 3:
			System.out.println("Mittwoch");
			break;
		case 4:
			System.out.println("Donnerstag");
			break;
		case 5:
			System.out.println("Freitag");
			break;
		case 6:
			System.out.println("Samstag");
			break;
		case 7:
			System.out.println("Sonntag");
			break;
		default:
			System.out.println("Kein Wochentag Zuordbar");
		}
		

		sc.close();
	}

}
