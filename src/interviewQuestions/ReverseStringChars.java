package interviewQuestions;

public class ReverseStringChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Java programming hello world";
		String reverseString = "";

		int length = s.length();

		for (int i = length - 1; i >= 0; i--) {
			reverseString = reverseString + s.charAt(i);
		}

		System.out.println(reverseString);
	}

}
