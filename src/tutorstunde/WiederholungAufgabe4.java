package tutorstunde;

public class WiederholungAufgabe4 {

	public static boolean naheUndWeit(int x, int y, int z) {
		if (Math.abs(y - x) <= 1 || Math.abs(z - x) <= 1) {
			if (Math.abs(x - z) >= 2 && Math.abs(y - z) >= 2 || 
				Math.abs(x - y) >= 2 && Math.abs(z - y) >= 2) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(naheUndWeit(1, 2, 10)); // true
		System.out.println(naheUndWeit(1, 2, 3)); // false
		System.out.println(naheUndWeit(4, 1, 3)); // true
	}
}
