package nizovi;

import java.util.Scanner;

public class Zadatak_1_08212019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite duzinu niza n: ");
		int n = sc.nextInt();
		System.out.print("Unesite neki broj: ");
		int br = sc.nextInt();
		int[] niz = new int[n];

		System.out.print("Unesi " + n + " elemenata niza: ");

		for (int i = 0; i < niz.length; i++) {

			niz[i] = sc.nextInt();

			if (niz[i] % br == 0) {

				System.out.println(niz[i] + " ");

			}

		}

	}
}
