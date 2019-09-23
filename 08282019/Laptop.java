package ucionica;

public class Laptop {
	private String marka;
	private Polaznik polaznik;
	public Laptop(String marka, Polaznik polaznik) {
	
		this.marka = marka;
		this.polaznik = polaznik;
	}
	Polaznik getPolaznik() {
		return polaznik;
	}
	void setPolaznik(Polaznik polaznik) {
		this.polaznik = polaznik;
	}
	String getMarka() {
		return marka;
	}
	
	public void brisanjePolaznika() {
		polaznik=null;
	}
	
	public String ispisi() {
		String s;
		if(this.polaznik!=null) {
			s=polaznik.ispisi();
		}else {
			s="Nema polaznika!";
		}
		return marka+"{"+s+"}";
	}
	
	

}
