package tutorstunde;

public class DoWhileSchleife {

	public static void main(String[] args) {

		int counter = 0;
		
		do {
			System.out.println(counter);
			counter++;
		}while(counter <= 20);
		
		System.out.println(counter); //Nach der do-While Schleife wird der counter dennoch dennoch um 1 hochgezählt
		
	}
	
}
