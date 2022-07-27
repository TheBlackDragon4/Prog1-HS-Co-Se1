package uebungsblatt7_Strings;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringDateFormatieren {

	public static void main(String[] args) throws ParseException {

		dateFormat();
		dateFormaSimpleDateFormat();
		aktuellesDatumKompakt();
		datumManuellEingeben();

	}

	public static void dateFormat() {

		DateFormat formatDate = DateFormat.getDateInstance();
		System.out.println("Objekt: " + formatDate);

		// String Weiterleitung
		String dateString0 = formatDate.format(new Date());
		
		// Ausgabe
		System.out.println(dateString0 + "\n"); // In diesem Fall wird das Datum von heute ausgegeben
		
	}

	public static void dateFormaSimpleDateFormat() {

		SimpleDateFormat formatDate = new SimpleDateFormat("MM/dd/yyyy"); // Mitgabe des Datumsformat
		
		//Ausgabe des Formats
		Date date = new Date();
		String dateString = formatDate.format(date);
		System.out.println("Original: " + dateString);
		
		//Initialisierung der Datumsformatierung
		DateFormat dateFormat = DateFormat.getDateInstance();
		System.out.println("Objekt: " + dateFormat);
		
		//String Formatierung 
		String outputString = dateFormat.format(new Date());
		
		//Konsolenausgabe
		System.out.println(outputString + "\n");
		
	}
	
	public static void aktuellesDatumKompakt() {
		
		Date zeitstempel = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		String outputString = simpleDateFormat.format(zeitstempel);
		System.out.println("Datum: " + outputString);
		
	}
	
	public static void datumManuellEingeben() throws ParseException {
		
		String dateString = "25.06.2021 12:55:16";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		Date zeitstempel = simpleDateFormat.parse(dateString);
		System.out.println(zeitstempel);
		
	}

}
