package zd2;

import java.util.Scanner;

public class Zadatak_2_08122019 {

	public static void main(String[] args) {
		// Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva
		// od 0 do n. Koristiti jednu petlju.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n:");
		int n = sc.nextInt();
		int br = 1;
		int sum = 0;
		int pro = 1;

		while (br < n) {

			if (br % 2 == 0) {

				sum += br;

			} else
				pro *= br;
			br += 1;

		}
		System.out.println("Suma parnih brojeva je: " + sum);
		System.out.println("Proizvod neparnih brojeva je: " + pro);

	}
}
