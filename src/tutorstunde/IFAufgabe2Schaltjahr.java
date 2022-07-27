package tutorstunde;

import java.util.Scanner;

public class IFAufgabe2Schaltjahr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Gib einen Wert für ein Schaltjahr ein: ");
		int year = sc.nextInt();
		
		if(year % 4 != 0) 
			System.out.println(year + " ist KEIN Schaltjahr. ");
		else if(year % 4 == 0  && year % 100 != 0)
			System.out.println(year + " ist EIN Schaltjahr. ");
		else if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
			System.out.println(year + " ist EIN Schaltjahr. ");
				
		
	}

}
