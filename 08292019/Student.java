package skola;

public class Student extends Covek {
	private static int UID = 0;
	private int brIndeksa;
	private int trenutnaGodStudija;
	private double trenutniProsek;

	public Student(String ime, String prezime, int godRodjenja) {
		super(ime, prezime, godRodjenja);
		brIndeksa = ++UID;
		trenutnaGodStudija= 0;
		trenutniProsek = 0;
	}

	public static int getUID() {
		return UID;
	}

	public int getBrIndeksa() {
		return brIndeksa;
	}

	public int getTrenutnaGodStudija() {
		return trenutnaGodStudija;
	}

	public double getTrenutniProsek() {
		return trenutniProsek;
	}

	public void trenutnaGodStudija(int trenutnaGod) {
		trenutnaGodStudija+= trenutnaGod;
	}

	public void trenutniProsek(double trenutniPro) {
		trenutniProsek += trenutniPro;
	}

	public String ispisi() {
		return getIme()+" _ " +getPrezime() + " [ " + getGodRodjenja() + " ] " + "  student " + trenutnaGodStudija + " godine studija sa prosekom "
				+ trenutniProsek;
	}

}
