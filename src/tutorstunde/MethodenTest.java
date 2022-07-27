package tutorstunde;

public class MethodenTest {

	public static void main(String[] args) {
		System.out.println(hochDrei(2));
		System.out.println(hochDrei(3));
	}
	
	public static int hochDrei(int x) {
		return (int) Math.pow(x,3);
	}
		

}
