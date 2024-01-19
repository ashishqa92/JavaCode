package interviewQuestions;

public class ReverseStringWords {

	public static void main(String[] args) {
		/*
		 * Write a program to reverse the given string and count the occurance of letter
		 * "a". Ex : String s = "Java programming hello world"; Output : world hello
		 * programming Java a = 3
		 */

		String s = "Java programming hello world";
		String[] words = s.split(" ");
		StringBuilder reversed = new StringBuilder();
		
		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]).append(" ");
		}
		String reversedString = reversed.toString().trim();
		System.out.println("Reversed String: " + reversedString);
		
		int countA = 0;
		for (char c : s.toCharArray()) {
			if (c == 'a' || c == 'A') {
				countA++;
			}
		}
		System.out.println("Occurrences of 'a': " + countA);

	}

}
