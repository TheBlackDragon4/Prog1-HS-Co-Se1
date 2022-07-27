package tutorial;

import java.util.Scanner;

public class Notendurchschnitt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int summe = 0;
		int counterOfAllEntertStudents = 0;
		int currentSumOfAllStudents = 10;
		int notePoints = 0;
		int noteCounter = 0;

		for (int i = 0; i < currentSumOfAllStudents; i++) {
			int pointsOfOneStudent = 0;
			System.out.print("Bitte Punkte eingeben (-1 abbrechen): ");
			pointsOfOneStudent = sc.nextInt();
			counterOfAllEntertStudents++;

			if (pointsOfOneStudent >= 90) {
				System.out.println("Note 1: Super!! Dein Lehrer erhält einen Bonus! \n");
				notePoints += 1; // Note 1
				noteCounter += 1;
			} else if (pointsOfOneStudent >= 80) {
				System.out.println("Note 2: Gut gemacht \n");
				notePoints += 2; // Note 2
				noteCounter += 1;
			} else if (pointsOfOneStudent >= 70) {
				System.out.println("Note 3: Weiter so! Schau Dir nochmal die Fehler an! \n");
				notePoints += 3; // Note 3
				noteCounter += 1;
			} else if (pointsOfOneStudent >= 60) {
				System.out.println("Note 4: Das kann man noch verbessern... \n");
				notePoints += 4; // Note 4
				noteCounter += 1;
			} else if (pointsOfOneStudent >= 0) {
				if (pointsOfOneStudent == -1) {
					counterOfAllEntertStudents--;
					break;
				} else {
					System.out.println("Note 5: Das musst Du wohl nochmal schreiben \n");
					notePoints += 5; // Note 5
					noteCounter += 1;
				}
			}

			summe += pointsOfOneStudent;
		}

		int durchschnitt = summe / counterOfAllEntertStudents;
		System.out.println("\nPunktedurchschnitt: " + durchschnitt);

		double notendurchschnitt = (double) notePoints / noteCounter;
		System.out.println("Noten durchschnitt: " + notendurchschnitt);

		sc.close();
	}
}
