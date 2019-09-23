package prinos;

import java.util.ArrayList;
import java.util.List;

import pozoriste.Zaposleni;

public abstract class Parcela {
	private static int CID;
	private int id;
	private double povrsina;
	private List<Parcela>parcele;

	

	public Parcela(double povrsina) {

		this.povrsina = povrsina;
		parcele=new ArrayList<>();
		id = ++CID;
	}
	public void dodajParcelu(Parcela p) {
		parcele.add(p);
	}
	public void removeZaposleni(Parcela p) {
		parcele.remove(p);
	}
	

	public int getId() {
		return id;
	}

	public double getPovrsina() {
		return povrsina;
	}

	
	public abstract char getVrsta();

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
	sb.append(id).append("[").append(povrsina).append("]");
		return sb.toString();
	}
}

