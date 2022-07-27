package aufgabenBlatt_Klausuraufgaben;

public class Aufgabe_4 {

	public static void main(String[] args) {

		System.out.println(naheUndWeit(1, 2, 10)); //true
		System.out.println(naheUndWeit(1, 2, 3)); //false
		System.out.println(naheUndWeit(4, 1, 3)); //true
	}

	public static boolean naheUndWeit(int x, int y, int z) {

		if((Math.abs(x - y) <= 1) && (Math.abs(z - y) >= 2) &&(Math.abs(z - x) >= 2)) {
			return true;
		}else if((Math.abs(x - z) <= 1) && (Math.abs(y - z) >= 2) && (Math.abs(x - y) >= 2)) {
			return true;
		}
		return false;
	}
}
