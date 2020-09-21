package vending.calc;

import java.io.IOException;
import java.util.*;
import java.util.Scanner;

import vending.prod.prodCoke;
import vending.prod.prodPepsi;
import vending.prod.prodSoda;

public class prodcutCalc {

	public void calc() throws IOException {

		Scanner get = new Scanner(System.in);
		int code;
		int amount;

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
			
			System.out.println("\nPress 999 to CANCEL");

			System.out.println("\nEnter the Product Code : ");
			code = get.nextInt();
		
			switch (code) {
			case 1:
				System.out.println("Enter the coins for Coke :");
				amount = get.nextInt();				
				objCoke.calcCoke(amount);
				break;
			case 2:
				System.out.println("Enter the coins for Pepsi :");
				amount = get.nextInt();
				objPepsi.calcPepsi(amount);
				break;
			case 3:
				System.out.println("Enter the coins for Soda :");
				amount = get.nextInt();
				objSoda.calcSoda(amount);
				break;
			case 999:				
				break;				
			default:
				System.out.println("Invalid Choice");
				break;
			}			
            			
			System.out.println("\nPress any key to continue....");
			int str = System.in.read();			
			
		} while (code != 999);
	}
}