package uebungsblatt4_Arrays;

import java.util.Scanner;

public class Tabellenkalkulation_4_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte Zeilenzahl angeben: ");
		int row = sc.nextInt();
		System.out.println("Bitte Spaltenzahl angeben: ");
		int column = sc.nextInt();

		int table[][] = new int[row][column];
		
		for (int i = 0; i < table.length; i++) {// For Schleife Iteriert �ber die Zeilen
			int sumrow = 0;
			for (int j = 0; j < table[i].length; j++) {// For Schleife Iteriert �ber die Spalten
				table[i][j] = (int) (Math.random() * 9); // Zuf�llige Zahl f�r number soll generiert werden
				sumrow += table[i][j];
				System.out.print(table[i][j] + "  ");
			}
			System.out.println(" || " + sumrow);
		}

		System.out.println("================================");
		//hier muss das Mehrdimensionale Array einfach rumgedreht werden.
		for (int i = 0; i < table[0].length; i++) { // For Schleife iteriert �ber die Spalten
			int sumcolumn = 0;
			for (int j = 0; j < table.length; j++) { // For Schleife iteriert �ber die Zeilen
				sumcolumn += table[j][i];
			}
			System.out.print(sumcolumn + " ");
		}
		
		//Beispiel f�r Verk�rzte Vorschleife
		//for (int element:spaltensummen) //F�r alle Elemente aus dem Beispielsarry Spaltensumme (nimmt alle Element von 0 bis .length)
		//	System.out.println(element + "  ");
		
		sc.close();
	}
}
