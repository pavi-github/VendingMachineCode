package vending.prod;

import java.util.*;

public class prodCoke {
	int Price = 25;
	String Prod1 = "Coke";
	int Code = 1;

	// public void prodCoke () {
	public void printCoke() {
		System.out.println(Price + "\t" + Prod1 + "\t" + Code);

	}

	public void calcCoke(int amount) {
		int result;
		if (amount > 25) {
			result = amount - 25;
			System.out.println("Your Product is here : " + Prod1);
			System.out.println("Change is : " + result);
		} else if (amount < 25) {
			System.out.println("Your Product is here : " + Prod1);
			System.out.println("Insufficient Amount. Please put correct Amount to get Product Coke ");
		} else {
			System.out.println("Your Product is here : " + Prod1);
			System.out.println("Given Amount is Correct. No change required ");
		}

	}
}
