package prinos;

public class Njiva extends Parcela {
	private double prinosNjiveKvM;
	private double prinosNjive;

	public Njiva(double povrsina, double prinosNjiveKvM) {
		super(povrsina);
		this.prinosNjiveKvM = prinosNjiveKvM;
	}

	public double getPrinosNjiveKvM() {
		return prinosNjiveKvM;
	}

	public double getPrinosNjive() {
		return prinosNjive;
	}

	public double prinosNjive(double povrsina, double prinosNjiveKvM) {

		return prinosNjive = povrsina * prinosNjiveKvM;

	}

	@Override
	public char getVrsta() {

		return 'N';
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
