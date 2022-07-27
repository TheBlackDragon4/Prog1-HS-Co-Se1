package tutorstunde;

public class Mitarbeiter {

	// Instanzvariable
	private int id;
	private String name;
	private static int currentID = 0; // Variable dient zum hochzählen der einzelnen IDs der Mitarbeiter

	// Konstruktor
	public Mitarbeiter(String name) {
		this.name = name;
		this.id = currentID++;
	}

	// Getter - Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	// Methoden
	
	// toString - Methode
	public String toString() {
		return "ID: " + this.id + " Mitarbeitername: " + this.name;
	}

}
