package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class E6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char yN = sc.next().charAt(0);
		
		double deposit;
		
		if(yN == 'y') {
			System.out.print("Enter initial deposit value: ");
			deposit = sc.nextDouble();
		}
		else {
			deposit = 0.0;
		}
		
		Bank acc = new Bank(account, name, deposit);
		
		System.out.println("\nAccount data:\n" + acc);
		
		System.out.print("\nEnter a deposit value: ");
		double up = sc.nextDouble();
		acc.depositValue(up);
		
		System.out.println("\nUpdated account data:\n" + acc);
		
		System.out.print("\nEnter a withdraw value: ");
		double down = sc.nextDouble();
		acc.withdrawValue(down);
		
		System.out.println("\nUpdated account data:\n" + acc);
		
		
		sc.close();

	}

}
