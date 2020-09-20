package vending.prod;

import java.util.*;

public class prodSoda {
	int Price = 45;
	String Prod1 = "Soda";
	int Code = 3;

	public void printSoda() {
		System.out.println(Price + "\t" + Prod1 + "\t" + Code);
	}

	public void calcSoda(int amount) {
		int result;
		System.out.println("Your Product is here : " + Prod1);
		if (amount > 45) {
			result = amount - 45;
			System.out.println("Change is : " + result);
		} else if (amount < 35) {
			System.out.println("Insufficient Amount. Please put correct Amount to get Product Soda ");
		} else {

			System.out.println("Given Amount is Correct. No change required ");
		}
	}
}
