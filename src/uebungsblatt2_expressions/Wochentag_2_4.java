package uebungsblatt2_expressions;

import java.time.temporal.WeekFields;
import java.util.Scanner;

public class Wochentag_2_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tag eingeben: ");
		int day = sc.nextInt(); //day of the month
		
		System.out.println("Monat eingeben: ");
		int month = sc.nextInt(); //month of the year (Januar und Februar als Monat 13 und 14 des Vorjahres
		
		
		System.out.println("Jahr eingeben: ");
		int year = sc.nextInt(); //year of the century
				
		int century = 0; //year of the century
		int weekday = 0; //weekdays 0 = Sonntag bis 6 = Samstag
		
		
		century = year / 100;
		year = year % 100;
		
		
		if(month == 1 || month == 2) {
			month += 12;
			weekday = (day + (26*(month + 1))/10 + (5 * (year - 1))/4 + century/4 + 5 * century - 1) % 7;
		}else if(month == 13 || month == 14) 			
			weekday = (day + (26*(month + 1))/10 + (5 * (year - 1))/4 + century/4 + 5 * century - 1) % 7;
		else 
			weekday = (day + (26*(month + 1))/10 + (5 * year)/4 + century/4 + 5 * century - 1) % 7;
		
		
		
		System.out.println(weekday);
		if(weekday == 0) 
			System.out.println("Sonntag");
		else if (weekday == 1) 
			System.out.println("Montag");
		else if (weekday == 2) 
			System.out.println("Dienstag");
		else if (weekday == 3) 
			System.out.println("Mittwoch");
		else if (weekday == 4) 
			System.out.println("Donnerstag");
		else if (weekday == 5) 
			System.out.println("Freitag");
		else if (weekday == 6) 
			System.out.println("Samstag");
		
		sc.close();
	}

}
