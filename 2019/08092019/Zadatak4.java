package zd;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b;
		System.out.println("Unesite realan broj a: ");
		a = sc.nextDouble();
		System.out.println("Unesite realan broj b: ");
		b = sc.nextDouble();
		
		
		char o;
		System.out.println("Izaberite jednu od ponudjenih racunskih operacija u sledecem obliku: + , - , * , / .");
		o = sc.next().charAt(0);

		switch (o) {
		case '+':
			System.out.println("Zbir brojeva a i b je: " + (a + b));
			break;
		case '-':
			System.out.println("Razlika brojeva a i b je: " + (a - b));
			break;
		case '*':
			System.out.println("Proizvod brojeva a i b je: " + (a * b));
			break;
		case '/':
			if(b>0) {
			System.out.println("Kolicnik brojeva a i b je: " + (a / b));
			}else System.out.println("Greska!!!Deljenje sa nulom nije moguce!");
			break;

		default:System.out.println("Uneli ste pogresne podatke.Ponovite unos!");
			break;
		}

	}

}
