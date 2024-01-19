package interviewQuestions;

import java.util.Arrays;

public class SecondHighestValue {

	public static void main(String[] args) {
		// Write a program to find 2nd highest value from an Array of Integers?
		int[] values = { 10, 5, 8, 20, 15, 19 };
		Arrays.sort(values);
		System.out.println("Second highest value: " + values[values.length - 2]);

	}

}
