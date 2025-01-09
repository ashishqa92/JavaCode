package interviewPracticeQuestions;

import java.util.LinkedHashMap;

public class CountCharactersInStringArray {

	public static void main(String[] args) {

		String sentence = "testing is testing and you not worry";
		String[] words = sentence.split("\\s+");
		countChars(words);
	}

	public static void countChars(String[] inputArray) {

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (String word : inputArray) {
			char charArray[] = word.toCharArray();
			for (char e : charArray) {
				map.put(e, map.getOrDefault(e, 0) + 1);
			}
		}
		map.forEach((k, v) -> System.out.println(k + " = " + v));
	}

}
