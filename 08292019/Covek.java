package skola;

public class Covek {
	private String ime,prezime;
	private int godRodjenja;
	
	public Covek(String ime, String prezime, int godRodjenja) {
	
		this.ime = ime;
		this.prezime = prezime;
		this.godRodjenja = godRodjenja;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getGodRodjenja() {
		return godRodjenja;
	}
	public String ispisi() {
		return ime+" _ "+prezime+" { "+godRodjenja+" } ";
	}
	
	

}
