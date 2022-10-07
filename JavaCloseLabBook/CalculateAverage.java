package JavaCloseLabBook;

import java.util.Scanner;

public class CalculateAverage {

	public static void main(String[] args) {
		  int n, count = 1;   
	      float  num, average, sum = 0;   
	      Scanner sc = new Scanner(System.in);     
	      System.out.println("Enter the value of n");  
	      n = sc.nextInt();  
	      while (count <= n)   
	             {   
	                  System.out.println("Enter the "+count+" number?");  
	                  num = sc.nextInt();  
	                  sum += num;   
	                  ++count;   
	             }   
	                  average = sum/n;   
	        System.out.println("The Average is "+average);  

	}

}
