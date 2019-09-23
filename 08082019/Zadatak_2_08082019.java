package pp;

import java.util.Scanner;

public class Zadatak_1_08082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, p, o;
		System.out.print("Unesi stranicu a pravougaonika: ");
		a = sc.nextDouble();
		System.out.print("Unesi stranicu b pravougaonika: ");
		b = sc.nextDouble();
		o = 2 * a + 2 * b;
		System.out.println("Obim pravougaonika iznosi: " + o);
		p = a * b;
		System.out.print("Povrsina pravougaonika: " + p);

	}

}
