package vending.prod;

import java.util.*;

public class prodCoke {
	
	String Prod1 = "Coke";
	int Price = 25;	
	int Code = 1;
	static int stockCoke = 5;

	public void printCoke() {
		System.out.println(Price + "\t" + Prod1 + "\t" + Code);

	}
	
	public void showCokeStock() {
		System.out.println("Coke\t"+ stockCoke);

	}

	public void calcCoke(int amount) {
		int result;
		if (amount > 25) {
			result = amount - 25;
			System.out.println("\nYour Product is here : " + Prod1);
			System.out.println("\nChange is : " + result);
			stockCoke = stockCoke - 1 ;
		} else if (amount < 25) {
			System.out.println("\nYour Product is here : " + Prod1);
			System.out.println("\nInsufficient Amount. Please put correct Amount to get Product Coke ");
			//stockCoke = stockCoke - 1 ;			
		} else {
			System.out.println("\nYour Product is here : " + Prod1);
			System.out.println("\nGiven Amount is Correct. No change required ");
			stockCoke = stockCoke - 1 ;
		}

	}
}
