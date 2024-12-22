package interviewQuestions;

import java.util.LinkedHashSet;

public class MyTest {

	public static void main(String[] args) {

		int[] nums = {1, 2, 3, 4, 5, 6, 3, 4, 7};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		for (int e : nums) {
			if (!set.add(e)) {
				System.out.println(e);
			}
		}
	}

}
