package uebungsblatt6_Objektorientierte_Programmierung;

public class TimeTest {

	public static void main(String[] args) {

		{
			Time_6_3 time1 = new Time_6_3(13, 58, 56);
			Time_6_3 time2 = new Time_6_3(time1);
			Time_6_3 time3 = new Time_6_3();
			
			System.out.println("Time1: " + time1.toString());
			System.out.println("Time2: " + time2.toString());
			System.out.println("Time3: " + time3.toString());

			// Tick in Endlosschleife aufrufen:
			int i = 0;
			while (i <= 5000) {
				time3.tick();
				System.out.println("Current Time: " + time3.toString());
				i++;
			}
			
		}
	}
}
