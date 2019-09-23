package zd;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String m;
		System.out.println("Unesite jedan mesec u godini: ");
		m = sc.nextLine();

		switch (m) {

		case "Januar":
		case "Februar":
		case "Mart":
			System.out.println("Mesec pripada godisnjem dobu ZIMA.");
			break;
		case "April":
		case "Maj":
		case "Jun":
			System.out.println("Mesec pripada godisnjem dobu PROLECE.");
			break;
		case "Jul":
		case "Avgust":
		case "Septembar":
			System.out.println("Mesec pripada godisnjem dobu LETO.");
			break;
		case "Oktobar":
		case "Novembar":
		case "Decembar":
			System.out.println("Mesec pripada godisnjem dobu JESEN.");
			break;
		default:
			System.out.println("Uneli ste pogresne podatke.");
			break;
		}
	}
}
