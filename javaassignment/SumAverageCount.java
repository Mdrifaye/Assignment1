package javaassignment;

public class SumAverageCount {

	public static void main(String[] args) {
		int count=0;
		double lowerbound=111;
		double upperbound=8899;
		double average;
		
		for (double number=lowerbound ; number<=upperbound ; ++number) {
			//count+=number;
			count += number;
			++count;
		}
		
		System.out.println("The count of 111 to 8899 : " + count);
		average=count/upperbound;
		System.out.println("The average is : " + average );

	}

}
