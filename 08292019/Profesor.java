package skola;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Covek {
	private String titula;
	private List<String>predmeti;
	public Profesor(String ime, String prezime, int godRodjenja, String titula) {
		super(ime, prezime, godRodjenja);
		this.titula = titula;
		predmeti = new ArrayList<>();
	}
	public String getTitula() {
		return titula;
	}
	public void addPredmet(String predmet) {
		predmeti.add(predmet);
	}

	public boolean izbaciPredmet(String predmet) {
		return predmeti.remove(predmet);
	}
	
	public String ispisi() {
		return getIme() +" _ "+ getPrezime() + " [ " + getGodRodjenja() + " ] " + " je " + titula+" koji drzi nastavu na : "+predmeti;
	}

	
	
	
	

}
