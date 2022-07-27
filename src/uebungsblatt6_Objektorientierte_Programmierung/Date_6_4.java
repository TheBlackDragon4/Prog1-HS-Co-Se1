package uebungsblatt6_Objektorientierte_Programmierung;

public class Date_6_4 {

	private final int day; // 1-31 based on Month
	private int month; // 1-12
	private final int year; // any year

	// Konstruktoren
	// Format: MM DD YYYY -> 06 02 1995
	public Date_6_4(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	// Format: "June" "02" "1995"
	public Date_6_4(String month, int day, int year) {
		this.day = day;
		this.year = year;

		switch (month) {
		case "Januar":
			this.month = 1;
			break;
		case "Februar":
			this.month = 2;
			break;
		case "März":
			this.month = 3;
			break;
		case "April":
			this.month = 4;
			break;
		case "Mai":
			this.month = 5;
			break;
		case "Juni":
			this.month = 6;
			break;
		case "Juli":
			this.month = 7;
			break;
		case "August":
			this.month = 8;
			break;
		case "September":
			this.month = 9;
			break;
		case "Okrober":
			this.month = 10;
			break;
		case "November":
			this.month = 11;
			break;
		case "Dezember":
			this.month = 12;
			break;
		}

	}

	// Tag wird vogegeben und kann nicht mitgegeben werden
	public Date_6_4(int month, int year) {
		this.day = 05;
		this.month = month;
		this.year = year;
	}

	// Getter & Setter
	public void setYear(int year) {
		year = ((year >= -2000 && year < 3001) ? year : 0);
	}

	public void setMonth(int month) {
		month = ((month >= 1 && month < 13) ? month : 0);
	}

	public void setDay(int day) {
		day = ((day >= 1 && day < 32) ? day : 0);
	}

	// GETTER Falls in Testklasse "Juni" statt 06 mitgegeben wird
	public String getDate(int auswahl) {

		if (auswahl == 1) { // Ausgabe 1: MM/DD/YY
			return "Datumsformat (o. Buchstaben): " + month + "/" + day + "/" + year;
		} else if(auswahl == 2){ // Ausgabe 2: MMMM DD, YYYY

			String[] month = { "", "Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September",
					"Oktober", "November", "Dezember" };

			return "Datumsformat (Buchstaben):  " + month[this.month] + " " + day + ", " + year;
		} else { // Ausgabe 3: DD.MM.YYYY
			return "Datumsformat (o. Buchstaben): " + day + "." + month + "." + year;
		}
	}

	// To String Methode
	public String toString() {
		return getDate(1);
	}
}
