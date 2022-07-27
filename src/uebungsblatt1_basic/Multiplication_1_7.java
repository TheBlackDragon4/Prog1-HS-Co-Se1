package uebungsblatt1_basic;

import java.util.Scanner;

public class Multiplication_1_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = Integer.parseInt(args[0]);
		//int n = 0; 
		
		int result = 1; 
		int counter = 3; //Das mit 3 begonnen werden soll wird in Aufgabe vorgegeben
		
		System.out.println("Bitte geben sie einen Wert für n eingeben");
		int n = sc.nextInt();
		
		while(counter <= n){
			result = result * counter; //Multiplikation mit dem Zähler
			counter = counter + 1;	// Zähler wird mit 1 aufaddiert			
		}
		System.out.println(result);

	}

}
