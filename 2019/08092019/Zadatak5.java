package zd;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ceoBroj;
		System.out.println("Unesite jedan ceo broj:");
		ceoBroj=sc.nextInt();
		 
		if (ceoBroj%3==0) {
			System.out.println("Broj " + ceoBroj + " je deljiv brojem tri!");
			
		} else {
			System.out.println("Broj " + ceoBroj + " nije deljiv brojem tri!");

		}

	}

}
