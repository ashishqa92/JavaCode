package javaInterviewQuestions;

import java.util.LinkedHashSet;

public class RemoveDuplicateNumbersFromArray {

	public static void main(String[] args) {

		int[] numbers = { 6, 9, 2, 1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 9, 10, 10 };

		// LinkedHasSet stores unique elements only, use hashing and maintain the insertion order
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		for (int e : numbers) {
			set.add(e);
		}
		System.out.println("List after removing duplicates: " + set);
	}

}
