package aufgabenKontrolle_Handschriftlich;

public class Reise_Aufgabe_12 {

	private final int preis;
	private final int dauer;
	private final String beginn;
	private final String ziel;
	private boolean gebucht;

	public Reise_Aufgabe_12(int preis, int dauer, String beginn, String ziel) {
		this.preis = preis;
		this.dauer = dauer;
		this.beginn = beginn;
		this.ziel = ziel;
		gebucht = false;
	}

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

	public void setGebucht(boolean gebucht) {
		this.gebucht = gebucht;
	}

	public boolean istGebucht() {
		return gebucht;
	}

	public String toString() { // toString muss vorhanden sein, sonst funktioniert der Aufruf nicht mehr 
		return "\nPreis: " + preis + " € Ziel: " + ziel + " Beginn: " + beginn + " Dauer: " + dauer + "Wo gebucht: "
				+ gebucht;
	}
}
