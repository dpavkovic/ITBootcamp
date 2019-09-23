package zd5;

import java.util.Scanner;

public class Zadatak_1_08162019 {

	public static void main(String[] args) {
		// Od tri upisana broja (a, b, c) sa tastature naći najmanji.
		Scanner sc = new Scanner(System.in);
		System.out.println("Upisati prvi broj:");
		int a = sc.nextInt();
		System.out.println("Upisati drugi broj:");
		int b = sc.nextInt();
		System.out.println("Upisati treci broj:");
		int c = sc.nextInt();

		int min = a;

		if (b < min)
			min = b;

		if (c < min) {
			min=c;

		}System.out.println("Najmanji broj je:"+min);
		
	}
}
