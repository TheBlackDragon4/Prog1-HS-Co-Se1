package tutorial;

import java.util.Arrays;

public class Vertauschen {

	public static void main(String[] args) {

		char[] c = { 'a', 'b', 'c', 'd' };
		char[] d = { 'x', 'y' };
		char[] tmp = null;

		// original arrays
		System.out.println("original arrays: ");
		System.out.println("c=" + Arrays.toString(c));
		System.out.println("d=" + Arrays.toString(d));
		
		tmp = c;
		c = d;
		d = tmp;

		// after exchange
		System.out.println("\nexchange arrays: ");
		System.out.println("c=" + Arrays.toString(c));
		System.out.println("d=" + Arrays.toString(d));


		// Speicheraddresse ausgeben
		System.out.println("\n" + c.toString());

	}

}
