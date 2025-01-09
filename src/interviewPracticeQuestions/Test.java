package interviewPracticeQuestions;

import java.util.HashMap;

public class Test {

	// String name = "Delhi is the capital of India";

	public static void main(String[] args) {

		String name = "Delhi is the capital of India and is  India city";

		String words[] = name.split("\\s+");

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String e : words) {

			map.put(e, map.getOrDefault(e, 0) + 1);

		}
		map.forEach((k, v) -> System.out.println(k + " = " + v));

	}
}
