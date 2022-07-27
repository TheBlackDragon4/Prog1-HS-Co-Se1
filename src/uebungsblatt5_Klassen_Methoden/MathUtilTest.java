package uebungsblatt5_Klassen_Methoden;

import java.util.Scanner;

public class MathUtilTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// a) Überprüfung ob Zahl gerade oder ungerade
		System.out.println("Bitte Zahl eingeben für gerade(true) und ungerade(false): ");
		int zahlTestGeradeUngerade = sc.nextInt();
		int resultGeradeUngerade = MathUtil_5_4.isEven(zahlTestGeradeUngerade);
		if (resultGeradeUngerade == 0)
			System.out.println("Zahl: " + zahlTestGeradeUngerade + " ist gerade -> true.");
		else if (resultGeradeUngerade == 1)
			System.out.println("Zahl: " + zahlTestGeradeUngerade + " ist ungerade -> false.");

		// b) Überprüfung und Berechnung des größten gemeinsamen Teilers
		System.out.println("\nBitte Zahl1 für größten gemeinsamen Teiler angeben: ");
		int zahl1 = sc.nextInt();
		System.out.println("Bitte Zahl2 für größten gemeinsamen Teiler angeben: ");
		int zahl2 = sc.nextInt();
		int ggT = MathUtil_5_4.gcd(zahl1, zahl2);
		System.out.println("Größter gemeinsamer Teiler von Zahlen: " + zahl1 + " und " + zahl2 + " ist " + ggT);

		// c) Berechnung des Minimums von drei Floatingpoint Zahlen
		System.out.println("\nBitte 3 Kommazahlen für Minimumberechnung eingeben: ");
		float floatnumber0 = sc.nextFloat();
		float floatnumber1 = sc.nextFloat();
		float floatnumber2 = sc.nextFloat();
		System.out.println("Der Minimumbetrag aus " + floatnumber0 + " und " + floatnumber1 + " und " + floatnumber2
				+ " ist: " + MathUtil_5_4.minimum3(floatnumber0, floatnumber1, floatnumber2));

		// d) Berechnung von der Basis b mit dem Exponenten e
		System.out.println("\nBitte die Basis b eingeben: ");
		float base = sc.nextFloat();
		System.out.println("Bitte den Exponenten eingeben: ");
		float exponent = sc.nextFloat();
		System.out.println("Das Ergebnis aus " + base + " zum Exponent " + exponent + " Lautet: "
				+ MathUtil_5_4.integerPower(base, exponent));

		// e) //soll in Abhängikeit von n ein Quadrat aus **** bilden
		System.out.println("\nBitte eine Zahl für Parameter n eingeben: ");
		int n = sc.nextInt();
		MathUtil_5_4.printAsteriks(n);
		
		sc.close();
	}

}
