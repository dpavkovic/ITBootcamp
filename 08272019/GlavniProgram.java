package domaci;

public class GlavniProgram {

	public static void main(String[] args) {
		Knjige k=new Knjige("Tvrdjava", "Mesa Selimovic", 203);
		Knjige k1=new Knjige("Prohujalo sa vihorom", "Margaret Micel", 457);
		Knjige k2=new Knjige("Znakovi pored puta", "Ivo Andric", 321);
		k.setGodIzdanja(1970);
		k1.setGodIzdanja(1936);
		k2.setGodIzdanja(1976);
		
		System.out.println(k.getNazivKnjige()+" , "+k.getAutor()+" , "+k.getBrStrana()+" , "+k.getGodIzdanja());
		System.out.println(k1.getNazivKnjige()+" , "+k1.getAutor()+" , "+k1.getBrStrana()+" , "+k1.getGodIzdanja());
		System.out.println(k2.getNazivKnjige()+" , "+k2.getAutor()+" , "+k2.getBrStrana()+" , "+k2.getGodIzdanja());
		
		

	}

}
