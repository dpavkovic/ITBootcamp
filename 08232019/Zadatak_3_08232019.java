package nizovi;

import java.util.Scanner;

public class Zadatak_3_08232019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava niz od n celih brojeva i dve metode.
		// Prva metoda vraca proizvod elemenata na neparnim pozicijama, a druga vraca
		// zbir parnih elemenata niza.

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza n:");
		int n = sc.nextInt();
		int[] niz = new int[n];
		ucitajNiz(niz);

		int proizvod = proizvodElemenataNaNeparnimPozicijama(niz);
		System.out.println(proizvod);
		int suma=zbirParnihElemenataNiza(niz);
		System.out.println(suma);

	}

	public static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite " + niz.length + " elemenata: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
	}

	public static int proizvodElemenataNaNeparnimPozicijama(int[] niz) {
		int pro = 1;

		for (int i = 0; i < niz.length; i++) {
			if (i % 2 != 0) {
				pro = pro * niz[i];

			}

		}
		return pro;

	}

	public static int zbirParnihElemenataNiza(int[] niz) {
		int sum = 0;

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 2 == 0) {
				sum = sum + niz[i];

			}

		}
		return sum;

	}

}
