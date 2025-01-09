package interviewPracticeQuestions;

import java.util.HashSet;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 3, 7, 8, 10 };
		int n = 10; // Total numbers including the missing ones (1 to n)

		// Create a HashSet containing all numbers from 1 to n
		HashSet<Integer> set = new HashSet<>();
		for (int i = 1; i <= n; i++) {
			set.add(i);
		}

		// Remove numbers present in the array from the HashSet
		for (int e : arr) {
			set.remove(e);
		}

		// The remaining numbers in the HashSet are the missing numbers
		System.out.println("The missing numbers are: " + set);
		/*
		 * for (int e : set) { System.out.println("The missing numbers are: " + e); }
		 */

	}
}
