package uebungsblatt3_schleifen;

public class Sterne_3_12 {

	public static void main(String[] args) {

		// Aufgabe a)
		System.out.println("a) ");
		for (int i = 0; i < 10; i++) { // Jede Zeile wird hier einmal durchlaufen
			for (int j = 0; j < i * 1 + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		// Aufgabe b)
		System.out.println("\nb) ");
		for (int i = 10; i > 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		// Aufgabe c)
		System.out.println("\nc) ");
		for (int i = 10; i > 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
