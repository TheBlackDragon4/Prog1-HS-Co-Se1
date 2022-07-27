package uebungsblatt4_Arrays;

import java.util.Arrays;

public class Anweisung_4_1 {

	public static void main(String[] args) {

		final int ARRAY_SIZE = 10;
		float total = 0.0f;
		float fractions[] = new float[ARRAY_SIZE];
		
		for (int i = 0; i < fractions.length; i++)
			fractions[i] = 0;

		fractions[3] = 4.5f;
		fractions[fractions.length - 1] = 5.3f;
		
		for(int i = 0; i < fractions.length; i++) 
			total += fractions[i];
		
		System.out.println(Arrays.toString(fractions));
		System.out.println("total is = " + total);		
	}

}
