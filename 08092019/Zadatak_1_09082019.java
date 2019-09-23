package dp;

import java.util.Scanner;

public class Zadatak_1_09082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Unesi ceo broj:");
		a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("Broj koji ste uneli je paran.");
		} else {
			System.out.println("Broj koji ste uneli je neparan.");

		}

	}

}
