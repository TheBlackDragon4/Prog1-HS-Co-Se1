package uebungsblatt5_Klassen_Methoden;

public class CharacterUtil_5_7 {

	public static boolean vertausche(char[] s, char[] t, int a) {
		if (s.length != t.length) {
			return false;

		} else {
			for (int i = 0; i < s.length; i++) {
				char tmp = s[i]; // Dereferenzieren
				s[i] = t[i];
				t[i] = tmp;
			}
			a++;
			return true;
		}
	}

	public static boolean vertauschen2(char[] s, char[] t) {
		//char tmp[] = s;
		char[] tmp = s;
		s = t;
		t = tmp;

		return true;
	}
}
