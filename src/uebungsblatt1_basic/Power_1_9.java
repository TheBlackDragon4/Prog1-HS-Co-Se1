package uebungsblatt1_basic;

public class Power_1_9 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		//int n = 4;//Beginn zu zählen bei 0....1....2....
		int result = 1;//result zeigt das entsprechend Ergebnis der Berechnung in der While-Schleife
		int counter = 1;
		int q = 0;
		
		System.out.println("Zahl\t" + "Quadrat\t" + "Kubisch");
		System.out.println("==========================");
		System.out.println(counter + "\t" + result + "\t" + result);			
		
		
		while (counter <= n) {
			
			counter = counter + 1;
			result = counter * counter;
			int result1 = result * counter;
			
			System.out.println(counter + "\t" + result + "\t" + result1);
			
			
			 
			
			//System.out.println(counter + "\t");
			
		}
		
	}

}
