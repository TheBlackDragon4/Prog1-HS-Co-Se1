package tutorstunde;

public class GGTRek {
	
	public static int ggTRek(int p, int q) {
		if(q == 0) {
			return p;
		}else {
			return ggTRek(q, p % q); 
		}
	}
	
	public static void main(String[] args) {
		System.out.println(ggTRek(12, 6)); //6
		System.out.println(ggTRek(140, 90)); //10
	}
}
