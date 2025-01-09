package interviewPracticeQuestions;

public class ReverseStringWords {

	public static void main(String[] args) {
		/*
		 * Write a program to reverse the given string and count the occurance of letter
		 * "a". Ex : String s = "Java programming hello world"; Output : world hello
		 * programming Java a = 3
		 */

		String s = "Java programming hello world for Ashish";
		reverseSentenceEachWord(s);

	}

	public static void reverseSentenceEachWord(String str) {
		String[] words = str.split("\\s+");
		String reverse = "";

		for (int i = words.length - 1; i >= 0; i--) {
			reverse = reverse + words[i] + " ";
		}
		System.out.println(reverse.trim());

		int countA = 0;
		for (char e : str.toCharArray()) {

			if (e == 'a' || e == 'A') {
				countA++;
			}
		}
		System.out.println("count of A is : " + countA);
	}

}
