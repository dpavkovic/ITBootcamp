package kalkulator;

public class GlavniProgram {

	public static void main(String[] args) {

		Kalkulator calc = new Kalkulator();
		double result = calc.add(56).div(3).sub(9).mul(11.5).add(-6).value();
		System.out.println(result);

	}
}
