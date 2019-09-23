package skola;

public class GlavniProgram {

	public static void main(String[] args) {
		Student s1=new Student("Mika", "Mikic", 1998);
		Student s2=new Student("Jovana", "Jovanic", 2003);
		Student s3=new Student("Nina", "Ninic", 2001);
		
		s1.trenutniProsek(9.21);
		s1.trenutnaGodStudija(4);
		
		Profesor p1=new Profesor("Miro", "Miric", 1946, "GlProfa");
		p1.addPredmet("matematika");
		p1.addPredmet("fizika");
		
				
	
		Profesor p2=new Profesor("Mira", "Miric", 1965, "Asistent");
		p2.addPredmet("engleski");
		p2.addPredmet("francuski");
		
	
		System.out.println(s1.ispisi());
		System.out.println(p2.ispisi());
	}

}
