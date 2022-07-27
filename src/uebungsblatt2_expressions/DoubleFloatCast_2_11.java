package uebungsblatt2_expressions;

import tutorstunde.IFAufgabe1;

public class DoubleFloatCast_2_11 {

	public static void main(String[] args) {

		int zaehler = 14;
		int nenner = 4;
		
		float quotient;
		
		//Aufgabe a)
		quotient = zaehler / nenner;
		System.out.println("a) " + quotient);
		float test = zaehler % nenner;
		System.out.println("a) " + test);
		
		//Aufgaben b)
		quotient = (float) (zaehler / nenner);
		System.out.println("\nb) " + quotient);
		
		//Aufgabe c)
		quotient = (float) zaehler / nenner;
		System.out.println("\nc) " + quotient);

		quotient = zaehler / (float) nenner;
		System.out.println("c) " + quotient);
		
	}

}
