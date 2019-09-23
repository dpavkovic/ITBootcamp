package zd4;

import java.util.Scanner;

public class Zadatak_3c_08132019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi k:");
		int k = sc.nextInt();
		System.out.println("Unesi n");
		int n = sc.nextInt();
		int sum = 1;
		while (k < n) {
			sum *= k;
			k++;

		}System.out.println("Proizvod brojeva od k do n je:"+sum);

	}

}
