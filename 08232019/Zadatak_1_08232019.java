package nizovi;

import java.util.Scanner;

public class Zadatak_1_08232019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava ceo broj n.
		// Taj broj n se prosledjuje metodi koja formira i vraca ceo broj koji
		// predstavlja inverzan broj.
		// Glavni program nakon toga ispisuje taj inverzan broj.
		Scanner sc = new Scanner(System.in);

		System.out.println("Ucitaj ceo broj n: ");
		int n = sc.nextInt();
		int broj = inverzanBroj(n);
		System.out.println(broj);

	}

	public static int inverzanBroj(int x) {
		int invbr = 0;

		while (x != 0) {
			int c = x % 10;
			invbr *= 10;
			invbr+=c;
			x /= 10;

		}
		return invbr;

	}
}
