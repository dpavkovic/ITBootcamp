package ucionica;

public class Polaznik {
	private static int UID = 0;
	private String naziv;
	private int id;

	public Polaznik(String naziv) {
		this.naziv = naziv;
		id = ++UID;
	}

	String getNaziv() {
		return naziv;
	}

	int getId() {
		return id;
	}
	
	public String ispisi() {
		return naziv+"{"+id+"}";
	}

}
