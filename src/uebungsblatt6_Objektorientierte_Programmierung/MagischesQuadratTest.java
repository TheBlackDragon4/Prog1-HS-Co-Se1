package uebungsblatt6_Objektorientierte_Programmierung;

import java.util.Scanner;

public class MagischesQuadratTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] a1 = { { 2, 2, 2, 2 }, { 2, 2, 2, 2 }, { 2, 2, 2, 0 }, { 2, 2, 2, 2 } };
		int[][] a2 = { { 2, 2, 2, 2 }, { 2, 2, 2, 2 }, { 2, 2, 2, 2 }, { 2, 2, 2, 2 } };
		int[][] a3 = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };
		int[][] a4 = { { 2, 3, 3, 4 }, { 2, 5, 5, 2 }, { 5, 7, 2, 2 }, { 4, 7, 9, 2 } };
		int[][] a5 = { { 1, 3, 3, 1 }, { 3, 2, 2, 2 }, { 5, 3, 3, 2 }, { 4, 7, 9, 4 } };

		MagischesQuadrat_6_5 wert1 = new MagischesQuadrat_6_5(a1);
		System.out.println(wert1.spaltenSumme(4));
		
		
		
		sc.close();
	}
}
