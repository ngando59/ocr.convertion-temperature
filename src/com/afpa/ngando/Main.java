package com.afpa.ngando;

import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		Converter converter = new Converter();
		sc = new Scanner(System.in);
		
		System.out.println("CONVERTISSEUR °C et °F");
		System.out.println("----------------------");
		
		boolean askAgain = true;
		do {
			converter.displayConverter();
			System.out.println("Souhaitez vous convertir une autre température ? (O/N) ");
			System.out.print("=> ");
			char response = sc.next().charAt(0);
			if(response=='O') {
				askAgain = false;
			} else {
				askAgain = true;
			}
		} while (!askAgain);
		System.out.println("Au revoir !");
	}

}
