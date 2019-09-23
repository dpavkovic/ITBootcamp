package zd;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double pk,ks,kN;
		System.out.println("Upisite iznos podignutog kredita: ");
		pk=sc.nextDouble();
		System.out.println("Upisite procenat kamatne stope: ");
		ks=sc.nextDouble();
		
		kN=pk*(1+0.01*ks);
		System.out.println("Kolicina novca koja je potrebna da se vrati banci iznosi: " +kN);


	}

}
