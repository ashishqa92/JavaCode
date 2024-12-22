package interviewQuestions;

import java.util.HashSet;

public class DuplicateNumberInArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 9, 10, 10 };

		HashSet<Integer> set = new HashSet<Integer>();

		for (int e : numbers) {
			if (!set.add(e)) {
				System.out.println(e);
			}
		}

	}

}
