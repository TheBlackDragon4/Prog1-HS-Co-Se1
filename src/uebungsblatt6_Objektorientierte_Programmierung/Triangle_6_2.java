package uebungsblatt6_Objektorientierte_Programmierung;

public class Triangle_6_2 {

	private final Point_6_2 a;
	private final Point_6_2 b;
	private final Point_6_2 c;

	// Konstruktor
	public Triangle_6_2(final Point_6_2 a, final Point_6_2 b, final Point_6_2 c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// Liefert den Umfang des Dreiecks
	public double perimeter() {
		double ab = a.distance(b); // Vektor zwischen AB
		double bc = b.distance(c); // Vektor zwischen BC
		double ca = c.distance(a); // Vektor zwischen CA
		return ab + bc + ca; // Berechnung des Umfangs -> Vektoren AB + BC + CA + zusammenrechnen
	}

	// Liefet die Fläche des Dreiecks
	public double area() {
		double ab = a.distance(b); // Vektordistanz zwischen AB
		double bc = b.distance(c); // Vektordistanz zwischen BC
		double ca = c.distance(a); // Vektordistanz zwischen CA
		double s = (ab + bc + ca) / 2; // Vektordistanzergebnisse werden ausgerechnet und durch 2 geteilt
		double result = Math.sqrt(s * (s - ab) * (s - bc) * (s - ca)); // Flächenberechnung der Dreicksfläche
		return result;
	}

	// Liefert die linke untere Ecke des umschreibenden Rechtecks dieses Dreiecks.
	// Das umschreibende Rechteck ist das kleinste achsenparallele Rechteck, das
	// diese Dreieck vollständig enthält.
	public Point_6_2 lowerLeft() {
		return null;
	}

	// Liefet die rechte obere Ecke des umschreibenden Rechtecks dieses Dreiecks.
	public Point_6_2 upperLeft() {
		return null;
	}

	// Erzeugt ein horizontal um dx und vertikal um dy verschobenes Dreieck. Die
	// Methode lässt dieses Dreieck unverändert und liefert das verschobene Dreieck
	// als neues Objekt
	public Triangle_6_2 moved(final double dx, final double dy) {
		return null;
	}

	// Erzeugt ein um den Faktor f gestrecktes Dreieck. Zentrum der Streckung ist
	// der Koordinatenursprung. Die Methode lässt dieses Dreieck unverändert und
	// liefert das gestrecket Dreieck als neues Objekt.
	public Triangle_6_2 zoomed(final double f) {
		return null;
	}

	// Erzeugt ein um den Faktor f gestrecktes Dreick. Zentrum der Strekcung ist der
	// Punkt p. Die Methode lässt dieses Dreieck unverändert und liefert das
	// gestreckte Dreieck als neues Objekt.
	public Triangle_6_2 zoomed(Point_6_2 p, final double f) {
		return null;
	}

	public static void main(String[] args) {

		final Triangle_6_2 t1 = new Triangle_6_2(new Point_6_2(-1, 0), new Point_6_2(0, 2), new Point_6_2(1, 0));
		System.out.println("Umfang des Dreiecks t1: " + t1.perimeter()); // 6.47
		System.out.println("Flächeninhalt des Dreiecks t1: " + t1.area()); // 2.0

		Triangle_6_2 t2 = t1;
		t2 = t2.zoomed(new Point_6_2(0, 1), -1);
		t2 = t2.moved(0, -1);
		// Ausgabe des umschliessenden Rechtecks
		System.out.println(t2.lowerLeft()); // -1 -1
		System.out.println(t2.upperLeft()); // 1, 1

	}
}
