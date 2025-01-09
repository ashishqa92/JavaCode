package interviewPracticeQuestions;

public class ReverseStringChars {

	/*
	 * Input: "Java programming hello world"
	 * Output: "dlrow olleh gnimmargorp avaJ"
	 */
	public static void main(String[] args) {
		String s = "Java programming hello world";
		reverseStringChar(s);
	}

	public static void reverseStringChar(String s) {
		int length = s.length();
		String reverse = "";
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println(reverse);
	}

}
