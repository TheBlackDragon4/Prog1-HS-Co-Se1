package uebungsblatt5_Klassen_Methoden;

public class Employee_5_1 {

	// Attribute
	private String firstName;
	private String lastName;
	public static int numberofObjekts = 0; // Klassenvariable -> Wird nur einmal angelagt. Daher auch Static

	// Konstruktoren
	public Employee_5_1(String first, String last) {
		numberofObjekts += 1;
		this.firstName = first;
		this.lastName = last;
	}

	public String toString() {
		return ("Vorname: " + firstName + "\tNachname: " + lastName);
	}

	public String outputCounter() {
		return ("\nObjektnummer: " + numberofObjekts);
	}

	// Hier soll nur der Counter ausgegeben werden. -> keine Typische
	// Objektorientierung
	public static int getCount() {
		return numberofObjekts;
	}

	// Getter & Setter
	// Getter -> Holt sich den entsprechenden Wert heraus
	// Setter -> Schreibt eine mitgegebene Variable in die Variable der Klasse ->
	// Beschrieben durch this.
	public String getFirstName() {
		return this.firstName;
	}

	// Set Methode := Schreibmethoden
	public void setFirstName(String first) {
		this.firstName = first;
	}

	// Get Methode := Lesemethoden
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String last) {
		this.lastName = last;
	}
}
