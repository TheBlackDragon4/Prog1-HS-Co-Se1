package aufgabenBlatt_Klausuraufgaben;

public class Reise_Aufgabe_12 {

	private final int preis; // Final Variable sorgen dafür, dass die Variable nur einmal erstellt und danach
								// nie wieder verändert werden darf
	private final int dauer;
	private final String beginn;
	private final String ziel;
	private boolean gebucht;

	// Konstruktor
	public Reise_Aufgabe_12(int preis, int dauer, String beginn, String ziel) {
		this.preis = preis;
		this.dauer = dauer;
		this.beginn = beginn;
		this.ziel = ziel;
		gebucht = false;
	}

	// Getter & Setter
	public int getPreis() {
		return this.preis;
	}

	public int getDauer() {
		return this.dauer;
	}

	public String getBeginn() {
		return this.beginn;
	}

	public String getZiel() {
		return this.ziel;
	}
	//Setter für alle anderen Variablen liefern fehler -> Da final
	public void setGebucht(boolean gebucht) {
		this.gebucht = gebucht;
	}

	//Nach Getter / Setter kommen alle weiteren Methoden
	public boolean istGebucht() {
		return gebucht;
	}

	// To String Methode am Ende
	public String toString() { // toString muss vorhanden sein, sonst funktioniert der Aufruf nicht mehr
		return "\nPreis: " + preis + " € Ziel: " + ziel + " Beginn: " + beginn + " Dauer: " + dauer + "Wo gebucht: "
				+ gebucht;
	}
}
