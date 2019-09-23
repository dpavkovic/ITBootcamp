package ordinacijatest;

public class Stomatolog extends Covek {
	// Stomatolog je covek kojeg je moguce ispisati u formatu: S_COVEK
	public Stomatolog(String naziv, String jmbg, double novac) {
		super(naziv, jmbg, novac);

	}

	@Override
	public String toString() {
		return "S_" + super.toString();

	}
}
