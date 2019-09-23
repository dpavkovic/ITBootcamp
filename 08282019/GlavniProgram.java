package ucionica;

public class GlavniProgram {

	public static void main(String[] args) {

		Polaznik p1 = new Polaznik("Mira Miric");
		Laptop l1 = new Laptop("Dell", p1);

		System.out.println("Polaznik " + p1.getNaziv() + " poseduje trenutno laptop marke " + l1.getMarka());
		l1.setPolaznik(p1);
		System.out.println(p1.ispisi());
		System.out.println(l1.ispisi());
		l1.brisanjePolaznika();
		System.out.println(l1.ispisi());

	}

}
