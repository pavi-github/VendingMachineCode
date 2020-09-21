package vending.prod;

import java.util.*;

public class prodPepsi {
	int Price = 35;
	String Prod1 = "Pepsi";
	int Code = 2;
	static int stockPepsi = 5;

	public void printPepsi() {
		System.out.println(Price + "\t" + Prod1 + "\t" + Code);
	}
	
	public void showPepsiStock() {
		System.out.println("Pepsi\t"+ stockPepsi);

	}

	public void calcPepsi(int amount) {
		int result;
		if (amount > 35) {
			result = amount - 35;
			System.out.println("Your Product is here : " + Prod1);
			System.out.println("Change is : " + result);
			stockPepsi = stockPepsi - 1;
		} else if (amount < 35) {
			System.out.println("Your Product is here : " + Prod1);
			System.out.println("Insufficient Amount. Please put correct Amount to get Product Pepsi ");
			stockPepsi = stockPepsi - 1;
		} else {
			System.out.println("Your Product is here : " + Prod1);
			System.out.println("Given Amount is Correct. No change required ");
			stockPepsi = stockPepsi - 1;
		}

	}
}
