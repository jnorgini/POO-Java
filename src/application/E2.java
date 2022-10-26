package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class E2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Gross Salary: ");
		double grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		
		Employee emp = new Employee(name, grossSalary, tax);
		
		System.out.println(emp);
		
		System.out.println("Which percentage to increase salary?");
		double amount = sc.nextDouble();
		
		emp.increaseSalary(amount);
		
		System.out.println(emp);
		
		
		
		sc.close();

	}
	
}
