package zd4;

import java.util.Scanner;

public class Zadatak_3b_08132019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n:");
		int n = sc.nextInt();

		int sum = 1;
		int br = 1;

		while (br < n) {
			sum *= br;
			br++;

		}
		System.out.println("Proizvod brojeva od 1 do n je:" + sum);

	}

}
