package aufgabenBlatt_Klausuraufgaben;

public class Fernseher_8 {

	// Instanzvariablen
	private String[] fernsehSender;
	private int ausgewaehlterSpeicherplatz; // Der Speicherplatz an dem ich beim Zappen stehengeblieben bin

	// Konstruktor
	public Fernseher_8(int anzahlSpeicherplaetze) {
		fernsehSender = new String[anzahlSpeicherplaetze];
		ausgewaehlterSpeicherplatz = 0;
	}

	// Methoden
	public int naechsterSpeicherplatz() {
		if (++ausgewaehlterSpeicherplatz == fernsehSender.length) {
			ausgewaehlterSpeicherplatz = 0;
		}
		return ausgewaehlterSpeicherplatz;
	}

	public void speichereSendername(String sendername) { //Kein Rückgabewert
		fernsehSender[ausgewaehlterSpeicherplatz] = sendername;
	}

	public boolean sucheSender(String sendername) {

		for (int i = 0; i < fernsehSender.length; i++) {
			//if(fernsehSender[i] == sendername) //Referenzgleichheit : FALSCH
			if (fernsehSender[i].equals(sendername)) { //Wert und Inhaltsgleichheitsprüfung
				return true;
			}
		}
		return false; // Zurückliefern des Speicherplatzes
	}

	// toString - Methode
	public String toString() {
		return "Fernsehsender: \n1= " + fernsehSender[0] + "\n2= " + fernsehSender[1] + "\n3= " + fernsehSender[2] + "\n4= " + fernsehSender[3];
	}
}
