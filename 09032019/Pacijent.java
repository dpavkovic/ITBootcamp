package ordinacijatest;

public class Pacijent extends Covek{
	
	//Pacijent je covek kojeg je moguce ispisati u formatu: P_COVEK

	public Pacijent(String naziv, String jmbg, double novac) {
		super(naziv, jmbg, novac);
		
	}
	@Override
	public String toString() {
		
		return "P_"+super.toString();
	}
	

}
