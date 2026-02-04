package interviewPracticeQuestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateNumberInArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 6, 7, 7, 8, 9, 9, 10, 10 };

		System.out.println("Using HashSet:");
		findDuplicatesUsingHashSet(numbers);

	}

	private static void findDuplicatesUsingHashSet(int[] array) {

		Set<Integer> set = new LinkedHashSet<Integer>();
		Set<Integer> duplicates = new LinkedHashSet<Integer>();

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
