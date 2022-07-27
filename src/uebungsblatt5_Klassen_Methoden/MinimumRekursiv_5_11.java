package uebungsblatt5_Klassen_Methoden;

import java.util.Scanner;

public class MinimumRekursiv_5_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] array = new int[5]; // Beispiels Array

		System.out.println("Bitte 5 ganzzahlige Werte für das Array eingeben:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Die kleinste Zahl aus dem Array ist: " + minimum(array, 0, 1));
		
		sc.close();
	}

	static int minimum(int[] array, int indexMinimum, int index) { // method for minimum

		// int[] array -> Mitgegebenes Array
		// indexMinimum -> Positionsmitgabe des Minimums im Array
		// index -> Positionsmitgabe des sich verändernden Arraywertes
		
		if (index == array.length) { //Abbruchkriterium
			return array[indexMinimum];
		} else if (array[indexMinimum] > array[index]) {
			return minimum(array, index, index + 1);
		} else {
			return minimum(array, indexMinimum, index + 1);
		}
	}
}
