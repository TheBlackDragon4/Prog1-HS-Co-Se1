package uebungsblatt2_expressions;

public class Bloecke_2_9 {

	public static void main(String[] args) {
		
		
		
		{//Block A
			int x = 5; //Lebensdauer & Sichtbar bis Ende von A
			int y = 5; //Lebensdauer & Sichtbar bis Ende von A
			
			{//Block B
				float f = 4; //Lebensdauer & Sichtbar bis Ende von B
				float g = 2; //Lebensdauer & Sichtbar bis Ende von B
				
				x = 20;
							
				{//Block C
					int z = 0; //Lebensdauer & Sichtbar bis Ende von C
					float h = 0; //Lebensdauer & Sichtbar bis Ende von C
				}
				y = 3000; //Diese Zuweisung ist möglich, da die Deklaration für alle
						  //nachfolgenden Klammern Gültigkeit haben
			}
			//h = 5.0f; //-> h kann hier nicht zugewiesen werden, da h im Block C Deklariert 
					  //-> ist und hier eben keine Initialisierung möglich ist
			
			//z = 4.0f; //-> Nicht möglich da Deklaration in Block C war und hier keine Gültigkeit hat
			
		}
	}

}
