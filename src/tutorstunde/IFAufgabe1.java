package tutorstunde;

import java.text.spi.DateFormatProvider;
import java.util.Scanner;

public class IFAufgabe1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Gib einen Wert f�r i ein: ");
		int i = sc.nextInt();
		
		if (i < 10) 
			System.out.println("Hello World!");
		else 
			System.out.println("Der Wert f�r i ist nicht kleiner als 10. ");
		
	}

}
