package tutorial;

public class Utils {

	public static boolean isPalindromArray(int[] array) {
		return isPalindromArray(array, 0, array.length - 1);

	}
	
	//Hilfsmethode 
	public static boolean isPalindromArray(int[] array, int startIndex, int endIndex) {
		// rekursiv implementieren
		// if(array.length == 1)
		// return true;

		if (startIndex >= endIndex)
			return true;

		if (array[startIndex] != array[endIndex])
			return false;

		return isPalindromArray(array, startIndex + 1, endIndex - 1);
	}

	public static void main(String[] args) {
		int[] a = { 2, 2, 1, 2, 2 };

		System.out.println(isPalindromArray(a));

	}
}
