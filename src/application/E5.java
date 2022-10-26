package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class E5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		
		CurrencyConverter cC = new CurrencyConverter(dollar, amount);
		
		System.out.println(cC);

		sc.close();

	}

}
