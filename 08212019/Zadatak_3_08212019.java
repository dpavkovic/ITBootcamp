package nizovi;

import java.util.Scanner;

public class Zadatak_3_08212019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		// rastuci.
		// Primer1 niza: 3 54 123 18
		// Ispis: Niz nije rastuci.
		// Primer2 niza: 71 422 1001 5050
		// Ispis: Niz je rastuci.

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza n:");
		int n = sc.nextInt();
		int[] niz = new int[n];

		boolean rastuci = true;

		System.out.println("Ucitaj " + n + " elemenata niza: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();

		}

		for (int i = 0; i < niz.length - 1; i++) {

			if (niz[i] > niz[i + 1]) {

				rastuci = false;
				break;

			}
		}
		if (rastuci == true) {
			System.out.println("Niz je rastuci.");
		} else {
			System.out.println("Niz nije rastuci.");
		}
	}
}
