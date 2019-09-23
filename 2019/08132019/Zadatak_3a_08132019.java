package zd4;

import java.util.Scanner;

public class Zadatak_3a_08132019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int sum = 1;
		int br = 1;
		while (br < n) {
			sum *= br;
			br++;

		}
		System.out.println("Proizvod brojeva od 1 do 5 je:" + sum);
	}

}
