package uebungsblatt2_expressions;

public class Inkrements_2_10 {

	public static void main(String[] args) {

		//Aufgabe 1 vier verschiedene Anweisungen die x um 1 auf addieren
		int x = 0;
		
		//Beispiel 1
		x = x + 1;
		//Beispiel 2
		x++; // x Variable wird nach Durchlauf der Zeile um eins aufaddiert	
		//Beispiel 3
		++x; // x Variable wird vor Zeilendurchlauf um eins aufaddiert 
		//Beispiel 4
		x = 1 + x;
		
		
		//Aufgabe 2 Java Anweisungen schreiben
		//a)
		int xa = 1;
		int ya = 2;
		
		int za = xa + ya;
		xa++; //xa wird nach Durchlauf dieser Zeile um 1 erhöht
		
		System.out.println(xa);
		
		//b)
		int counter = 11; //Zuweisung von 11 der Variable Counter
		
		if(counter > 10) //Überprüfung ob counter größer als 10 -> in diese Fall korrekt
			System.out.println("Count is greater than 10");
		
		//c)
		int xc = 5;
		int total = 10;
		
		xc--; //xc wird nach durchlauf dieser Zeile um 1 subtrahiert
		int result = total - xc;
		
		System.out.println(result);
		
		//d)
		int q = 12;
		int divisor = 7;
		
		q = q % divisor;
		q %= divisor;
		
		int  resultxd = q;
		System.out.println(resultxd);
		
		
		//Aufgabe 3
		int product = 5;
		int quotient = 5;
		int xADrei = 5;
		
		product *= xADrei++; //xADrei wird nach Durchlauf dieser Zeile um 1 aufaddiert -> Also xADrei ist nun 6
		quotient /= ++xADrei; //xADrei wird bevor gerechnet wird noch einmal um 1 aufaddiert -> Also xADrei ist nun 7
		
		int resulta = product;
		int resultb = quotient;
		
		System.out.println(resulta);
		System.out.println(resultb);
	}

}
