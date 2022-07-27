package uebungsblatt1_basic;

public class Sum_1_6a {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[2]);
		
		int result = 0;
		int counter = 1;
		
		while (counter <= n){
			result = result + counter;
			counter = counter + 1;	 

		}
		System.out.println(result);
	}

}
