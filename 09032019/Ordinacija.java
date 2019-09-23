package ordinacijatest;

import java.util.ArrayList;
import java.util.List;

public class Ordinacija {
	// Moze da
	// se naplati
	// usluga pacijentima, ali ukoliko neki pacijent ne poseduje dovoljno novca
	// ispisuje se poruka: “PACIJENT ide u zatvor”. Ordinacija takodje moze da
	// isplati platu doktorima u zadatom iznosu, a povratna vrednost je indikator da
	// li je plata uspesno isplacena. Moze da se sastavi tekstualni opis: NAZIV:CENA
	// DOKTORI Doktor 0 Doktor 1 . . PACIJENTI Pacijent 0 Pacijent 1 Pacijent 2
	private String naziv;
	private List<Stomatolog> stomatolozi;
	private List<Pacijent> pacijenti;
	private static final double CENA=150;
	private double stanjeRacuna;

	public Ordinacija(String naziv, double CENA, double stanjeRacuna) {

		this.naziv = naziv;
		stomatolozi = new ArrayList<Stomatolog>();
		pacijenti = new ArrayList<Pacijent>();
		CENA=150;

		stanjeRacuna = 0;
	}

	public void naplatiUslugu(double pare) {
		if (pare > 0 && pare >= CENA) {
			stanjeRacuna = pare - CENA;
		}
	}

	public String getNaziv() {
		return naziv;
	}

	public double getCena() {
		return CENA;
	}

	public void dohvatiStomatolog(Stomatolog s) {
		stomatolozi.add(s);
	}

	public boolean izbaciStomatologa(Stomatolog s) {
		return stomatolozi.remove(s);
	}

	public void dohvatiPacijent(Pacijent p) {
		pacijenti.add(p);
	}

	public boolean izbaciPacijenta(Pacijent p) {
		return pacijenti.remove(p);
	}

	public int dohvatiBrPacijenata(Pacijent p) {

		return pacijenti.size();
	}

	public int dohvatiBrStomatologa(Stomatolog stomatolog) {

		return stomatolozi.size();
	}

	public void naplatiUslugeOrdinacije(double novac) {

		if (novac < CENA) {
			System.out.println("Pacijent ide u zatvor!");
		}

	}

	public void isplatiPlatu(double stanjaRacuna) {
		double plata = stanjeRacuna / 2;
		if (plata < 0 && plata > stanjaRacuna / 2) {
			System.out.println("Nemoguce je isplatiti platu.");
		}

		stanjeRacuna -= plata;

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv).append(":").append(CENA).append("/n").append("DOKTORI").append("/n");
		for (Stomatolog stomatolog : stomatolozi) {
			sb.append(stomatolog).append("/n");}

		sb.append("PACIJENTI").append("/n");
		for (Pacijent pacijent : pacijenti) {
			sb.append(pacijent);}

		return toString();
	}
	
}
