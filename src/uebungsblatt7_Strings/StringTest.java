package uebungsblatt7_Strings;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte Text eingeben: ");
		String s = sc.nextLine();
		System.out.println("Bitte char eingeben:");
		String key = sc.next();
		int count = 0;
		int last = -2, current = 0;

		for (int j = -1; j < s.length();) {
			current = s.indexOf(key, ++j);

			if (current != -1 && current != last) {
				last = current;
				count++;
			}
		}

		System.out.println("Number of " + key + "'s: " + count);
		
		sc.close();
	}
}
