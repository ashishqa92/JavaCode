package interviewQuestions;

import java.util.HashMap;

public class CountCharacters {

	public static void main(String[] args) {
		/*
		 * Write a program to count respective charecters in a string? Ex - String word
		 * = "Testing"; Output should be : T=2 , e=1, s=1, i=1, n=1, g=1
		 */

		String word = "testing";
		HashMap<Character, Integer> charCount = new HashMap<>();

		for (char c : word.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}

		charCount.forEach((key, value) -> System.out.println(key + "=" + value));
	}

}
