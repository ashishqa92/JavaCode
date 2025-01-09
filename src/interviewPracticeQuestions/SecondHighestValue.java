package interviewPracticeQuestions;

import java.util.Arrays;

public class SecondHighestValue {

	public static void main(String[] args) {
		// Write a program to find 2nd highest value from an Array of Integers?
		int[] values = { 10, 5, 8, 20, 15, 19 };

		/*
		 * Arrays.sort(values); int secondHighestValue = values[values.length - 2];
		 * System.out.println("Second highest value: " + secondHighestValue);
		 */

		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int e : values) {
			if (e > highest) {
				secondHighest = highest;
				highest = e;
			} else if (e > secondHighest && e != highest) {
				secondHighest = e;
			}
		}

		System.out.println("The second highest value in the array is: " + secondHighest);

	}

}
