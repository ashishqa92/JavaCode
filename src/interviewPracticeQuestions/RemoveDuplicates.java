package interviewPracticeQuestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// Write program to remove duplicate element from Array?

		int[] array = { 1, 2, 3, 2, 4, 5, 1, 6, 7, 8, 9, 5 };

		Set<Integer> set = new LinkedHashSet<Integer>();

		for (int e : array) {
			set.add(e);
		}

		System.out.println("List after removing duplicates: " + set);

	}

}
