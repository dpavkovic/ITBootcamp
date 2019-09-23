package zd4;

public class Zadatak_1_08132019 {

	public static void main(String[] args) {
		int i = 5;
		int j = 7;
		int k = 9;

		i = ++j;// (Pre Inkrement) Prvo povecavamo vrednost promenljive j za 1,a onda tu novu
				// vrednost j smestamo u promenljivu i.
		k = ++j + ++i;/*
						 * (Pre Inkrement) Prvo povecavamo vrednost j za 1,a onda tu novu vrednost j
						 * cuvamo i saberemo sa nastavkom ++i. ++i znaci da prvo dodamo vrednost 1
						 * promenljivoj i,a onda vrednost i smestamo u promenljivu.Rezultat je 8+8=18.
						 */
		System.out.println("Vrednost k je : " + k);

		k = i++;/*
				 * (Post Inkrement) Prvo vrednost promenljive i smestamo u promenljivu k,a onda
				 * povecavamo vrednost promenljive i za 1.
				 */
		j = i++ - k++;// (Post Inkrement)
		System.out.println("Vrednost j je : " + j);

		j = --k;// (Pre Dekrement) Prvo smanjimo vrednost promenljive k za 1,pa tu novu vrednost
				// k smestamo u promenljivu j.
		i = --k + --j;/*
						 * (Pre Dekrement) Prvo smanjujemo vrednost k za 1,a onda tu vrednost koju smo
						 * dobili sabiramo sa --j. --j znaci da prvo smanjimo vrednost j za 1.Pa onda tu
						 * novu vrednost j uymemo i saberemo sa prvim delom i dobijemo rezultat.
						 */
		System.out.println("Vrednost i je : " + i);

		i = j--;// (Post Dekrement) Prvo vrednost promenljive j smestamo u i,a onda j povecavamo
				// za 1.
		k = i-- + j--;// (Pre Dekrement)
		System.out.println("Vrednost k je : " + k);
		// Kombinacija
		k = ++j + --i;/*
						 * Prvo (++j) povecavamo vrednost j za 1,a onda uzimamo tu vrednost koja je sada
						 * 8 i nju cemo sabrati sa (--i).--i je predekrement,sto znaci da prvo
						 * smanjujemo vrednost i za 1,pa tu vrednost smestamo i ona iznosi 4). Rezultat
						 * 8+4 i dobicemo vrednost k=12.
						 */
		System.out.println("Vrednost k je : " + k);

	}

}
