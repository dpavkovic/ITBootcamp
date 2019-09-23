package zd;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int br;
		System.out.println("Unesi neki broj: ");
		br=sc.nextInt();
		
		if(br>0) {
			System.out.println("Broj koji ste uneli je pozitivan.");
		}if(br<0) {
			System.out.println("Broj koji ste uneli je negativan.");
		}else 
			System.out.println("Broj koji ste uneli je nula.");

	}

}
