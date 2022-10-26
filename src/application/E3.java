package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class E3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.println("Grade:");
		double grade1 = sc.nextDouble();
		double grade2 = sc.nextDouble();
		double grade3 = sc.nextDouble();
		
		Student std = new Student(name, grade1, grade2, grade3);
		
		System.out.println(std);
		
	
		sc.close();

	}

}
