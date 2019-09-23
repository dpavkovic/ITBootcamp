package nizovi;

import java.util.Scanner;

public class Zadatak_2_08212019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi duzinu niza n: ");
		int n = sc.nextInt();
		int[] niz = new int[n];

		System.out.print("Ucitaj " + n + " elemenata niza: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();

		}
		for (int j = niz.length - 1; j >= 0; j--) {
			System.out.print(niz[j]+" ");

		}
	}
}
