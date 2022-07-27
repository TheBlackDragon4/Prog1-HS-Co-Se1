package aufgabenKontrolle_Handschriftlich;

import java.io.PrintStream;
import java.util.Scanner;

public class Test {

	private static int calls;

	public static void main(String[] args) {
		 casting();
		// calculate();
		// output();
		// System.out.println(" " + strange(5) + " " + calls);
		// System.out.println(sum(5));
		// System.out.println(something(10));
	}

	// Rekursiver Aufruf
	public static long strange(int n) {
		calls++;
		if (n == 0)
			return 1;
		if (n % 2 == 0)
			return n * strange(n / 2);
		else
			return n + strange(n - 1);
	}

	// Rekursiver Aufruf
	public static int sum(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n + sum(n - 1);
		}
	}

	// Rekursiver Aufruf
	public static int something(int n) {
		if (n % 15 == 0)
			return n;
		return something(n + n % 13);
	}

	// Zahlenkonvertierungen
	public static void casting() {
		int a = 4;
		float x = a;
		double y = x;
		boolean b = false;
		char ca = '5';
		char cb = 'G';
		char[] c = { 'a', 'h', 'g' };
		char[] d = { 'd', 'u', 'p', 'z', 'h' };

		y = a; // aus "4" wird "4.0" gemacht float liegt über int
		a = (int) (x); // Cast von float in int
		ca = (char) (a); // Cast von int zu char
		x = 2.5f; // Bei Zuweisung darf das "f" nicht vergessen werden
		// x = y; // geht nicht, da y double und x float ist
		c = d; // c & d sind beides Array vom Typ char
		a = ca; // Cast von char zu int problemlos möglich
		a = cb; // Cast von char zu int problemlos möglich

		int rand = (int) (Math.random() * 200);
		System.out.println(rand);

		String[] month = { "Januar", "Februar", "Maerz" };
		for (int i = 0; i < month.length; i++) {
			if (month[i].equals("Februar")) {
				// System.out.println(i);
			}
		}

		// Verkürzte For - Schleife nur für lesende Berechtigungen
		for (String s : month) { // for ([Datentyp] [Variable] : [Array zum auslesen]){}
			System.out.println(s);
		}

		String[] aaa = { "Peter", "Hans", "Walter", "Dieter" };
		if (aaa[0].equals("Peter")) {
			// (if(aaa[0] == "Peter") {
			System.out.println(aaa[0]);
		} else {
			System.out.println("False");
		}

		int count = 0;
		for (int i = 0; i < 10; i++) {
			// System.out.println(i); // For - Schleife wird 10 mal aufgerufen
			count++;
		}
		System.out.println(count);
	}

	// Berechnungen verschiedener Aufgaben
	public static void calculate() {

		double sum = 1.2 + 6 / 2 * 3 % 4 + 1 / 2 * 2;
		System.out.println(sum);

		int i = 1, j = 2, k = 3;
		if ((--i == 1) && (++j == 3)) {
			System.out.println("Nose " + k--);
		} else if ((i == 0) && (j == 3)) {
			System.out.println("Mouth " + --k);
		} else {
			System.out.println("Ear " + k++);
		}

		int a = 3, b = 2;
		for (int ii = 1; ii < 4; ii = ii + 2) {
			a = a + b++;
			b = a - ii / a;
			System.out.println(a + " " + b);
		}
	}

	// Output
	public static void output() {
		int age = 45;
		int income = 37000;
		if (age > 50) {
			if (income > 30000) {
				System.out.println("Platinum member A");
			} else {
				System.out.println("Gold member A");
			}
		} else if (age > 40) {
			if (income > 40000) {
				System.out.println("Platinum member B");
			} else if (income > 30000) {
				System.out.println("Gold member B");
			} else {
				System.out.println("Silver member B");
			}
		} else if (age > 30) {
			if (income > 50000) {
				System.out.println("Platinum member C");
			} else if (income > 40000) {
				System.out.println("Gold member C");
			} else if (income > 30000) {
				System.out.println("Silver member C");
			} else {
				System.out.println("Ordinary member C");
			}
		} else {
			System.out.println("Ordinary member D");
		}

		PrintStream output = System.out;
		int j = 1;
		for (int i = 5; (i - j) > 0; --i) {
			int a = i + j;
			int b = 1 / i + 1 / j;
			j++;
			output.printf("a = %d, b = %d\n", a, b);
		}

		for (int i = 13; i > 0; i = i % 5) {
			if (i++ == 4) {
				System.out.println("Hello World!");
			} else {
				System.out.println("Hello York!");
			}
		}

		Scanner scanner = new Scanner(System.in);
		int result = 1;

		System.out.print("Input the number of terms: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i += 2) {
			double term = 1. + 1. / i;
			result *= term;
			System.out.println(term);
		}
		System.out.print("The result is \n" + result);
		scanner.close();

	}

}
