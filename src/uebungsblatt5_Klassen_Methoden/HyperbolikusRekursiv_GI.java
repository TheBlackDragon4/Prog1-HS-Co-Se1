package uebungsblatt5_Klassen_Methoden;

public class HyperbolikusRekursiv_GI {

	public static void main(String[] args) {

		int x = 2;
		int n = 1;
		
		System.out.println(hyperbolikusRekursiv(x, n));
	}

	public static int hyperbolikusRekursiv(int x, int n) {

		int tmp = 1;

		if (n == 1) {
			return x / n;
		} else {
			tmp = x * x;
			return n + (tmp / hyperbolikusRekursiv(x, n - 2));
		}

	}

}
