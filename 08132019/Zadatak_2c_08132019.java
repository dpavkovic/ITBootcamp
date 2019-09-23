package zd4;

import java.util.Scanner;

public class Zadatak_2c_08132019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi k: ");
		int k = sc.nextInt();
		System.out.println("Unesi n: ");
		int n = sc.nextInt();
		int sum = 0;
		int br = 0;
		while (k < n) {
			
			sum += k;
			k++;
			
		}System.out.println("Zbir brojeva je : " + sum);
		


	}

}
