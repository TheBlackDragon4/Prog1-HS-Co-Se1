package aufgabenBlatt_Klausuraufgaben;

public class ReiseAgentTest_Aufgabe_12 {

	public static void main(String[] args) {
		
		ReiseAgent_Aufgabe_12 reise1 = new ReiseAgent_Aufgabe_12(3);
		
		System.out.println(reise1.toString());
		reise1.buchen("Italien" , "04.05.2011");
		reise1.buchen("Spanien" , "04.05.2011");
		reise1.buchen("Malta" , "04.05.2011");
		reise1.buchen("Griechenland" , "04.05.2011");
		reise1.buchen("Italien" , "04.05.2011");
		
		System.out.println(reise1.toString());
		
	}
}
