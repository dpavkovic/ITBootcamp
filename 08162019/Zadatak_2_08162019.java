package zd5;

import java.util.Scanner;

public class Zadatak_2_08162019 {

	public static void main(String[] args) {
		// Izračunati sumu prirodnih brojeva u intervalu od 1 do n koji su djeljivi sa
		// a.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n:");
		int n = sc.nextInt();
		System.out.println("Unesite a:");
		int a = sc.nextInt();
		int sum = 0;

		for (int i = 1; i < n; i++) {
			
			if (i % a == 0)
				
			sum += i;

		}System.out.println("Suma brojeva brojeva koji su deljivi sa "+a+" je "+sum);
		
	

	}
}
