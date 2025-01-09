package interviewPracticeQuestions;

import java.util.Arrays;

public class HighestValue {

	public static void main(String[] args) {
		// Write a program to find 2nd highest value from an Array of Integers?
		int[] values = { 10, 5, 8, 20, 15, 19 };

		/*
		 * Arrays.sort(values); int highestValue = values[values.length - 1];
		 * System.out.println("Second highest value: " + highestValue);
		 */
		
		int highest = Integer.MIN_VALUE;

		for (int e : values) {
			if (e > highest) {
				highest = e;
			}
		}

		System.out.println("The highest value in the array is: " + highest);

	}

}
