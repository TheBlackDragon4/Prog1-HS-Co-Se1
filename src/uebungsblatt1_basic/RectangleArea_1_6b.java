package uebungsblatt1_basic;

public class RectangleArea_1_6b {

	public static void main(String[] args) {
		int x1 = Integer.parseInt(args[0]);
		int y1 = Integer.parseInt(args[1]);
		int x2 = Integer.parseInt(args[2]);
		int y2 = Integer.parseInt(args[3]);
				
		int grundflaeche = x2 - x1;
		int hoehe = y1 - y2;
		
		int area = grundflaeche * hoehe;
		
		System.out.println(area);
		
	}

}
