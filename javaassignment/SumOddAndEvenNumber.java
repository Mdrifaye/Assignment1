package javaassignment;

public class SumOddAndEvenNumber {

	public static void main(String[] args) {
		int sumOdd=0;
		int sumEven=0;
		int absdif;
		final int lowerbound=1;
		final int upperbound=100;
		
		for (int number = lowerbound ; number<=upperbound ; number++) {
			if(sumOdd % 2!=0) {
				sumOdd += number;
			}
			else {
				sumEven+=number;
			}
		}
		

	}

}
