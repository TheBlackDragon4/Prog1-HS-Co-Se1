package aufgabenBlatt_Klausuraufgaben;

public class VorsortierteArrayRekursiv_Aufgabe_11 {

	public static int elemEnthaltenIn(int[] array, int elem) {
		
		return elemEnthaltenIn(array, 0, array.length - 1, elem);
	
	}

	public static int elemEnthaltenIn(int[] array, int lowIndex, int highIndex, int elem) {

		if(lowIndex > highIndex) {
			return -1;
		}
		int mittelwert = (highIndex + lowIndex) / 2;
		
		if(elem == array[mittelwert]) {
			return mittelwert;
		}else if(elem < array[mittelwert]) {
			return elemEnthaltenIn(array, lowIndex, mittelwert - 1, elem);
		}else {
			return elemEnthaltenIn(array, mittelwert + 1, array.length - 1, elem);
		}
	}

	public static void main(String[] args) {

		int[] array = { 5, 10, 34, 100, 3003, 40000 };
		
		System.out.println("3003: " + elemEnthaltenIn(array, 3003));
		System.out.println("100: " + elemEnthaltenIn(array, 100));
		System.out.println("5: " + elemEnthaltenIn(array, 5));
		System.out.println("40000: " + elemEnthaltenIn(array, 40000));
	}
}
