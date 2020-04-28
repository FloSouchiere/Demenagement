package demenagement;
public class demenager {
	public static void nb_of_boxes() {
		int boxes = 0;
		int slots = 34;
		while (slots > 0) {
			slots--;
			boxes++;
			if (boxes == 9 || slots == 0) {
				System.out.println("un voyage de " + boxes + " cartons");
				boxes = 0;
			}
		}
	}
}