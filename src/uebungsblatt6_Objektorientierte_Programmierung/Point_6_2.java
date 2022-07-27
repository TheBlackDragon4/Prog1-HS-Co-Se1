package uebungsblatt6_Objektorientierte_Programmierung;

public class Point_6_2 {

	// Instanzvariable
	private final double x;
	private final double y;

	// Konstruktor
	public Point_6_2(final double x, final double y) {
		this.x = x;
		this.y = y;
	}

	// Getter & Setter
	public double getx() {
		return x;
	}

	public double gety() {
		return y;
	}

	public double distance(final Point_6_2 p) {
		//Rechenregel für Distanzberechnung: a = VEKTOR |a| = WURZEL(a1^2 + a2^2 + a3 ^2)
		return Math.sqrt(Math.pow(x - p.x, 2)  + Math.pow(y - p.y, 2));
		//Alternativ:
		//return Math.hypot(x - p.x, y - p.y);
	}
	
	public String toString() {
		return ("x: " + x + " y: " + y);
	}

	public static void main(String[] args) {

		Point_6_2 p1 = new Point_6_2(4, 10);

		System.out.println(p1);
		System.out.println(p1.toString());
	}
}
