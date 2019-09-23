package zd5;

import java.util.Scanner;

public class Zadatak_3_08152019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Upisite broj redova n:");
		int n=sc.nextInt();
		System.out.println("Upisite broj zvezdica z:");
		int z=sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < z; j++) {
				System.out.print("  *  ");
				
			}System.out.println();
			
		}

	}

}
