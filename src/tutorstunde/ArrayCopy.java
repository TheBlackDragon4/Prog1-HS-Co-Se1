package tutorstunde;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {

		int[] a = { 1, 2, 25, 6, 11, 13 };
		int[] b = { 9, 18, 5, 34 };
		int[] c = (int[]) copy(a, b);
		
		System.out.println(Arrays.toString(c));
	}

	public static int[] copy(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];

		for(int i = 0; i < a.length; i++) 
			result[i] = a[i];
		
		for(int i = 0; i < b.length; i++) 	
			result[a.length + i] = b[i];
 		
		return result;
	}

}
