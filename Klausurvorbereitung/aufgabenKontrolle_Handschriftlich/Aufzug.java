package aufgabenKontrolle_Handschriftlich;

public class Aufzug {

	// Aufgabenstellung: https://i.imgur.com/EQUSIEX.png

	private int aktuelleStockwerke;
	private static int maxTragelast;// Nur für Objekte der Klasse zugänglich
	private final int maxStockwerke;
	private double aktuellesPersonenGewicht;
	
	public Aufzug(int maxStockwerke){
		this.maxStockwerke = maxStockwerke; //Wird mitgegeben
		Aufzug.maxTragelast = 200; //Kg
	}
	
	public int getStockwerke() {
		return this.aktuelleStockwerke;
	}
	
	public boolean einsteigen(double kg) {
		aktuellesPersonenGewicht += kg;
		if(aktuellesPersonenGewicht > maxTragelast) {
			return false;
		}
		return true;
	}
	
	public boolean aussteigen(double kg) {
		aktuellesPersonenGewicht -= kg;
		if(aktuellesPersonenGewicht < 0) {
			aktuellesPersonenGewicht = 0;
			return false;
		}
		return true;
	}
	
	public boolean fahreZu(int stockwerk) {
		if(aktuellesPersonenGewicht > maxTragelast) {
			return false;
		}else {
			if(aktuelleStockwerke != stockwerk) {
				return false;
			}else {
				return true;
			}
		}
	}
	
	public static void main(String[] args) {
		Aufzug a1 = new Aufzug(8);
		
		System.out.println(a1.einsteigen(70));
		System.out.println(a1.einsteigen(70));
		System.out.println(a1.einsteigen(70));
		System.out.println(a1.fahreZu(5));
	}
}
