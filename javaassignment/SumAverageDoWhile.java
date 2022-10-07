package javaassignment;

public class SumAverageDoWhile {

	public static void main(String[] args) {
		int sum = 0;
		double average;
		double lowerbound=1;
		double upperbound=100;
		double number=lowerbound;
		
		do {
			sum+=number;
			++number;
		}
		while(number<=upperbound);
		
		System.out.println("The sum of 1 to 100 is : " + sum);
		average=sum/upperbound;
		System.out.println("The average is : " + average);
			

	}

}
