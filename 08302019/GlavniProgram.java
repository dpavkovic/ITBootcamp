package prinos;

public class GlavniProgram {

	public static void main(String[] args) {

		Parcela p1 = new Suma(564.3, 254.3, 3, 56.4);
		Parcela p2 = new Njiva(156.4, 45.2);
		p1.dodajParcelu(p1);
		p2.dodajParcelu(p2);
		System.out.println(p1);
		System.out.println(p2);
		Suma s3=new Suma(146.8, 45.8, 2, 51.7);
		System.out.println(s3.getId());
	}

}
