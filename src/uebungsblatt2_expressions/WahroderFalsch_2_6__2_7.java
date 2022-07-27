package uebungsblatt2_expressions;

import java.awt.geom.Path2D;

import javax.swing.text.GapContent;

import tutorstunde.IFAufgabe1;

public class WahroderFalsch_2_6__2_7 {

	public static void main(String[] args) {

		//Aufgabe 2.6
		//Aufgabe a)
		//So wie die Aufgabenstellung dargelegt ist, ist sie Falsch
		//In Java wird nach der Präzidenz auf Gültigkeit entschieden
		
		//Aufgabe b) Das sind gültige Variablennamen (alle gültig):
		int unter_bar = 5; //-> Syntaktisch Korrekt _ kann in Variable geschrieben werden (sollte vermieden werden)
		int m9281245 = 5; //-> Syntaktisch Korrekt wird aber so nicht geschrieben (Zahlen ausschreiben)
		int t5 = 5; //-> Syntaktisch Korrekt wird aber so nicht geschrieben (Zahlen ausschreiben)
		int j7 = 5; //-> Syntaktisch Korrekt -> konventionen nein
		int her_sales$ = 5; //-> Syntaktisch Korrekt -> Konventionen erlaubt
		int his_account$ = 5; //-> Syntatisch Korrekt -> Konventionen erlaubt
		int _total = 5; //-> Syntaktisch zwar korrekt -> Konventionen falsch
		int a = 5; //-> Syntaktisch korrekt -> Konventionen erlaubt
		int b$ = 5; //-> Syntaktisch korrekt -> Koventionen erlaubt
		int z = 5; //-> Syntaktisch korrekt -> Konventionen erlaubt
		int z2 = 5; //-> Syntaktisch korrekt -> konventionen falsch -> 2 muss ausgeschrieben werden
		
		//Aufgabe c) Das sind ungültige Variablennamen (alle ungültig):
		//int 3g = 5; //-> Syntaktisch falsch -> Konventionen falsch
		//int 87 = 5; //-> Syntaktisch falsch -> Da Zahlen als Variablennamen nicht zugelassern sind
		//int 67h2 = 5; //-> Syntaktisch falsch -> Zahlen in Variablennamen am Beginn nicht erlaubt
		int h22 = 5; //-> Syntaktisch richtig  -> Konventionen falsch -> Da Zahlen in Variable nicht ausgeschrieben
		//int 2h = 5; //-> Syntaktisch falsch
		
		//Aufgabe d) Gültiger Java Ausdruck von links nach rechts
		//Ja, prinzipiell schon -> Wird nach den Präzidenzen abgearbeitet (z.B: * vor + )
		
		
		//Aufgabe 2.7
		//Aufgabe a) Welche Arithmetischen Operationen haben die selbe Präzidenz wie Multiplikation
		// / % *  -> Siehe Kapitel 2 Seite 55.
		
		//Aufgabe b)
		// Variable -> Variablen Speichern unterschiedliche Werte und 
		//				können auch geändert werden sofern sie nicht auf final stehen	
	}

}
