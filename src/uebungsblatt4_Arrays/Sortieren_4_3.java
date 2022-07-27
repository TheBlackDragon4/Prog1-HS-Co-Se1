package uebungsblatt4_Arrays;

public class Sortieren_4_3 {

	public static void main(String[] args) {

		int a[] = { 2000, 2, 45, 34, 100000, 345, 56, 78, 99, 756, 999, 0, 666, 2345, 7492, 22 };

		System.out.print("Data in original order: \n");
		for (int i = 0; i < a.length; i++)
			System.out.print("  " + a[i]);

		System.out.println("\n\nData item in ascending order: ");
		int n = a.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {// Itteriert bis zum Ende über das Array
			for (int j = 1; j < (n - i); j++) { // Läuft das Array bin hinten her ab
				if (a[j - 1] > a[j]) { // Tauscht das Element aus
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++)
			System.out.print("  " + a[i]);
	}
}
