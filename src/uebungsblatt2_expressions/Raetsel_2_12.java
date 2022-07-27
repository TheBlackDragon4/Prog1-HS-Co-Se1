package uebungsblatt2_expressions;

public class Raetsel_2_12 {

	public static void main(String[] args) {
		/*
		 * double a; // Initialisierung von a (Speicherplatz wird reserviert) int d; //
		 * Initialisierung von d (Speicherplatz wird reserviert) a = 5; // Deklaration
		 * von a mit 5 int b = 9; // Initialisierung von b und Deklaration mit 9
		 * (Speicherplatz wird reserviert // und verwendet) d =
		 * Integer.parseInt(args[0]); // Eingabe von d durch den Benutzer double c; //
		 * Initialisierung von c als Doubler (Speicherplatz wird reserviert)
		 * System.out.println("Input: " + d); // Ausgabe von Input: + d -> Ausgabe des
		 * eingegebenen Wert für d
		 * 
		 * c = a / b; // Ganzzahlige Division von double a = 5 durch int b = 9 -> double
		 * c = 0,555 -> // Wenn eine Variable double ist ist das Ergebnis double int h1
		 * = 32; // Initialisierung von h1 als int und deklaration mit 32 a = d - h1; //
		 * Berechung von int d (eingegebenen durch Benutzer) - int h1 = double -27.0 ->
		 * // Ergebnis aus d - h1 wird in ein double gecastet a = a * c; // Ergebnis auf
		 * double a = -27.0 * double c = 0.55555 -> -15,00...
		 * System.out.println("Output: " + a); // Ergebnis von a wird ausgegeben
		 */

		double a = 5; 
		int b = 9;
		double c = 0;
		int h1 = 32;
		int d = Integer.parseInt(args[0]);  
		System.out.println("Input: " + d); 
		
		c = a / b; 
		a = d - h1; 
		a = a * c; 
		
		System.out.println("Output: " + a); 

	}

}
