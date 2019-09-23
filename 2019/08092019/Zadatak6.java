package zd;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ime;
		System.out.println("Unesite nadimak selektora kosarkaske reprezentacije Aleksandra Djordjevica: ");
		ime = sc.next();

		switch (ime) {
		case "Sale":
			System.out.println("Tacan odgovor!");
			break;
		case "SALE":
			System.out.println("Tacan odgovor!");
			break;
		default:
			System.out.println("Pogresno.Ispravan odgovor je Sale!");
			break;
		}

	}

}
