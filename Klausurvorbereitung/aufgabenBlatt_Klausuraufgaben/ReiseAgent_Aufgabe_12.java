package aufgabenBlatt_Klausuraufgaben;

import java.util.Arrays;

public class ReiseAgent_Aufgabe_12 {

	private Reise_Aufgabe_12[] reise;

	public ReiseAgent_Aufgabe_12(int n) {

		reise = new Reise_Aufgabe_12[n];
		String[] laender = { "Türkei", "Malta", "Griechenland", "Spanien", "Italien" };

		for (int i = 0; i < n; i++) {
			int preis = (int) (100 + (Math.random() * 999));
			int dauer = (int) (Math.random() * 4);
			String beginn = ("04.05.2011");
			String ziel = laender[(int) (Math.random() * laender.length)];

			Reise_Aufgabe_12 r = new Reise_Aufgabe_12(preis, dauer, beginn, ziel);

			reise[i] = r;
		}
	}

	public ReiseAgent_Aufgabe_12(Reise_Aufgabe_12[] reise) { // Alternativkonstruktor
		this.reise = reise;
	}

	public Reise_Aufgabe_12 buchen(String ziel, String beginn) { // .equals -> Inhalt / Wert wird überprüft

		for (Reise_Aufgabe_12 r : reise) { // Verkürzte For - Schleife -> Nur für das Lesen verwendbar
			if (r.getZiel().equals(ziel) && r.getBeginn().equals(beginn) && r.istGebucht() == false) {
				r.setGebucht(true);
			}
			return r;
		}
		return null;
	}

	
	public void stornieren(Reise_Aufgabe_12 r) {
		if(r != null) {
			for(int i = 0 ; i < reise.length; i++) { 
				if(reise[i] == r) {
					r.setGebucht(false);
				}
			}
		}
	}

	// .equals -> Inhaltsgleichheit
	// == Referenzgleichheit

	public String toString() {
		return Arrays.toString(reise);
	}
}
