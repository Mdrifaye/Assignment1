package javaassignment;

public class SumAverageRuntimeInt {

	public static void main(String[] args) {
		int sum=0;
		double average;
		final float lowerbound=1;
		final float upperbound=100;
		
		for (float number =lowerbound; number<=upperbound;++number) {
			sum+=number;
		}
		System.out.println("The sum of 1 to 100 is : " + sum);
		average = (sum/upperbound);
		System.out.println("The average is : " + average);

	}

}
