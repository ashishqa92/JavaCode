package interviewPracticeQuestions;

public class SwapStrings {

	public static void main(String[] args) {
		// Swap two string without using extra variable?

		String str1 = "Hello";
		String str2 = "World";

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("After swapping: str1=" + str1 + ", str2=" + str2);

	}

}
