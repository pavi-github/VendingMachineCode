package vending.main;

import java.util.*;
import java.util.Scanner;

import vending.prod.prodCoke;
import vending.prod.prodPepsi;
import vending.prod.prodSoda;

public class vendingMac {
	public static void main(String[] args) {
		int code;
		Scanner get = new Scanner(System.in);

		prodCoke objCoke = new prodCoke();
		prodPepsi objPepsi = new prodPepsi();
		prodSoda objSoda = new prodSoda();

		do {
			
			System.out.println("\n-----------------------------");
			System.out.println("PRICE\tPRODUCT\tPRODUCTCODE");
			System.out.println("-----------------------------");			
			
			objCoke.printCoke();
			objPepsi.printPepsi();
			objSoda.printSoda();
			
			System.out.println("-----------------------------");
			System.out.println("\nPress 0 to EXIT");
			System.out.println("\nEnter the Product Code : ");
			code = get.nextInt();
			
			// amtCal newcal = new amtCal();
			// newcal.calc(code);
			
		} while (code != 0);



		System.out.println("Thanks for using the Vending Machine. See you again!");
	}
}