package tutorstunde;

public class PKWTest {

	public static void main(String[] args) {

		PKW pkw1 = new PKW("Audi", 60, 38.2, 6.2, 75000);
		PKW pkw2 = new PKW("KIA", 70, 45.6, 7.5, 25000);
		PKW pkw3 = new PKW("Merzedes", 80, 55.6, 5.9, 85000);
		PKW pkw4 = new PKW("Hyndai", 60, 35.8, 6.3, 7500);
		PKW pkw5 = new PKW("VM-Golf", 70, 23.9, 6.9, 65000);

		System.out.println(pkw1.toString());
		System.out.println(pkw2.toString());
		System.out.println(pkw3.toString());
		System.out.println(pkw4.toString());
		System.out.println(pkw5.toString());

		pkw1.fahre(30);
		System.out.println("\n" + pkw1.toString());

	}

}
