package interviewQuestions;

import java.util.Arrays;

public class FindMinMaxUsingLambda {

	public static void main(String[] args) {
		// Write a program to find the min and max value from set of numbers/array of
		// numbers using lambda expression?

		int[] numbers = { 5, 3, 8, 2, 10 };

		// Find min and max using lambda expression
		int min = Arrays.stream(numbers).min().orElse(0);
		int max = Arrays.stream(numbers).max().orElse(0);

		// Display min and max
		System.out.println("Min Value: " + min);
		System.out.println("Max Value: " + max);

	}

}
