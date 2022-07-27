package tutorstunde;

public class MitarbeiterTest {

	public static void main(String[] args) {
		
		Mitarbeiter m1 = new Mitarbeiter("Alexander");
		Mitarbeiter m2 = new Mitarbeiter("Niklas");
		Mitarbeiter m3 = new Mitarbeiter("Marcel");
		Mitarbeiter m4 = new Mitarbeiter("Pascal");
		Mitarbeiter m5 = new Mitarbeiter("Vincent");
		Mitarbeiter m6 = new Mitarbeiter("David");
		
		m2.setName("Andreas");
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		System.out.println(m4.toString());
		System.out.println(m5.toString());
		System.out.println(m6.toString());
		
	}
}
