package prinos;

public class Suma extends Parcela {
	private double povrsinaStabala;
	private int peiodSazrevanja;
	private double prinosPoZrelomStablu;
	private double prinosSume;
	
	
	public Suma(double povrsina, double povrsinaStabala, int peiodSazrevanja, double prinosPoZrelomStablu) {
		super(povrsina);
		this.povrsinaStabala = povrsinaStabala;
		this.peiodSazrevanja = peiodSazrevanja;
		this.prinosPoZrelomStablu = prinosPoZrelomStablu;
	}
	
	public double getPovrsinaStabala() {
		return povrsinaStabala;
	}

	public int getPeiodSazrevanja() {
		return peiodSazrevanja;
	}

	public double getPrinosPoZrelomStablu() {
		return prinosPoZrelomStablu;
	}

	public double getPrinosSume() {
		return prinosSume;
	}
	public double prinosSume(double povrsina, double povrsinaStabala,int peiodSazrevanja, double prinosPoZrelomStablu) {

		return prinosSume = povrsina /povrsinaStabala*prinosPoZrelomStablu*getPeiodSazrevanja();

	}

	@Override
	public char getVrsta() {
		
		return 'S';
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
	

}
