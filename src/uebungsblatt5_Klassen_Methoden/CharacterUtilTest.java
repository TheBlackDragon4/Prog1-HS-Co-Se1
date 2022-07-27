package uebungsblatt5_Klassen_Methoden;

import java.util.Arrays;

public class CharacterUtilTest {

	public static void main(String[] args) {

		char[] s = { 'S', 'O', 'R', 'T', 'B', 'Y' };
		char[] t = { 'B', 'U', 'B', 'B', 'L', 'E' };
		int a = 4;
		
		System.out.println("Vor Aufruf vertauschen: ");
		System.out.println("s=" + Arrays.toString(s));
		System.out.println("t=" + Arrays.toString(t));

		CharacterUtil_5_7.vertausche(s, t, a);

		// s hat die Inhalte von t und t hat die Inhalte von s
		System.out.println("\nNach Aufruf vertauschen: ");
		System.out.println("s=" + Arrays.toString(s));
		System.out.println("t=" + Arrays.toString(t));

		// Teilaufgabe b)
		char[] tmp = s;
		s = t;
		t = tmp;
		
		CharacterUtil_5_7.vertauschen2(s, t);
		System.out.println("\nNach Aufruf von vertauschen2:");
		System.out.println("s=" + Arrays.toString(s));
		System.out.println("t=" + Arrays.toString(t));
		// Erklärung:
		// Hier wurde erstmal ein neues Array mit dem Namen tmp[] erstellt.
		// Dieses neue Array habe ich auf den Speicherbereich von Array s[] zeigen
		// lassen.
		// Da ich nun wieder s auf den Speicherbereich t zeigen habe lassen, kann ich
		// nun das Array s[] auf tmp[] zeigen lassen.
		// Hier handelt es sich nur um Zeiger.
		// Im Vergleich zur anderen, oben beschriebenen Methode muss ich sagen, dass
		// hier keine Indezes umgeschrieben werden.
	}
}
