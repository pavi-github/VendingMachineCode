package vending.main;

import java.util.*;
import java.util.Scanner;

import vending.calc.prodcutCalc;
import vending.prod.prodCoke;
import vending.prod.prodPepsi;
import vending.prod.prodSoda;

public class vendingMac {
	public static void main(String[] args) {
		
		Scanner get = new Scanner(System.in);
		int menucode;
		
		prodCoke objCoke = new prodCoke();
		prodPepsi objPepsi = new prodPepsi();
		prodSoda objSoda = new prodSoda();
		
		do {
			
			System.out.println("\n-------------------------------------");
			System.out.println("WELCOME TO VENDING MACHINE MAIN MENU");
			System.out.println("---------------------------------------");			
			
			System.out.println("1. Start Vending Machine");
			System.out.println("2. Supplier View");
			System.out.println("3. EXIT");
			
			System.out.println("-----------------------------");
			
			System.out.println("\nEnter Your Choice : ");
			menucode = get.nextInt();
		
			switch (menucode) {
			case 1:
				 prodcutCalc newcal = new prodcutCalc();
				 newcal.calc();
				break;
			case 2:
				System.out.println("\n--------------------------------");
				System.out.println("CURRENT STOCK IN VENDING MACHINE");
				System.out.println("--------------------------------");						
				objCoke.showCokeStock();				
				objPepsi.showPepsiStock();
				objSoda.showSodaStock();
				break;
			case 3:
				System.out.println("Thanks for using the Vending Machine. See you again!");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			
		} while (menucode != 3);
		get.close();		
	}
}