package javaopenlab;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		System.out.println("Enter the side of Square : ");
		Scanner scanner=new Scanner(System.in);
		double side = scanner.nextDouble();
		double area = side*side;
		 System.out.println("Area of Square is: "+area); 
	}

}
