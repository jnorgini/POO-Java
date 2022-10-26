package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class E4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product pdt = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		pdt.name = sc.nextLine();
		System.out.print("Price: ");
		pdt.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		pdt.quantity = sc.nextInt();
		
		double total = pdt.totalValueInStock();
		
		System.out.printf("\nProdut data: %s, $ %.2f, %d units, Total: $ %.2f%n\n", pdt.name, pdt.price, pdt.quantity, total);
		
		System.out.print("Enter the number of products to be added in stock: ");
		int amount = sc.nextInt();
		
		pdt.addProducts(amount);
		
		System.out.println();
		System.out.println(pdt);
		
		System.out.print("\nEnter the number of products to be removed from stock: ");
		int remove = sc.nextInt();
		
		pdt.removeProducts(remove);
		
		System.out.println();
		System.out.println(pdt);
		
		
		sc.close();

	}
	
}
