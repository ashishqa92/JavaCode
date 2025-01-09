package interviewPracticeQuestions;

import java.util.LinkedHashMap;

public class CountCharactersInString {

	public static void main(String[] args) {
		/*
		 * Write a program to count respective charecters in a string? Ex - String word
		 * = "Testing"; Output should be : T=2 , e=1, s=1, i=1, n=1, g=1
		 */

		String word = "testing";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		char charArray[] = word.toCharArray();

		for (char e : charArray) {
			map.put(e, map.getOrDefault(e, 0) + 1);
		}

		map.forEach((k, v) -> System.out.println(k + "=" + v));
	}

}
