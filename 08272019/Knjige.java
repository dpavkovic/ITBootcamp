package domaci;

public class Knjige {
	private String nazivKnjige;
	private String autor;
	private int brStrana;
	private int godIzdanja;

	public Knjige(String nazivKnjige, String autor, int brStrana) {
		this.nazivKnjige = nazivKnjige;
		this.autor = autor;
		this.brStrana = brStrana;
	}

	public String getNazivKnjige() {
		return nazivKnjige;
	}

	public String getAutor() {
		return autor;

	}

	public int getBrStrana() {
		return brStrana;
	}

	public int getGodIzdanja() {
		return godIzdanja;

	}

	public void setGodIzdanja(int godIzdanja) {
		this.godIzdanja = godIzdanja;

	}
}
