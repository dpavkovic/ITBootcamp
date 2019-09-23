package dp;

import java.util.Scanner;

public class Zadatak_2_09082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		Double a, b, p, r;
		System.out.println("Izaberite jednu od ponudjenih geometrijskih slika:Pravougaonik,Kvadrat ili Krug:");
		s = sc.nextLine();

		switch (s) {
		case "Pravougaonik":
			System.out.println("Unesite stranicu a pravougaonika: ");
			a = sc.nextDouble();
			System.out.println("Unesite stranicu b pravougaonika: ");
			b = sc.nextDouble();
			p = a * b;
			System.out.println("Povrsina pravougaonika je p=: " + p);
			break;
		case "Kvadrat":
			System.out.println("Unesite stranicu a kvadrata: ");
			a = sc.nextDouble();

			p = a * a;
			System.out.println("Povrsina kvadrata je p=: " + p);
			break;
		case "Krug":
			System.out.println("Unesite poluprecnik kruga: ");
			r = sc.nextDouble();

			p = r * r * 3.14;
			System.out.println("Povrsina kruga je p=: " + p);
			break;
		default:
			System.out.println("Uneli ste geometrijsku sliku koja ne postoji u izboru!");

		}
	}
}
