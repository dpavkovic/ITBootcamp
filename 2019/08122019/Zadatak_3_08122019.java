package zd2;

import java.util.Scanner;

public class Zadatak_3_08122019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
		 * broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako korisnik
		 * unese 1 2 5 3 -1, program treba da ispise 11
		 */
		

		int n = 0;
		int sum = n;
		int br = 0;
		while (n >= 0) {
			System.out.println("Unesi neki broj: ");
			n = sc.nextInt();

			if (n < 0) {

				System.out.println("Uneli ste pogresan broj!");

			} else
				sum += n;

		}
		System.out.println("Zbir brojeva je: " + sum);

	}

}
