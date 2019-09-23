package nizovi;

import java.util.Scanner;

public class Zadatak_1_08222019 {

	public static void main(String[] args) {
		// Napisati program u kom se unose 3 realna broja i poziva i ispisuje dve
		// metode(u mainu).
		// Prva metoda vraca proizvod unetih brojeva. Druga metoda ispisuje najmanji od
		// unesenih brojeva.
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti prvi realan broj a: ");
		double a = sc.nextDouble();
		System.out.println("Uneti drugi realan broj b: ");
		double b = sc.nextDouble();
		System.out.println("uneti treci realan broj c: ");
		double c = sc.nextDouble();
		double rezultat = proizvodBrojeva(a, b, c);
		System.out.println("Proizvod unetih brojeva je: " + rezultat);
		double najmanji = najmanjiBroj(a, b, c);
		System.out.println("Najmanji broje je: " + najmanji);

	}

	public static double proizvodBrojeva(double x, double y, double z) {
		double pro = x * y * z;
		return pro;
	}

	public static double najmanjiBroj(double x, double y, double z) {
		double min;
		min = x;
		if (x > y)
			y = min;
		if (y > z)
			z = min;

		return min;

	}

}
