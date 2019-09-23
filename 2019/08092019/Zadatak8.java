package zd;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
	System.out.println("Unesite jedan od ponudjenih pojmova:jabuka,kruska,lubenica,banana,luk,paradajz,cvekla ili grasak.Dobicete informaciju da li pripada povrcu ili vocu.");
		s = sc.nextLine();

		switch (s) {
		case ("jabuka"):
			System.out.println("Jabuka pripda vocu.");
			break;

		case ("kruska"):
			System.out.println("Kruska pripda vocu.");
			break;

		case ("lubenica"):
			System.out.println("Lubenica pripda vocu.");
			break;

		case ("banana"):
			System.out.println("Banana pripda vocu.");
			break;

		case ("luk"):
			System.out.println("Luk pripda povrcu.");
			break;
		case ("paradajz"):
			System.out.println("Luk pripda povrcu.");
			break;
		case ("cvekla"):
			System.out.println("Luk pripda povrcu.");
			break;
		case ("grasak"):
			System.out.println("Luk pripda povrcu.");
			break;
		default:
			System.out.println("Uneti pojam ne postoji.");
			break;
		}
	}
}
