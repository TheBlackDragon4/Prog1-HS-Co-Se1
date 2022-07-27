package uebungsblatt5_Klassen_Methoden;

//import java.util.Scanner;

public class Temperature_5_2 {

	public static void main(String[] args) {

		// Alternative mit Arrays
		float fahrenheitArray[] = { 10.0f, 3.3f, 5.5f, 45.5f };
		float celsiusArray[] = { -10.0f, 0.0f, 16.5f, 36.0f };
		
		System.out.println("Conversion Fahrenheit to Celsius: ");
		for(int i = 0; i < fahrenheitArray.length; i++) {
			// <class>.<Methodenname>(<Eingabewert)>
			float resultFahrenheit = Temperature_5_2.toCelsius(fahrenheitArray[i]);
			System.out.println(" Fahrenheit: " + fahrenheitArray[i] + " Celsius: " + resultFahrenheit);
		}
		
		System.out.println("\nConversion Celsius to Fahrenheit: ");
		for(int i = 0; i < celsiusArray.length; i++) {
			// <class>.<Methodenname>(<Eingabewert)>
			float resultCelsius = Temperature_5_2.toFahrenheit(celsiusArray[i]);
			System.out.println(" Celsius: " + celsiusArray[i] + " Fahrenheit: " + resultCelsius);
		}
		
		// Alternative ohne Arrays mit Eingabe durch Benutzer
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Conversion Fahrenheit to Celsius: ");
		 * System.out.println("Bitte Geben Sie einen Wert für Fahrenheit ein: "); float
		 * fahrenheit = sc.nextFloat(); float resultFahrenheit;
		 * 
		 * // <class>.<Methodenname>(<Eingabewert)> resultFahrenheit =
		 * Temperature_5_2.toCelsius(fahrenheit); System.out.println("Fahrenheit: " +
		 * fahrenheit + " Celsius: " + resultFahrenheit);
		 * 
		 * System.out.println("\nConversion Celsius to Fahrenheit: ");
		 * System.out.println("Bitte Geben Sie einen Wert für Celsius ein: "); float
		 * celsius = sc.nextFloat(); float resultCelsius;
		 * 
		 * // <class>.<Methodenname>(<Eingabewert)> resultCelsius =
		 * Temperature_5_2.toFahrenheit(celsius); System.out.println("Celsius: " +
		 * celsius + " Fahrenheit: " + resultCelsius); sc.close();
		 */
	}

	// <Datentyp> <name> <Datentyp> <Wert>
	public static float toCelsius(float fahrenheit) {
		return ((5.0f / 9.0f) * (fahrenheit - 32.0f));
	}

	// <Datentyp> <name> <Datentyp> <Wert>
	public static float toFahrenheit(float celsius) {
		return (9.0f / 5.0f * celsius + 32.0f);
	}
}
