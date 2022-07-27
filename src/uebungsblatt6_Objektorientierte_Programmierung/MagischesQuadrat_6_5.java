package uebungsblatt6_Objektorientierte_Programmierung;

public class MagischesQuadrat_6_5 {

	// Instanzvariablen
	// Quadrat mit verschiedenen Werten
	int[][] quad;

	// Klassenmethode zum Erzeugen von magischen Quadraten für ungerade n
	// falls n gerade liefern Sie null zurück
	public static MagischesQuadrat_6_5 erzeugeMagicQuadrat(int n) {

		// Zweidimensionales Array mit Länge von n wird erzeugt
		int quad[][] = new int[n][n];

		// Variablendeklaration
		int zeile = n / 2;
		int spalte = n / 2 + 1;
		int m = 0;

		// Magisches Quadrat ermitteln
		do {
			m++;
			quad[zeile][spalte] = m;
			zeile--;
			spalte++;
			zeile = (zeile + n) % n;
			spalte %= n;
			if (quad[zeile][spalte] != 0) {
				zeile++;
				spalte++;
				zeile %= n;
				spalte %= n;
			}
		} while (m < n * n);

		// Rückgabe des MagischenQuadrates[quad]
		return new MagischesQuadrat_6_5(quad);
	}

	// Konstruktor erzeugt eine quadratische Matrix, die alle Elemente mit n
	// initialisiert
	public MagischesQuadrat_6_5(int n) {
		this.quad = new int[n][n];
	}

	// Konstruktor erzeugt eine quadratische Matrix und initiliasiert die Matrix mit
	// den Werten von q --> Benötigt werden hier das vorhandene Array und das neu
	// erstellte Array welches nur zugewießen wird.
	public MagischesQuadrat_6_5(int[][] q) {
		this.quad = new int[q.length][q.length];

		for (int i = 0; i < q.length; i++) {
			for (int j = 0; j < q.length; j++) {
				this.quad[i][j] = quad[i][j];
			}
		}
	}

	// Liefert die arithmetische Summe für eine Zeile zurück; zeilennr gibt die
	// Zeile an
	public int zeilenSumme(int zeilennr) {
		int summe = 0;
		for (int i = 0; i < quad.length; i++) {
			summe += this.quad[zeilennr][i];
		}
		return summe;
	}

	// Liefert die arithmetische Summe für eine Spalte zurück; spaltennr gibt die
	// Spalte an
	public int spaltenSumme(int spaltennr) {
		int summe = 0;
		for (int i = 0; i < quad.length; i++) {
			summe += this.quad[i][spaltennr];
		}
		return summe;
	}

	// Liefert die arithmetische Summe der Diagonalen von LinksOben nach RechtsUnten
	// zurück
	public int diagonalSummeOToU() {
		int summe = 0;
		int zeilennummer = 0;
		int spaltennummer = 0;
		for (int i = 0; i < quad.length; i++) {
			summe += this.quad[zeilennummer++][spaltennummer++];
		}
		return summe;
	}

	// Liefert die arithmetische Summe der Diagonalen von LinksUnten nach RechtsOben
	// zurück
	public int diagonalSummeUToO() {
		int summe = 0;
		int zeilennummer = quad.length;
		int spaltennummer = 0;
		for (int i = 0; i < quad.length; i++) {
			summe = this.quad[--zeilennummer][spaltennummer++];
		}
		return summe;
	}

	// gibt true zurück, falls das Qudrat ein magisches Quadrat; ansonsten false
	public boolean isMagic() {
		int n = quad.length;
		boolean[] istmagischesQuadrat = new boolean[n * n];
		int summe = zeilenSumme(0); //Zeile 0 wird als Referenz genutzt
		//Magisches Quadrat 
		
		for(int i = 0; i < quad.length; i++) {
			if(summe != zeilenSumme(i)) {
				return false;
			}
		}
		
		for(int i = 0; i < quad.length; i++) {
			if(summe != spaltenSumme(i)) {
				return false;
			}
		}
		
		for(int i = 0; i < quad.length; i++) {
			if(summe != diagonalSummeOToU()) {
				return false;
			}
		}
		
		for(int i = 0; i < quad.length; i++) {
			if(summe != diagonalSummeUToO()) {
				return false;
			}
		}
		return true;
	}

	// gibt alle aktuellen Werte des Quadrats mit System.out.println aus
	public void print() {
		for (int i = 0; i < quad.length; i++) {
			for (int j = 0; j < quad[i].length; j++) {
				System.out.println(this.quad[i][j]);
			}
			System.out.println();
		}
	}
}
