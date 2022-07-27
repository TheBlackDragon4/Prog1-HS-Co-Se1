package uebungsblatt2_expressions;

public class WahroderFalsch_2_8 {

	public static void main(String[] args) {
		
		//Aufgabe 1 
		//-> a, d und e 
		
		//Variablen Aufgabe 1
		int a = 2;
		int x = 5;
		
		
		int ya = a * x * x * x + 7;
		System.out.println("a): " + ya);
		
		int yb = a * x * x * (x +  7);
		System.out.println("b): " + yb);
		
		int yc = x * (a * x) * x * (x + 7);
		System.out.println("c): " + yc);
		
		int yd = (a * x) * x * x + 7;
		System.out.println("d): " + yd);
		
		int ye = a * (x * x * x) + 7;
		System.out.println("e): " + ye);
		
		int yf = a * x * (x * x + 7);
		System.out.println("f): " + yf);
		
		double yRight = a * Math.pow(x, 3) + 7;
		System.out.println("Richtig: " + yRight);
		
		
		//Aufgabe 2
		int xa = 7 + 3 * 6 / 2 - 1; //Alle Werte stehen in einer Zeile -> Auswertung von links nach rechts
		System.out.println("\na): " + xa);
		
		int xb = 2 % 2 + 2 * 2 - 2 / 2; //Alle Werte stehen in einer Zeile, -> Auswertung von links nach rechts
		System.out.println("b): " + xb);
		
		int xc = (3 * 9 * (3 + (9 * 3 / (3)))); //Auswertung ausgehend von der innersten Klammer
		System.out.println("c): " + xc);
	}

}
