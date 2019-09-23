package kalkulator;

public class Kalkulator {

	private static double total = 0;

	public Kalkulator add(double x) {
		total += x;
		return this;
	}

	public Kalkulator sub(double x) {
		total -= x;
		return this;
	}

	public Kalkulator mul(double x) {
		total *= x;
		return this;
	}

	public Kalkulator div(double x) {
		total /= x;
		return this;
	}

	public double value() {
		return total;
	}

}
