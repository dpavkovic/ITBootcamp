package ordinacijatest;

public abstract class Covek {

	// Covek poseduje naziv, jedinstveni automatski identifikator, JMBG i novac.
	private String naziv;// g
	private static int UID = 1;
	private int id;
	private String jmbg;// g
	private double novac;

	public Covek(String naziv, String jmbg, double novac) {

		this.naziv = naziv;
		id = ++UID;
		this.jmbg = jmbg;
		novac = 0;
	}
	// Svi sadrzani podaci mogu samo da se dohvate

	public String getNaziv() {
		return naziv;
	}

	public static int getUID() {
		return UID;
	}

	public int getId() {
		return id;
	}

	public String getJmbg() {
		return jmbg;
	}

	public double getNovac() {
		return novac;
	}

	public boolean oduzmiNovac(double pare) {
		if (pare > 0 && pare <= novac) {
			novac -= pare;
			return true;
		}
		return false;

	}

	public void dodajNovac(double pare) {
		if (pare > 0) {
			novac += pare;

		}
	}

	// Moze da se sastavi tekstualni zapis u obliku: NAZIV[ID:JMBG:NOVAC]

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv).append("[").append(id).append(":").append(jmbg).append(":").append(novac).append("]");

		return sb.toString();
	}

}
