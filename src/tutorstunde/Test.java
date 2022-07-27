package tutorstunde;

public class Test {

	static int calls;

	public static void main(String[] args) {
		System.out.println(" " + strange(5) + " " + calls);
	}

	public static long strange(int n) {
		calls++;
		if (n == 0)
			return 1;
		if (n % 2 == 0)
			return n * strange(n / 2);
		else
			return n + strange(n - 1);
	}

}
