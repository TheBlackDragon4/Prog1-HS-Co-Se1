package uebungsblatt5_Klassen_Methoden;

public class EmployeeTest {

	public static void main(String[] args) {

		// Objekterzeugung mit verschiedenen Namen
		// <Klassenname> <Objektname> = new <Klassenname>(Wertmitgabe wie abgefragt);
		Employee_5_1 employee0 = new Employee_5_1("Alexander", "Ultsch");
		Employee_5_1 employee1 = new Employee_5_1("Thomas", "Ultsch");
		Employee_5_1 employee2 = new Employee_5_1("Matthas", "Ultsch");
		Employee_5_1 employee3 = new Employee_5_1("Rainer", "Ultsch");
		Employee_5_1 employee4 = new Employee_5_1("Elli", "Ultsch");
		Employee_5_1 employee5 = new Employee_5_1("Sandra", "Ultsch");
		Employee_5_1 employee6 = new Employee_5_1("Tamara", "Ries");
		Employee_5_1 employee7 = new Employee_5_1("Lukas", "Netsch");
		Employee_5_1 employee8 = new Employee_5_1("Walter", "Laub");
		Employee_5_1 employee9 = new Employee_5_1("Vessela", "Matthes");
		Employee_5_1 employee10 = new Employee_5_1("Ute", "Seidler");
		Employee_5_1 employee11 = new Employee_5_1("Ralf", "Seidler");
		Employee_5_1 employee12 = new Employee_5_1("Feodor", "Fominov");
		Employee_5_1 employee13 = new Employee_5_1("Patrick", "Opitz");
		Employee_5_1 employee14 = new Employee_5_1("Jonas", "Wiesner");
		Employee_5_1 employee15 = new Employee_5_1("Lukas", "Goller");

		// Ausgabe der in der entprechenden Klasse erstellten und aufgerufenen Methoden
		System.out.println(employee0.toString());
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());
		System.out.println(employee4.toString());
		System.out.println(employee5.toString());
		System.out.println(employee6.toString());
		System.out.println(employee7.toString());
		System.out.println(employee8.toString());
		System.out.println(employee9.toString());
		System.out.println(employee10.toString());
		System.out.println(employee11.toString());
		System.out.println(employee12.toString());
		System.out.println(employee13.toString());
		System.out.println(employee14.toString());
		System.out.println(employee15.toString());
		System.out.println(employee15.outputCounter());
	}
}
