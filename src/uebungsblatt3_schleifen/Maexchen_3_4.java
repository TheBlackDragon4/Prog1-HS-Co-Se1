package uebungsblatt3_schleifen;

import java.util.Scanner;

public class Maexchen_3_4 {

	public static void main(String[] args) {

		int result = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Bitte 1. W�rfelzahl eingeben: ");
		int diceNumberOne = sc.nextInt(); // diceNumberOne -> W�rfelzahl eins
		System.out.print("Bitte 2. W�rfelzahl eingeben: ");
		int diceNumberTwo = sc.nextInt(); // diceNumberTwo -> W�rfelzahl zwei

		if (((diceNumberOne == 1) && (diceNumberTwo == 2)) || ((diceNumberOne == 2) && (diceNumberTwo == 1))) {
			System.out.println("\nSie haben 1000 Punkte erziehlt. ");
		} else if (((diceNumberOne == 1) && (diceNumberTwo == 1)) || ((diceNumberOne == 2) && (diceNumberTwo == 2))
				|| ((diceNumberOne == 3) && (diceNumberTwo == 3)) || ((diceNumberOne == 4) && (diceNumberTwo == 4))
				|| ((diceNumberOne == 5) && (diceNumberTwo == 5)) || ((diceNumberOne == 6) && (diceNumberTwo == 6))) {
			result = diceNumberOne * 100;
			System.out.println("\nSie haben " + result + " Punkte durch einen Pasch erreicht. ");
		} else if((diceNumberOne > 6) || (diceNumberTwo > 6)){
			System.out.println("\nBitte geben Sie einen W�rfelwert zwischen 1 & 6 ein!");
		}else {
			if (diceNumberOne > diceNumberTwo) {
				result = 10 * (diceNumberOne) + (diceNumberTwo);
			} else if (diceNumberTwo > diceNumberOne) {
				result = 10 * (diceNumberTwo) + (diceNumberOne);
			}
			System.out.println("\nSie haben " + result + " Punkte durch normaliges W�rfeln.");
		}

		sc.close();
	}

}
