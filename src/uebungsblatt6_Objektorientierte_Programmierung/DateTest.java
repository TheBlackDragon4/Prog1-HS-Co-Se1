package uebungsblatt6_Objektorientierte_Programmierung;

public class DateTest {

	public static void main(String[] args) {

		// Angabe des Datumskonstruktors -> (Month, Day, Year)
		Date_6_4 d1 = new Date_6_4(8, 30, 1999);
		Date_6_4 d2 = new Date_6_4(6, 02, 1995);
		Date_6_4 d3 = new Date_6_4(5, 22, 1966);
		Date_6_4 d4 = new Date_6_4(5, 26, 1998);

		Date_6_4 d5 = new Date_6_4("August", 30, 1999);
		Date_6_4 d6 = new Date_6_4("Juni", 02, 1995);
		Date_6_4 d7 = new Date_6_4("Mai", 22, 1966);
		Date_6_4 d8 = new Date_6_4("Mai", 26, 1998);

		Date_6_4 d9 = new Date_6_4(07, 2020);
		Date_6_4 d10 = new Date_6_4(06, 1995);
		Date_6_4 d11 = new Date_6_4(30, 2001);
		Date_6_4 d12 = new Date_6_4(25, 2005);

		System.out.println("Date 1: " + d1.toString());
		System.out.println("Date 2: " + d2.toString());
		System.out.println("Date 3: " + d3.toString());
		System.out.println("Date 4: " + d4.toString());
		
		System.out.println("\nDate 5: " + d5.getDate(2));
		System.out.println("Date 6: " + d6.getDate(2));
		System.out.println("Date 7: " + d7.getDate(2));
		System.out.println("Date 8: " + d8.getDate(2));

		System.out.println("\nDate 9: " + d9.getDate(3));
		System.out.println("Date 10: " + d10.getDate(3));
		System.out.println("Date 11: " + d11.getDate(3));
		System.out.println("Date 12: " + d12.getDate(3));
	}
}
