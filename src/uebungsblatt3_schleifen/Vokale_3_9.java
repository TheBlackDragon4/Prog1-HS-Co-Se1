package uebungsblatt3_schleifen;

import java.util.Scanner;

public class Vokale_3_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char j;
		do {
			System.out.println("Bitte Satz eingeben ");
			String satz = sc.nextLine();

			char vokale;
			int counter = 0;

			int a = 0;
			int e = 0;
			int i = 0;
			int o = 0;
			int u = 0;
			int z = 0;

			while (counter < satz.length()) {

				vokale = satz.charAt(counter++);

				switch (vokale) {

				case ('a'):
				case ('A'):
					a++;
					break;
				case ('e'):
				case ('E'):
					e++;
					break;
				case ('i'):
				case ('I'):
					i++;
					break;
				case ('o'):
				case ('O'):
					o++;
					break;
				case ('u'):
				case ('U'):
					u++;
					break;
				default:
					z++; // Hierbei handelt es sich um die Konsonaten und Sonderzeichen
					break;
				}
			}

			System.out.println("a:" + a);
			System.out.println("e:" + e);
			System.out.println("i:" + i);
			System.out.println("o:" + o);
			System.out.println("u:" + u);
			System.out.println("Kons. u. Sonderzeichen:" + z);

			System.out.println("Beenden (j oder n)");
			j = sc.nextLine().charAt(0);

		} while (j != 'j');

		System.out.println("Beendet");

		sc.close();
	}

}
