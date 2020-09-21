package vending.prod;

import java.util.*;

public class prodSoda {
	int Price = 45;
	String Prod1 = "Soda";
	int Code = 3;
	static int stockSoda = 5;

	public void printSoda() {
		System.out.println(Price + "\t" + Prod1 + "\t" + Code);
	}

	public void showSodaStock() {
		System.out.println("Soda\t" + stockSoda);

	}

	public void calcSoda(int amount) {
		int result;		
		if (amount > 45) {
			System.out.println("\nYour Product is here : " + Prod1);
			result = amount - 45;
			System.out.println("\nChange is : " + result);
			stockSoda -= 1;
		} else if (amount < 35) {
			System.out.println("\nYour Product is here : " + Prod1);
			System.out.println("\nInsufficient Amount. Please put correct Amount to get Product Soda ");
			//stockSoda -= 1;
		} else {
			System.out.println("\nYour Product is here : " + Prod1);
			System.out.println("\nGiven Amount is Correct. No change required ");
			stockSoda -= 1;
		}
	}
}
