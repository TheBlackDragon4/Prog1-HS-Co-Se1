package uebungsblatt2_expressions;

public class Infinity_2_15 {

	public static void main(String[] args) {

		float zaehler;
		float nenner;

		zaehler = (float) (-2.5 * Math.pow(10, 27));
		nenner = (float) (-3.4 * Math.pow(10, -12));

		// Aufgabe 1
		float quotient;
		quotient = zaehler / nenner; // Werte für Zaehler und Nenner sind extrem Groß, daher wird Infinity
										// ausgegeben. Infinity heist Unendlichkeit und das Ergebnis wird ebenfalls sehr
										// sehr groß.
		System.out.println(quotient); // Daher Ausgabe "Infinity"

		// Aufgabe 2
		// a)
		System.out.println(Math.sqrt(-4)); // Wurzel von -4 kann nicht berechnet werden -> Negative Wurzel nicht möglich
		System.out.println(0.0 / 0.0); // null Durch Null ergibt einen Mathefehler

		// b)
		System.out.println(1E300 * 1E300); // Da die Werte zu groß sind, kommt einmal Infintiy oder -Infinity raus. Auch
											// Vergleichbar mit + & - Unendlich
		System.out.println(-1E300 * 1E20);
	}

}
