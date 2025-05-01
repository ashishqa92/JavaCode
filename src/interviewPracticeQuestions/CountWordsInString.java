package interviewPracticeQuestions;

import java.util.LinkedHashMap;

public class CountWordsInString {

	public static void main(String[] args) {

		// Write a program to count respective word count in a string. e.g. I=2, am=2, my=1 etc.
		String sentence = "I am software tester and software testing is my passion and I am happy";
		String[] words = sentence.split("\\s+");
		countChars(words);
	}

	public static void countChars(String[] inputArray) {

		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (String e : inputArray) {
				map.put(e, map.getOrDefault(e, 0) + 1);
		}
		map.forEach((k, v) -> System.out.println(k + " = " + v));
	}

}
