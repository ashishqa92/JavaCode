package interviewPracticeQuestions;

import java.util.HashSet;

public class DuplicateNumberInArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 9, 10, 10 };

		System.out.println("Using HashSet:");
		findDuplicatesUsingHashSet(numbers);

	}

	private static void findDuplicatesUsingHashSet(int[] array) {

		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> duplicates = new HashSet<Integer>();

		for (int e : array) {
			if (!set.add(e)) {
				duplicates.add(e);
			}
		}
		if (!duplicates.isEmpty()) {
			System.out.println("Duplicates found: " + duplicates);
		} else {
			System.out.println("No duplicates found.");
		}

	}
}
