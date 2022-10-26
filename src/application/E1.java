package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class E1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		
		Rectangle r = new Rectangle(width, height);
		
		double area = r.area();
		double perimeter = r.perimeter();
		double diagonal = r.diagonal();
		
		System.out.printf("AREA = %.2f", area);
		System.out.printf("\nPERIMETER = %.2f", perimeter);
		System.out.printf("\nDIAGONAL = %.2f", diagonal);
		
	
		sc.close();

	}

}
