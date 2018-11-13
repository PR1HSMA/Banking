
public class Startklasse {

	public static void main(String[] args) {
		Konto k01 = new Konto("1525962", 250, "Aytac Kocyigit");
		System.out.println(k01.einAusZahlen("einzahlen", 150));
	}

}
