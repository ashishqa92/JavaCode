package interviewQuestions;

public class ReverseStringChars {

	public static void main(String[] args) {
		String s = "Java programming hello world";
		reverseStringChar(s);
	}

	public static void reverseStringChar(String str) {
		int length = str.length();
		String reverse = "";
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
	}

}
