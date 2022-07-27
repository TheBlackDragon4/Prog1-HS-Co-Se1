package uebungsblatt3_schleifen;

public class Mystery_3_10 {

	public static void main(String[] args) {

		//Mystery1
		int y, x = 1, total = 0;
		while( x <= 10) {
			y = x*x;
			System.out.print(y + " , ");
			total += y;
			++x;
		}
		
		//Mystery2
		int counter = 1;
		while(counter <= 10) {
			System.out.println(counter %2 == 1 ? "****" : "++++++");
			++counter;
		}
		
		//Mystery3
		int row = 10, column;
		while(row >= 1) {
			column = 1;
			while(column <= 10) {
				System.out.println(row % 2 == 1 ? "<" : ">");
			}
			--row;
		}
		System.out.println();
	}
}
