package javaInterviewQuestions;

public class ReverseStringWords {

	/*
	 * Write a program to reverse the given string and count the occurance of letter
	 * "a". Ex : String s = "Java programming hello world"; Output : world hello
	 * programming Java a = 3
	 */

	public static void reverseSentenceEachWord(String s) {
		String[] wordArray = s.split("\\s+"); // [Java, programming, hello, world, for, Ashish]
		String reverse = "";
		for (int i = wordArray.length - 1; i >= 0; i--) {
			reverse = reverse + wordArray[i] + " ";
		}
		System.out.println(reverse.trim());

		// count the occurance of letter "a"
		int countA = 0;
		for (char e : s.toCharArray()) {

			if (e == 'a' || e == 'A') {
				countA++;
			}
		}
		System.out.println("count of A is : " + countA);
	}

	public static void main(String[] args) {

		String s = "Java programming hello world for Ashish";
		reverseSentenceEachWord(s);

	}

}
