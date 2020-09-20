package vending.calc;

import java.util.*;
import java.util.Scanner;

import vending.prod.prodCoke;
import vending.prod.prodPepsi;
import vending.prod.prodSoda;

public class amtCal {

	public void calc(int code) {
		Scanner get = new Scanner(System.in);

		System.out.println("Enter the Amount:");
		int amount = get.nextInt();

		// System.out.println("Selected Product is : " +prodCode);
		// System.out.println("Amount : " +amount);
		get.close();

		prodCoke objCoke = new prodCoke();
		prodPepsi objPepsi = new prodPepsi();
		prodSoda objSoda = new prodSoda();

		switch (code) {
		case 1:
			objCoke.calcCoke(amount);
			break;

		case 2:
			objPepsi.calcPepsi(amount);
			break;

		case 3:
			objSoda.calcSoda(amount);

			break;

		}

	}
}