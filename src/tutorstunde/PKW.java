package tutorstunde;

public class PKW {

	private String modell;
	private int tankkapazitaet;
	private double tankinhalt;
	private double spritverbrauch;
	private int kilometerstand;

	// Konstruktor
	public PKW(String modell, int tankkapazitaet, double tankinhalt, double spritverbrauch, int kilometerstand) {
		this.modell = modell;
		this.tankkapazitaet = tankkapazitaet;
		this.tankinhalt = tankinhalt;
		this.spritverbrauch = spritverbrauch;
		this.kilometerstand = kilometerstand;
	}

	public String toString() {
		return "Modell: " + this.modell + " Tankkapazit�t: " + this.tankkapazitaet + "L Tankinhalt: " + this.tankinhalt
				+ "L Spitzenverbrauch: " + this.spritverbrauch + "L/100km  Kilometerstand: " + this.kilometerstand
				+ "km ";
	}

	public boolean fahre(int distanz) {
		double spritNoetig = (this.spritverbrauch / 100) * distanz;
		
		if(spritNoetig > tankinhalt) {
			return false;
		}else {
			this.kilometerstand += distanz;
			this.tankinhalt -= spritNoetig;
			return true;
		}
	}

	// Getter - Setter
	public void setModell(String modell) {
		this.modell = modell;
	}

	public void setTankkapazitaet(int tankkapazitaet) {
		this.tankkapazitaet = tankkapazitaet;
	}

	public void setTankinhalt(double tankinhalt) {
		this.tankinhalt = tankinhalt;
	}

	public void setSpitzenverbrauch(double spritverbrauch) {
		this.spritverbrauch = spritverbrauch;
	}

	public void setKilometerstand(int kilometerstand) {
		this.kilometerstand = kilometerstand;
	}

	public String getModell() {
		return modell;
	}

	public int getTankkapazitaet() {
		return tankkapazitaet;
	}

	public double getTankinhalt() {
		return tankinhalt;
	}

	public int getKilometerstand() {
		return kilometerstand;
	}

}
