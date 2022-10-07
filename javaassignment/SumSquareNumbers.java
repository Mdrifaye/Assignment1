package javaassignment;

public class SumSquareNumbers {

	public static void main(String[] args) {
		
		long count = 0l;
		double average;
		//long sum = 0l;
		final int lowerbound=1;
		final double upperbound=100;
		
		for(int number = lowerbound ; number <= upperbound; number++) {
			count += number * number ;
			System.out.println(number * number);
			count ++;
			
		}
		System.out.println("The square sum of number " + lowerbound + " To " + upperbound + " is : " + count);
		average = count/upperbound;
		System.out.println("The average is : " + average);

	}

}
