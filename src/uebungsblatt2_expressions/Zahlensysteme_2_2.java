package uebungsblatt2_expressions;

import java.util.Scanner;

public class Zahlensysteme_2_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		{
			System.out.println("Bitte geben Sie eine Zahl dezimal ein:");
			int dec = sc.nextInt();
			System.out.println("Hex: " + Integer.toHexString(dec));
			System.out.println("Binär: " + Integer.toBinaryString(dec));
		}
		{
			System.out.println("Bitte geben Sie eine Zahl hexadezimal ein:");
			String hex = sc.next();
			System.out.println("Dezimal: " + Integer.parseInt(hex, 16));
			int dec = Integer.parseInt(hex, 16);
			System.out.println("Binär: " + Integer.toBinaryString(dec));
			//System.out.println("Binär: " + Integer.toBinaryString(Integer.parseInt(hex, 16)));
		}
		{
			System.out.println("Bitte geben Sie eine Zahl binär ein:");
			String bin = sc.next();
			System.out.println("Dezimal: " + Integer.parseInt(bin, 2));
			System.out.println("Hex: " + Integer.toHexString(Integer.parseInt(bin, 2)));
		}
		{
			System.out.println("Bitte geben Sie eine Zahl octal ein:");
			String oct = sc.next();
			System.out.println("Dezimal: " + Integer.parseInt(oct, 8));
			System.out.println("Hex: " + Integer.toHexString(Integer.parseInt(oct, 8)));
		}
		
	}

}
