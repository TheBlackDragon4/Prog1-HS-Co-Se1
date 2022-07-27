package aufgabenBlatt_Klausuraufgaben;

public class FernseherTest {

	public static void main(String[] args) {

		Fernseher_8 f1 = new Fernseher_8(4);

		f1.speichereSendername("ARD");
		f1.naechsterSpeicherplatz();
		f1.speichereSendername("ZDF");
		f1.naechsterSpeicherplatz();
		f1.speichereSendername("N24");
		f1.naechsterSpeicherplatz();
		f1.speichereSendername("NTV");
		f1.naechsterSpeicherplatz();
		System.out.println(f1.sucheSender("ARD"));
		System.out.println(f1.sucheSender("N24"));
		System.out.println(f1.sucheSender("NTV"));
		System.out.println(f1.sucheSender("ZDF"));
		System.out.println(f1.toString());
	}
}
