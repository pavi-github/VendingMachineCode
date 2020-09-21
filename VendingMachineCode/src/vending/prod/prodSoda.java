package vending.prod;

import java.util.*;

public class prodSoda {
	int Price = 45;
	String Prod1 = "Soda";
	int Code = 3;
	static int stockSoda = 5;
	Scanner get = new Scanner(System.in);

	public void printSoda() {
		System.out.println(Price + "\t" + Prod1 + "\t" + Code);
	}

	public void showSodaStock() {
		System.out.println("Soda\t" + stockSoda);

	}

	public void calcSoda(int amount) {
		int result;
		int collectCoins;
		if (amount > Price) {
			System.out.println("\nYour Product is here : " + Prod1);
			result = amount - Price;
			System.out.println("\nChange is : " + result);
			stockSoda -= 1;
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
			stockSoda -= 1;

		} else {
			System.out.println("\nYour Product is here : " + Prod1);
			stockSoda -= 1;
		}
	}
}
