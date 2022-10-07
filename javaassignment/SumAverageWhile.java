package javaassignment;

public class SumAverageWhile {

	public static void main(String[] args) {
		int sum=0;
		double average;
		double lowerbound=1;
		double upperbound=100;
		double number = lowerbound;
		
		while (number<=upperbound) {
			sum+=number;
			++number;
		}
		System.out.println("The sum of 1 to 100 is : " + sum);
		average=sum/upperbound;
		System.out.println("The average is " + average);

	}

}
