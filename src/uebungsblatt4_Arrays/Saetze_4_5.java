package uebungsblatt4_Arrays;

public class Saetze_4_5 {

	public static void main(String[] args) {

		String article[] = { " the", " a", " one", " some", " any" };
		String noun[] = { " boy", " girl", " dog", " town", " car" };
		String verb[] = { " drove", " jumped", " ran", " walked", " skipped" };
		String preposition[] = { " to", " from", " over", " under", " on" };

		for (int i = 0; i < 20; i++) {

			int art = (int) (Math.random() * 5);
			int nou = (int) (Math.random() * 5);
			int ver = (int) (Math.random() * 5);
			int pre = (int) (Math.random() * 5);
			int art1 = (int) (Math.random() * 5);
			int nou1 = (int) (Math.random() * 5);

			System.out.println(
					article[art] + noun[nou] + verb[ver] + preposition[pre] + article[art1] + noun[nou1] + ".");
		}
	}
}
