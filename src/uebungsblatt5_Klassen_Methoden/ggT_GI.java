package uebungsblatt5_Klassen_Methoden;

public class ggT_GI {

	public static void main(String[] args) {

		int zahl1 = 9;
		int zahl2 = 3;
		
		
		int biggernumber = 0;
		int lowernumber = 0;
		int puffer = 0;
		
		if(zahl1 < zahl2) {
			biggernumber = zahl2;
			lowernumber = zahl1;
		}else {
			biggernumber = zahl1;
			lowernumber = zahl2;
		}
		
		do {
			puffer = biggernumber % lowernumber;
			biggernumber = lowernumber;
			lowernumber = puffer;
		}while(puffer != 0);
		
		System.out.println(puffer);
	}

}
