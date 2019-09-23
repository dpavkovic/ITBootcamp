package ordinacijatest;

public class GlavniProgram {

	public static void main(String[] args) {

		// Covek poseduje naziv, jedinstveni automatski identifikator, JMBG i novac.
		// Naziv i JMBG se zadaju prilikom kreiranja. Svi sadrzani podaci mogu samo da
		// se dohvate. Novac moze da se doda i da se oduzme, gde je povratna vrednost
		// indikator uspesnosti oduzimanja/dodavanja novca. Moze da se sastavi
		// tekstualni zapis u obliku: NAZIV[ID:JMBG:NOVAC]

		// Pacijent je covek kojeg je moguce ispisati u formatu: P_COVEK

		// Stomatolog je covek kojeg je moguce ispisati u formatu: S_COVEK

		// Ordinacija poseduje naziv, listu stomatologa, listu pacijenata, cenu usluge
		// kao i stanje racuna. Naziv i cena se zadaju prilikom kreiranja i mogu samo da
		// se dohvate. Moze da se dodati/ukloni doktor. Moze da se doda/ukloni pacijent.
		// Moze da se dohvati broj pacijenata/doktora. Moze da se naplati usluga
		// pacijentima, ali ukoliko neki pacijent ne poseduje dovoljno novca ispisuje se
		// poruka: “PACIJENT ide u zatvor”. Ordinacija takodje moze da isplati platu
		// stomatolozima u zadatom iznosu, a povratna vrednost je indikator da li je
		// plata uspesno isplacena. Moze da se sastavi tekstualni opis:
		// NAZIV:CENA
		// DOKTORI
		// Doktor 0
		// Doktor 1
		// .
		// .
		// PACIJENTI
		// Pacijent 0
		// Pacijent 1
		// Pacijent 2

		// ..

		// Napisati i glavni program koji prikazuje sve funkcionalnosti klasa.

		Covek p1 = new Pacijent("Blb", "021558", 52.2);
		Pacijent d1 = new Pacijent("Coka", "54698", 48.3);
		Pacijent p2 = new Pacijent("Bora", "Boric", 45.6);
		Covek c3 = new Stomatolog("Drago", "542135", 586.2);
		Stomatolog s3 = new Stomatolog("BIBIKA", "65832", 5498);
		Ordinacija d11 = new Ordinacija("BIBIB", 23, 456.3);
		p2.dodajNovac(23.6);
		s3.dodajNovac(489.12);
		System.out.println(s3.getNovac());
		s3.oduzmiNovac(156.2);
		System.out.println(s3.getNovac());

		System.out.println(p2.getNovac());

		p2.oduzmiNovac(13.6);
		System.out.println(p2.oduzmiNovac(15));
		
		

	}

}
