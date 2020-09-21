package vending.prod;

import java.util.*;

public class prodCoke {

	String Prod1 = "Coke";
	int Price = 25;
	int Code = 1;
	static int stockCoke = 5;
	Scanner get = new Scanner(System.in);

	public void printCoke() {
		System.out.println(Price + "\t" + Prod1 + "\t" + Code);

	}

	public void showCokeStock() {
		System.out.println("Coke\t" + stockCoke);

	}

	public void calcCoke(int amount) {
		int result;
		int collectCoins;
		if (amount > Price) {
			result = amount - Price;
			System.out.println("\nYour Product is here : " + Prod1);
			System.out.println("\nChange is : " + result);
			stockCoke = stockCoke - 1;
		} else if (amount < Price) {
			collectCoins = amount;
			do {
				System.out.println("Enter pending coins:");
				collectCoins = get.nextInt();
				amount = amount + collectCoins;			
			} while (amount < Price);

			System.out.println("\nYour Product is here : " + Prod1);

			if (amount > Price) {
				result = amount - Price;
				System.out.println("\nChange is : " + result);
			}
			stockCoke -= stockCoke;
		} else {
			System.out.println("\nYour Product is here : " + Prod1);
			stockCoke = stockCoke - 1;
		}

	}
}
