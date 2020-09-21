package vending.prod;

import java.util.*;

public class prodPepsi {
	int Price = 35;
	String Prod1 = "Pepsi";
	int Code = 2;
	static int stockPepsi = 5;
	Scanner get = new Scanner(System.in);

	public void printPepsi() {
		System.out.println(Price + "\t" + Prod1 + "\t" + Code);
	}

	public void showPepsiStock() {
		System.out.println("Pepsi\t" + stockPepsi);

	}

	public void calcPepsi(int amount) {
		int result;
		int collectCoins;
		if (amount > Price) {
			result = amount - Price;
			System.out.println("\nYour Product is here : " + Prod1);
			System.out.println("\nChange is : " + result);
			stockPepsi = stockPepsi - 1;
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
			stockPepsi -= stockPepsi;		

		} else {
			System.out.println("\nYour Product is here : " + Prod1);
			stockPepsi = stockPepsi - 1;
		}

	}
}
