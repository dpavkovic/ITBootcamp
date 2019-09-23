package zd5;

import java.util.Scanner;

public class Zadatak_1_08152019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int izbor;

		do {
			System.out.println("Izaberi geometrijsko telo:");
			System.out.println("1.Kocka");
			System.out.println("2.Kvadar");
			System.out.println("3.Valjak");
			System.out.println("4.Lopta");
			System.out.println("0.Izlaz");
			double a, b, p;
			double ak, bk, c;
			double r;
			double rv, h, pv;
			izbor = sc.nextInt();

			switch (izbor) {
			case 1:
				System.out.println("Unesi stranicu kocke:");
				a = sc.nextDouble();
				p = 6 * a * a;
				System.out.println("Povrsina kocke je:" + p);
				break;
			case 2:
				System.out.println("Unesi stranice kvadra:");
				ak = sc.nextDouble();
				bk = sc.nextDouble();
				c = sc.nextDouble();
				double pk = 2 * ((ak * bk) + (ak * c) + (bk * c));
				System.out.println("Povrsina kvadra je:" + pk);
				break;

			case 3:
				System.out.println("Unesi rv i h za valjak:");
				rv = sc.nextDouble();
				h = sc.nextDouble();

				pv = 2 * rv * 3.14 * (rv + h);
				System.out.println("povrsina valjka je:" + pv);
				break;
			case 4:
				System.out.println("Unesi poluprecnik lopte:");
				r = sc.nextDouble();
				double pl = 4 * r * r * 3.14;
				System.out.println("Povrsina lopte:" + pl);
				break;
			default:
				System.out.println("Los unos!");

				break;
			case 0:
				System.out.println("Kraj");
				break;
			}
		} while (izbor != 0);

	}
}
