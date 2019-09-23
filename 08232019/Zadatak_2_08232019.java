package nizovi;

import java.util.Scanner;

public class Zadatak_2_08232019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava tri cela broja i metodu koja ispisuje brojeve
		// od prvog do drugog (ukljucujuci i njih) koji su deljivi trecim.
		Scanner sc = new Scanner(System.in);

		int[] niz = new int[3];
		ucitajNiz(niz);
		ispisBroja(niz);

	}

	public static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite " + niz.length + " cela broja: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
	}

	public static void ispisBroja(int[] niz) {

		if (niz[0] % niz[2] == 0) {
			System.out.print(niz[0]);
		}
		System.out.println(" ");
		if (niz[1] % niz[2] == 0) {
			System.out.print(niz[1]);
		}

	}
}
