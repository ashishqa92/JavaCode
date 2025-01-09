package interviewPracticeQuestions;

import java.util.HashSet;

public class DuplicateStringInSentence {

	public static void main(String[] args) {

		String sentence = "Java programming hello world is known as is world Java";
		String[] words = sentence.split("\\s+");

		System.out.println("Using HashSet:");
		findDuplicateStrings(words);

	}

	private static void findDuplicateStrings(String[] array) {

		HashSet<String> set = new HashSet<String>();
		HashSet<String> duplicates = new HashSet<String>();

		for (String e : array) {
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
