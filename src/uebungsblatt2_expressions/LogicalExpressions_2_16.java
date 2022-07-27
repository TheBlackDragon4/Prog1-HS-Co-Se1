package uebungsblatt2_expressions;

import java.util.Scanner;

public class LogicalExpressions_2_16 {

	public static void main(String[] args) {

		// Aufgabe a)
		int a, b, c, d;
		boolean result = false;

		// Aufgabe b)
		Scanner sc = new Scanner(System.in);

		System.out.print("Geben Sie einen Wert für a ein: ");
		a = sc.nextInt();
		System.out.print("Geben Sie einen Wert für b ein: ");
		b = sc.nextInt();
		System.out.print("Geben Sie einen Wert für c ein: ");
		c = sc.nextInt();
		System.out.print("Geben Sie einen Wert für d ein: ");
		d = sc.nextInt();

		System.out.println("\nAusgabe 1\tAusgabe 2\tAusgabe 3\tAusgabe 4\t");

		// Aufgabe c) -> Aussage 1 Mindestens eine der Variablen a, b, c, d, hat einen
		// Wert > 1
		if ((a > 1) || (b > 1) || (c > 1) || (d > 1))
			result = true;

		System.out.print("" + result + "\t");

		// Aussage 2 Mindestens eine, jedoch höchstens drei der Variablen a, b, c, d
		// haben einen Wert > 1
		// ! bedeutet NICHT
		if (((a > 1) && (b > 1) && (c > 1) && (d > 1)) || ((a >= 1) && (b >= 1) && (c >= 1) && (d >= 1)))
			result = false;
		else
			result = true;

		System.out.print("\t " + result + "\t");

		// Aussage 3 Genau eine der Variablen a, b, c, d hat einen Wert < 0;
		if ((a < 0) && (b >= 0) && (c >= 0) && (d >= 0) || 
			(b < 0) && (a >= 0) && (c >= 0) && (d >= 0) || 
			(c < 0) && (a >= 0) && (b >= 0) && (d >= 0) ||
			(d < 0) && (a >= 0) && (b >= 0) && (c >= 0)) 
			result = true;
		else 
			result = false;

		System.out.print("\t " + result + "\t");
		
		//Aussage 4 Alle Variablen a, b, c, d deren Werte > 0 sind, sind auch > 10.
		if(((a > 0 && a > 10) || a <= 0) && ((b > 0 && b > 10) || b <= 0) && 
		   ((c > 0 && c > 10) || c <= 0) && ((d > 0 && d > 10) || d <= 0))
			result = true;
		else 
			result = false;
		
		System.out.println("\t " + result + "\t");
				
		sc.close();
	}

}
