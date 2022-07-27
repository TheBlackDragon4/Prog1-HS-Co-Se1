package uebungsblatt7_Strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Stringzerlegung_7_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Gebe bitte einen Satz ein:");
		String sentencesToTokenize = sc.nextLine();
		
		StringTokenizerSatzMitgegeben(sentencesToTokenize); 
		StringTokenizerSatzVorgegeben(); // Vorgegebener String wird in Teilen aufgeteilt

		sc.close();
	}

	public static void StringTokenizerSatzVorgegeben() {

		// Hier wird der Satz der aufgesplitet werden soll als String mitgegeben
		String arrayOfTokensString[];
		StringTokenizer tokens = new StringTokenizer("Das ist ein Test");
		
		StringBuffer output = new StringBuffer();
		int count = tokens.countTokens();
		arrayOfTokensString = new String[count];
		int i = count - 1;
		
		output.append("Number of elements: " + count + "\nThe tokens are:\n");
		
		while (tokens.hasMoreTokens()) {
			arrayOfTokensString[i--] = tokens.nextToken();
		}
		
		for (int k = 0; k < count; k++)
			output.append(arrayOfTokensString[k] + "\n");
		
		System.out.println(output);
	}
	
	public static void StringTokenizerSatzMitgegeben(String sentencesToTokenize) {
		
		//Hier wird der Satz der aufgesplitet werden soll als String mitgegeben
		String arrayOfTokensString[];
		StringTokenizer tokens = new StringTokenizer(sentencesToTokenize);
		
		StringBuffer output = new StringBuffer();
		int count = tokens.countTokens();
		arrayOfTokensString = new String[count];
		int i = count - 1;
		
		output.append("Number of elements: " + count + "\nThe tokens are:\n");
		
		while (tokens.hasMoreTokens()) {
			arrayOfTokensString[i--] = tokens.nextToken();
		}
		
		for (int k = 0; k < count; k++)
			output.append(arrayOfTokensString[k] + "\n");
		
		System.out.println(output);
		
	}

}
