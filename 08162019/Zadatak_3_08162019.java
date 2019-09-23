package zd5;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Zadatak_3_08162019 {

	public static void main(String[] args) {
		// Saberi i pomnoži prirodne brojeve do N koji su djeljivi sa 3.

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n:");
		int n = sc.nextInt();
		int sum = 0;
		int pro=1;

		int i = 1;

		while (i < n) {
			if (i % 3 == 0)
				sum += i;
			pro *= i;
			i++;
			

		}System.out.println("Suma brojeva deljivih sa 3 je:"+sum);
		System.out.println("Proizvod brojeva deljivih sa tri je:"+pro);
		
	}

}
